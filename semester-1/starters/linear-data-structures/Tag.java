import java.io.IOException;
import java.util.Scanner;

public class Tag {
	
	public static int applyTag(int yourBitmask, int taggedBitmask, int startingBit) {
		/*
		 * Populate according to problem specifications.
		 */
	}
	
	public static int countBits(int bitmask) {
		// Return the number of bits that are on in bitmask.
		// Useful methods for ints can be found here:
		// https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html
	}
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int games = scanner.nextInt();
		for (int g = 0; g < games; g++) {
			int tags = scanner.nextInt();
			int startingBit = scanner.nextInt();
			
			int bitmask = /* Convert startingBit to a bitmask with only that bit on */;
			for (int t = 0; t  < tags; t++) {
				int bitsForTaggedPlayer = scanner.nextInt();
				int taggedBitmask = /* what should the initial mask be? */;
				
				for (int b = 0; b < bitsForTaggedPlayer; b++) {
					int bit = scanner.nextInt();
					taggedBitmask = /* Apply this bit to the tagged mask */;
				}
				
				bitmask = applyTag(bitmask, taggedBitmask, startingBit);
			}
			
			int points = countBits(bitmask);
			System.out.println(points);
		}
	}
}
