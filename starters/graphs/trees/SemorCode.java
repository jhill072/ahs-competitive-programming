import java.util.Scanner;

public class SemorCode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String operation = scanner.next();
		
		int cases = scanner.nextInt();
		for (int c = 0; c < cases; c++) {
			Node root = new Node(5);
			int letters = scanner.nextInt();
			String rootCh = scanner.next();
			root.value = rootCh.charAt(0);
			for (int i = 0; i < letters; i++) {
				String location = scanner.next();
				String ch = scanner.next();
				
				Node node = root.find(location);
				node.value = ch.charAt(0);
			}
			
			if (operation.equals("print")) {
				int queries = scanner.nextInt();
				for (int q = 0; q < queries; q++) {
					String location = scanner.next();
					Node n = root.find(location);
					
					System.out.println(Character.toString(n.value));
				}
			} else if (operation.equals("preorder")) {
				root.preorder();
				System.out.println();
			} else if (operation.equals("inorder")) {
				root.inorder();
				System.out.println();
			} else if (operation.equals("postorder")) {
				root.postorder();
				System.out.println();
			} else if (operation.equals("height")) {
				int heights = scanner.nextInt();
				for (int h = 0; h < heights; h++) {
					String location = scanner.next();
					Node n = root.find(location);
					
					System.out.println(n.height());
				}
			}
		}
	}
	
	public static class Node {
		private Node left, right;
		private Character value;
		
		/*
		 * Creates a new Node of the given height.
		 * Do not touch this code.
		 */
		public Node(int height) {
			if (height > 0) {
				left = new Node(height - 1);
				right = new Node(height - 1);
			}
		}
		
		/*
		 * This method should return the node found by following "location"
		 * from this particular node. For instance, if the "location" was
		 * ".-.", then we would want `this.left.right.left`, for example.
		 * When the location is empty, we should return this.
		 */
		public Node find(String location) {
			return this; // But only when location is empty!
		}
		
		/*
		 * Print each character using "preorder" traversal from
		 * this node onward.
		 */
		public void preorder() {
			
		}
		
		/*
		 * Print each character using "inorder" traversal from
		 * this node onward.
		 */
		public void inorder() {
			
		}
		
		/*
		 * Print each character using "postorder" traversal from
		 * this node onward.
		 */
		public void postorder() {
			
		}
		
		/*
		 * Return the height of the tree rooted from this node.
		 */
		public int height() {
			return 0;
		}
	}
}
