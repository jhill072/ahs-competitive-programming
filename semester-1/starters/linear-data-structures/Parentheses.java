import java.io.IOException;
import java.util.Scanner;

public class Parentheses {
	
	public static boolean isMatched(String formula) {
		// What data structure works best here?
		
		for (int ch = 0; ch < formula.length(); ch++) {
			if (formula.charAt(ch) == '(') {
				// What to do?
			} else if (formula.charAt(ch) == ')') {
				// What to do?
			} else if (formula.charAt(ch) == '[') {
				// What to do?
			} else if (formula.charAt(ch) == ']') {
				// What to do?
			} else {
				// Does anything need to happen here?
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int formulas = scanner.nextInt();
		
		/*
		 * THIS IS IMPORTANT!!!
		 * 
		 * The reason this is necessary is that technically the
		 * scanner ends immediately after the end of the number.
		 * This means there is still a new line that will be
		 * coming after the number of formulas. Since we need
		 * to read input line by line, this extra new line
		 * must be taken care of first.
		 */
		scanner.nextLine();
		
		/*
		 *  A technique if you don't like to make variables. Good
		 *  for the really quick problems since less code means
		 *  faster submission time, which means better chance for
		 *  a balloon!
		 */
		for (; formulas > 0; formulas--) {
			String formula = scanner.nextLine();
			if (isMatched(formula)) {
				System.out.println("Formula checks out!");
			} else {
				System.out.println("Formula fails inspection!");
			}
		}
	}
}
