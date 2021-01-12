import java.util.Scanner;

public class PrimsStarter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nodes = scanner.nextInt();
		int edges = scanner.nextInt();
		
		// Initialize adjacency list
		ArrayList<Edge>[] graph = new ArrayList[nodes];
		for (int i = 0; i < nodes; i++) {
			graph[i] = new ArrayList<>();
		}

		// Read in your adjacency list
		for (int i = 0; i < edges; i++) {
			int u = scanner.nextInt();
			int v = scanner.nextInt();
			int weight = scanner.nextInt();
			
			graph[u].add(new Edge(v, weight));
			graph[v].add(new Edge(u, weight));
		}
		
		// Total weight of the tree
		int totalWeight = 0;
		
		// We need some form of queue to process the available Edges such that we
		//   process them from least weight to most weight
		// We also need some form of structure that tells us which nodes have been
		//   included in the tree thus far.
		
		// Initialize the queue with our first edge... perhaps 0?
		while (!queue.isEmpty()) {
			Edge current = queue.poll();
			
			// If we've already included the node in the tree, we can skip it
			// Otherwise, we can include it as part of the tree.
			
			for (int i = 0; i < map[current.to].size(); i++) {
				Edge next = map[current].get(i);
				// If we've already included the node in the tree, we can skip it
				// Otherwise add it to the queue!
			}
		}
		
		System.out.println(totalWeight);
	}
	
	// What makes one Edge a better choice than another Edge?
	// How can we tell Java this?
	public static class Edge {
		int to;
		int weight;
		
		public Edge(int to, int weight) {
			this.to = to;
			this.weight = weight;
		}
		
	}
}
