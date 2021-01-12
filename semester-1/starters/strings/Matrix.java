import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Matrix {
	
	public static void printLetters(String digits, int lineNumber) {
		/*
		 * Populate this method according to the problem specifications.
		 */
		StringTokenizer tokenizer = /* How to make a StringTokenizer? */;
		while (/* When should this stop? */) {
			String token = /* How do you get the next token? */;
			int ascii = Integer.parseInt(token);
			
			System.out.print(getCharacterFromAsciiCode(ascii));
		}
	}
	
	/*
	 * Surprise surprise! A char in Java is just a `byte` with a
	 * specific meaning. As long as you print a `char`, it will
	 * be written as the character as opposed to its numerical
	 * representation.
	 */
	public static String getCharacterFromAsciiCode(int code) {
		/*
		 * This covers most cases, but still needs some
		 * work to be complete.
		 */
		return Character.toString((char)code);
	}
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int lineNumber = 1;
		while(scanner.hasNextLine()) {
			String digits = scanner.nextLine();
			printLetters(digits, lineNumber);
		}
	}
}
