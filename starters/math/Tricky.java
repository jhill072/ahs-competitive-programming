import java.io.IOException;
import java.util.Scanner;

public class Tricky {
	
	public static class Vector {
		int x, y;
		
		public Vector(int x, int y) {
			this.x = x;
			this.y = y;
		}

                public Vector add(Vector other) {
                        /*
                         * Populate if necessary
                         */
                }

                public Vector subtract(Vector other) {
                        /*
                         * Populate if necessary
                         */
                }
		
		public double dot(Vector other) {
			/*
			 * Populate if necessary
			 */
		}
		
		public double cross(Vector other) {
			/*
			 * Populate if necessary
			 */
		}
	}
	
	public static double getProteinForCracker(Vector a, Vector b, Vector c) {
		/*
		 * Populate this method according to the problem specifications.
		 * Use the Vector class methods when possible.
		 */
	}
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int crackers = scanner.nextInt();
		
		for (int cracker = 1; cracker <= crackers; cracker++) {
			Vector a = new Vector(scanner.nextInt(), scanner.nextInt());
			Vector b = new Vector(scanner.nextInt(), scanner.nextInt());
			Vector c = new Vector(scanner.nextInt(), scanner.nextInt());
			
			double protein = getProteinForCracker(a, b, c);
			System.out.printf("Cracker #%d: %.2f%n", cracker, protein);
		}
	}
}
