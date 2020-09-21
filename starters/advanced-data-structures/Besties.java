import java.util.Scanner;

public class Besties {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int classes = scanner.nextInt();
		for (int c = 0; c < classes; c++) {
			int pairs = scanner.nextInt();
			int queries = scanner.nextInt();
			
			// Initialize a data structure that can match besties together
			for (int pair = 0; pair < pairs; pair++) {
				String friend1 = scanner.next();
				String friend2 = scanner.next();
				
				// How to associate friend1 and friend2 as besties?
			}
			
			for (int q = 0; q < queries; q++) {
				String student1 = scanner.next();
				String student2 = scanner.next();
				
				boolean besties /* Determine if student1 and student2 are besties */;
				System.out.printf("%s and %s are%s besties!", student1, student2, besties ? "" : " not");
			}
			
			System.out.println();
		}
	}
}
