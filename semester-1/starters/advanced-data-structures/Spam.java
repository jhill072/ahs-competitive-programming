import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inboxes = scanner.nextInt();
		for (int inbox = 0; inbox < inboxes; inbox++) {
			String inboxName = scanner.next();
			int unread = scanner.nextInt();
			scanner.nextLine(); // Move cursor to the next line

			// This will track the order (since sets and maps do not guarantee order)
			List<String> uniqueSubjects = new ArrayList<>();
			
			// What data structure should be instantiated here?
			
			for (int u = 0; u < unread; u++) {
				String subject = scanner.nextLine();
				
				// What to do with subject?
				if (/* Subject is unique */) {
					uniqueSubjects.add(subject);
				}
			}
			
			System.out.printf("%s (%d):%n", inboxName, uniqueSubjects.size());
			for (int i = 0; i < uniqueSubjects.size(); i++) {
				System.out.println(uniqueSubjects.get(i));
			}
			
			System.out.println();
		}
	}
}
