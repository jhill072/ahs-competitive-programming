import java.util.Scanner;

public class Monorail {
	
	static boolean[][] hasPothole;
	static int endX, endY;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		
		for (int day = 1; day < days; day++) {
			int height = scanner.nextInt();
			int width = scanner.nextInt();
			int potholes = scanner.nextInt();
			int errands = scanner.nextInt();
			
			hasPothole = new boolean[height][width];
			for (int p = 0; p < potholes; p++) {
				// The grid is 1-based, so convert to 0-based.
				int x = scanner.nextInt() - 1;
				int y = scanner.nextInt() - 1;
				
				hasPothole[y][x] = true;
			}
			
			System.out.printf("Errands in Springfield, day %d:%n", day);
			for (int e = 0; e < errands; e++) {
				// The grid is 1-based, so convert to 0-based.
				int startX = scanner.nextInt() - 1;
				int startY = scanner.nextInt() - 1;
				endX = scanner.nextInt() - 1;
				endY = scanner.nextInt() - 1;
				
				// Make your choice!
				/*
				if (dfs(startX, startY)) {
					System.out.println("A road is clear, you are good to boycott!");
				} else {
					System.out.println("Sorry Marge, monorail it is!");
				}
				*/
				
				/*
				if (bfs(startX, startY)) {
					System.out.println("A road is clear, you are good to boycott!");
				} else {
					System.out.println("Sorry Marge, monorail it is!");
				}
				*/
			}
			
			System.out.println();
		}
	}
	
	static boolean dfs(int x, int y) {
		// Have we reached the target?
		// Have we been here before?
		// Is this a legal location?
		// What about the adjacent intersections?
		
		return false;
	}
	
	static boolean bfs(int x, int y) {
		// Initialize your queue.
		
		// Have we reached the target?
		// Have we been here before?
		// Is this a legal location?
		// What about the adjacent intersections?
		
		// If we reach here, then it was not possible.
		return false;
	}
}
