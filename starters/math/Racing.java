import java.io.IOException;
import java.util.Scanner;

public class Racing {
	
	public static class Vector {
		int x, y;
		public Vector(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public Vector add(Vector other) {
			// Populate if necessary
		}
		
		public Vector subtract(Vector other) {
			// Populate if necessary
		}
		
		public double dot(Vector other) {
			// Populate if necessary
		}
		
		public double cross(Vector other) {
			// Populate if necessary
		}
	}
	
	public static double angleBetween(Vector before, Vector at, Vector after) {
		/*
		 * Populate according to the problem specifications.
		 * Use the vector methods whenever possible.
		 */
	}
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		int races = scanner.nextInt();
		for (int race = 1; race <= races; race++) {
			int turns = scanner.nextInt();
			Vector[] points = new Vector[turns];
			for (int t = 0; t < turns; t++) {
				points[t] = new Vector(scanner.nextInt(), scanner.nextInt());
			}
			
			int sharpestTurn = 1;
			
			// Populate the starting value for the sharpestAngle
			double sharpestAngle = ??;
			for (int i = 0; i < turns; i++) {
				// Neat trick to always get the previous value of an array,
				// even if you are considering the first point.
				Vector pointBefore = points[(i + turns - 1) % turns];
				Vector pointAt = points[i];
				
				// This allows you to "wrap around" the array to the beginning
				// when you reach the end.
				Vector pointAfter = points[(i + 1) % turns];
				
				double angle = angleBetween(pointBefore, pointAt, pointAfter);
				if (angleSharperThan(angle, sharpestAngle)) {
					sharpestTurn = i;
					sharpestAngle = angle;
				}
			}
			
			System.out.printf("Race #%d: Turn %d is the most exciting!%n", race, sharpestTurn);
		}
	}
}
