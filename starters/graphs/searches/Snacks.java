import java.util.ArrayList;
import java.util.Scanner;

public class Snacks {
	
	static ArrayList<Integer>[] map;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int parks = scanner.nextInt();
		for (int p = 0; p < parks; p++) {
			int locations = scanner.nextInt();
			int trails = scanner.nextInt();
			
			map = new ArrayList[locations];
			for (int i = 0; i < locations; i++) {
				// Start each location off assuming no trails connect it.
				map[i] = new ArrayList<Integer>();
			}
			
			for (int i = 0; i < trails; i++) {
				// Locations are 1-based, so subtract 1 to reach 0-based.
				int u = scanner.nextInt() - 1;
				int v = scanner.nextInt() - 1;
				
				// Trails are bidirectional
				map[u].add(v);
				map[v].add(u);
			}
			
			// Make your choice!
			/*
			if (dfs(0)) {
				System.out.println("Time to book!");
			} else {
				System.out.println("Maybe another park?");
			}
			*/
			
			/*
			if (bfs()) {
				System.out.println("Time to book!");
			} else {
				System.out.println("Maybe another park?");
			}
			*/
		}
	}
	
	// Determine if its possible to assign a snack type
	// to this location... how do we know which snack to assign this one?
	static boolean dfs(int index) {
		// Have we been here before?
		// If so, are we the proper snack?
		// What about each of the neighboring locations?
		
		return true;
	}
	
	static boolean bfs() {
		// Initialize your queue.
		// How to track which locations should get which snacks?
		
		// Process the queue.
		// Have we been here before?
		// If so, are we the proper snack?
		// What about each of the neighboring locations?
		
		// If we get here, then we did not find a contradiction, so it was possible!
		return true;
	}
}
