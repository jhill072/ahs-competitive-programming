import java.io.IOException;

public class Debug {
	/*
	 * Populate the comments with the appropriate code.
	 * 
	 * Take note of the output printing and how the different
	 * types of data can be printed through `printf()`.
	 */
	public static void main(String[] args) throws IOException {
		// How to read from standard input?
		
		int wordCount = 0;
		while(/* What is the terminating condition? */) {
			if (wordCount % 4 == 0) {
				int number = /* Read an integer */;
				System.out.printf("Integer: %d%n", number);
			} else if (wordCount % 4 == 1) {
				double decimal = /* Read a double */;
				System.out.printf("Double: %f%n", decimal);
			} else if (wordCount % 4 == 2) {
				String word = /* Read a string */;
				System.out.printf("String: %s%n", word);
			} else {
				long bigNumber = /* Read a long */;
				System.out.printf("Long: %d%n", bigNumber);
			}
		}
	}
}
