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
			
			// What data structure should be instantiated here?
			
			for (int u = 0; u < unread; u++) {
				String subject = scanner.nextLine();
				
				// What to do with subject?
			}
			
			List<String> uniqueSubjects = new ArrayList<>(/* your data structure variable here */);
			System.out.printf("%s (%d):%n", inboxName, uniqueSubjects.size());
		}
	}
}
