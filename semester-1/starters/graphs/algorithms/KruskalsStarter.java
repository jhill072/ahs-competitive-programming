import java.util.List;
import java.util.Scanner;

public class KruskalsStarter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nodeCount = scanner.nextInt();
		int edgeCount = scanner.nextInt();
		
		// We don't actually have to build much of a graph,
		//   we just need to track all of the edges.
		List<Edge> edges;
		for (int i = 0; i < edgeCount; i++) {
			int from = scanner.nextInt();
			int to = scanner.nextInt();
			int weight = scanner.nextInt();
			
			edges.add(new Edge(from, to, weight));
		}
		
		// Make sure the edges are in order from smallest to largest!
		
		// Total weight of the tree
		int totalWeight = 0;
		
		// We need some form of data structure to know when we might make a cycle.
		DisjointSet disjointSet = new DisjointSet(nodeCount);
		
		for (int i = 0; i < edgeCount; i++) {
			Edge edge = edges.get(i);
			
			// Check if including this edge will make a cycle.
			// If it will, skip it.
			// If it won't, include it.
		}
		
		System.out.println(totalWeight);
	}
	
	// The DisjointSet keeps track of the "parent" of each node.
	// By default, the parent of each node should be themselves.
	public static class DisjointSet {
		
		int[] rank;
		
		public DisjointSet(int nodes) {
			rank = new int[nodes];
		}
		
		// `node`: the node to retrieve the parent for.
		// If the parent of the node is itself, then it is just themselves.
		// Otherwise, find the parent of your parent.
		// Make sure to note that parent for later use!
		public int find(int node) {
			
		}
		
		// Combine the two nodes a and b.
		// Assign a new parent to either a or b.
		//   Choose the parent based on which one has the higher rank.
		//   If a's rank is greater than b's, then a should become b's parent.
		//   Ties can go either way, but whichever you choose needs to have their rank increased ONLY WHEN THE RANKS ARE TIED.
		public void union(int a, int b) {
			if (rank[a] > rank[b]) {
				// Make B's parent A
			} else {
				// Make A's parent B
			}
			
			if (rank[a] == rank[b]) {
				// In this case, we are making A's parent B, so B's rank must increase
				rank[b]++;
			}
		}
	}
	
	// What makes one Edge a better choice than another Edge?
	// How can we tell Java this?
	public static class Edge {
		int from;
		int to;
		int weight;
		
		public Edge(int from, int to, int weight) {
			this.from = from;
			this.to = to;
			this.weight = weight;
		}
		
	}
}
