// Subsets are decisions on when to include an object in a
// group or not, applied to the whole group. For example,
// whether or not to include nodes in a graph to see if
// all of those nodes are connected to each other. There
// are two ways to use subsets, recursively and iteratively.
public class Subsets {
	// As a start, let's assume we have an array of numbers.
	// We want to know if we can use a subset of them to sum
	// to another target number, such as 17 (1 + 6 + 10).
	static int[] nums = { 1, 4, 6, 10, 15 };
	
	// Using the recursive approach, we move along the array
	// and apply the decision as we go. In this case, we
	// change the target number to account for the numbers
	// we've included in our set so far. This method will
	// check if it is possible to reach the target.
	public boolean recursiveSubsets(int index, int target) {
		// First check the target. If it is 0, we are done!
		// If it is negative, we've gone too far.
		if (target == 0) {
			return true;
		}
		
		if (target < 0) {
			return false;
		}
		
		// Also check to make sure we have numbers left to decide on.
		if (index >= nums.length) {
			// No more numbers...
			return false;
		}
		
		// Now decide if we use nums[index] or not.
		// Let's try using it:
		if (recursiveSubsets(index + 1, target - nums[index])) {
			// Using this index worked!
			return true;
		}
		
		// Using this number did not work, so let's try skipping it.
		if (recursiveSubsets(index + 1, target)) {
			// There was a solution without this number!
			return true;
		}
		
		// At this point, whether we use this number or not, we cannot
		// reach `target` given the current values in `nums`.
		return false;
	}
	
	// When you consider the worst-case runtime of the above solution,
	// it becomes clear that at each index of `nums`, you have two
	// choices. This equates to 2 * 2 * 2 ... N times, or 2^n. These
	// decisions can also be represented as a number in binary.
	// Including the number can be a 1 in that index, and a 0
	// otherwise. This solution uses this pattern to generate entire
	// subsets before traversing the array.
	public boolean iterativeSubsets(int target) {
		// Bit shifting left is the same as multiplying by 2.
		// In this case, we are bit-shifting N times, to give
		// us our grand total of 2^N.
		int numberOfSubsets = 1 << nums.length;
		
		// Number of subsets, in this example, is 100000 in binary.
		// If we go through each number BELOW that, we will also
		// generate every possible choice of 5 items.
		for (int bitmask = 0; bitmask < numberOfSubsets; bitmask++) {
			// Call other method to find the sum of included numbers
			int sum = generateSumFromBitmask(bitmask);
			
			// Check if it matches the target
			if (sum == target) {
				return true;
			}
		}
		
		// If we get here, none of the subsets worked.
		return false;
	}
	
	public int generateSumFromBitmask(int bitmask) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			// We only include nums[i] in the sum if the matching
			// bit is turned on. First we generate a binary number
			// with a single 1 in the target index. Then, after
			// using & with the bitmask, there are only two
			// possibilities: it is equal to 1 << i or 0 (since
			// anything & 0 is always 0).
			if (((1 << i) & bitmask) > 0) {
				sum += nums[i];
			}
		}
		
		return sum;
	}
}
