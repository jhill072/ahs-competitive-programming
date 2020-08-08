import java.io.IOException;
import java.util.Scanner;

public class Juicedratics {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		findSolutions(a, b, c);
	}
	
	public static void findSolutions(int a, int b, int c) {
		/*
		 * Solve the quadratic equation here.
		 * Set the variables to their appropriate values,
		 * and beware the print statements may not always be necessary!
		 */
		
		double smallerSolution = ??;
		double largerSolution = ??;
		
		System.out.printf("%.4f%n", smallerSolution);
		System.out.printf("%.4f%n", largerSolution);
	}
}
