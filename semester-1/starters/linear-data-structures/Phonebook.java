import java.io.IOException;
import java.util.Scanner;

public class Phonebook {
	
	public static class Friend implements /* How to let Java know this class is sortable? */ {
		/*
		 *  I mark these as "final" so I don't accidentally override them
		 *  somewhere else in the program.
		 */
		final String phoneNumber;
		final String firstName;
		final String lastName;
		
		public Friend(String phoneNumber, String firstName, String lastName) {
			this.phoneNumber = phoneNumber;
			this.firstName = firstName;
			this.lastName= lastName; 
		}
		
		/*
		 * This will be what is printed whenever this gets converted
		 * into a String. For example: System.out.print(friend), or
		 * String string = "Prefix: " + friend.
		 */
		public String toString() {
			// This is exactly what printf uses for formatting too!
			return String.format("%s, %s: %s", lastName, firstName, phoneNumber);
		}
		
		public int compareTo(Friend other) {
			/*
			 * Populate according to how two friends should be ordered.
			 * Remember the number does not matter as long as it is
			 * either < 0, = 0, or > 0 (each with different meanings).
			 */
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int friendCount = scanner.nextInt();
		
		/*
		 * Which of the following is better in this case?
		 * See which one you prefer!
		 */
		
		// List<Friend> friends = ...
		// Friend[] friends = ...
		
		for (int i = 0; i < friendCount; i++) {
			Friend friend = new Friend(scanner.next(), scanner.next(), scanner.next());
			// Add friend to `friends`
		}
		
		// How do you sort friends?
		
		for (Friend friend : friends) {
			System.out.println(friend);
		}
	}
}
