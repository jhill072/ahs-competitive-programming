import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cases = scanner.nextInt();
		for (int c = 0; c < cases; c++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			int gcd = gcd(a, b);
			
			System.out.println(gcd);
		}
	}
	
	private static int gcd(int a, int b) {
		/*
		 Determine the greatest common divisor of a and b
		 */
	}
}
