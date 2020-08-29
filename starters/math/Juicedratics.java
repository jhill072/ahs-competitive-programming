import java.io.IOException;
import java.util.Scanner;

public class Juicedratics {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		findSolutions(a, b, c);
	}
	
	public static void findSolutions(double a, double b, double c) {
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
