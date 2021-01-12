import java.util.Scanner;

public class Arena {
	static char[][] map;
	static boolean[][] used;
	static int height, width;
	static int distance;

	static int targetRow, targetColumn;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arenas = scanner.nextInt();
		
		for (int a  = 0; a < arenas; a++) {
			height = scanner.nextInt();
			width = scanner.nextInt();
			distance = scanner.nextInt();
			
			int startRow = -1, startColumn = -1;
			map = new char[height][width];
			for (int i = 0; i < height; i++) {
				String line = scanner.next();
				for (int j = 0; j < width; j++) {
					map[i][j] = line.charAt(j);
					if (map[i][j] == 'S') {
						// Start here
					} else if (map[i][j] == 'G') {
						// End here
					}
				}
			}
			
			used = new boolean[height][width];
			// Make your choice!
			/*
			if (dfs(startRow, startColumn)) {
				System.out.println("The robot is smart enough to find the goal!");
			} else {
				System.out.println("The robot is lost!");
			}
			*/
			
			/*
			if (bfs(startRow, startColumn)) {
				System.out.println("The robot is smart enough to find the goal!");
			} else {
				System.out.println("The robot is lost!");
			}
			*/
		}
	}
	
	static boolean dfs(int row, int column) {
		// Did we make it?
		// Have we been here before?
		// Are we in a legal position?
		// Where can we go from here?
		return false;
	}
	
	static boolean bfs(int row, int column) {
		// Initialize your queue(s)
		
		// Did we make it?
		// Have we been here before?
		// Are we in a legal position?
		// Where can we go from here?
		
		// If we've reached this point, then all options have been exhausted.
		return false;
	}
}
