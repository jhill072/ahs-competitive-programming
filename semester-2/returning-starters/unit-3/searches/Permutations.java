// Permutations are a distinct ordering of a group of objects.
// With this algorithm, we don't permute the objects
// themselves, but rather permute indexes of those objects.
// Instead of producing all orderings of the word "monster",
// we'd generate all permutations of {0, 1, 2, 3, 4, 5, 6}
// and use those to produce an ordering of characters.
public class Permutations {
	// This method will recursively generate all permutations
	// of numbers from 0 to indexes.length - 1
	//
	// indexes = the 0-based indexes
	// index = current location of indexes we are to place data in next
	// used = which indexes we've already put into the array
	public void permute(int[] indexes, int index, boolean[] used) {
		// See if we are done generating a permutation
		if (index >= indexes.length) {
			// Use the generated indexes for something.
			validate(indexes);
			return;
		}
		
		// Place all possibilities of unused indexes into the array
		for (int i = 0; i < indexes.length; i++) {
			// Check if we haven't included this index yet
			if (!used[i]) {
				// Generate a permutation with i in this index
				used[i] = true;
				indexes[index] = i;
				permute(indexes, index + 1, used);
				
				// Remove i from used to allow it to be used in
				// future permutations.
				used[i] = false;
			}
		}
	}
	
	// This method takes a permutation of an array from 0...n
	// This could be used to traverse a graph, or produce an
	// ordering of n other numebrs, etc.
	public void validate(int[] indexes) {
		// For example, perhaps we have an array of numbers
		int[] nums = {1, 4, 6, 10, 15};
		
		// We may want to check which ordering produces the greatest
		// sum of differences. For example, the current ordering
		// gives us |1-4| + |4-6| + |6-10| + |10 -15| = 14
		
		int sum = 0;
		for (int i = 1; i < nums.length; i++) {
			// Instead of using i as our index, just reference
			// indexes[i] instead
			int prevIndex = indexes[i - 1];
			int thisIndex = indexes[i];
			sum += Math.abs(nums[prevIndex] - nums[thisIndex]);
		}
		
		// Now check previous sums, or make some other decision
	}
}
