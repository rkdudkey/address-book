package tts.addressbook;

import java.util.Scanner;

public class Main {
	
	public static  void inputAddEntry(String firstName, String lastName, String phoneNum, String email, Scanner in, AddressBook user) {
		
		try {
			System.out.println("Add an entry ");
			System.out.println("Enter first name: ");
			firstName = in.next();
			System.out.println("Enter last name: ");
			lastName = in.next();
			System.out.println("Enter phone number: ");
			phoneNum = in.next();
			System.out.println("Enter email: ");
			email = in.next();

			while (user.checkEmail(email) == true) {
				System.out.println("This email is already exist");
				System.out.println("Enter new email: ");
				email = in.next();
			}
			
			user.addEntry(new Entry(firstName, lastName, phoneNum, email));
		}catch(Exception e) {
			System.out.println("an error occurs");
		}
		
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		AddressBook user = new AddressBook();

		while (true) {
			System.out.println("1. Add an entry");
			System.out.println("2. Remove an entry");
			System.out.println("3. Search for a specific an entry");
			System.out.println("4. Print Address Book");
			System.out.println("5. Delete Book");
			System.out.println("6. Quit");

			System.out.println("Please choose what you'd like to do with the database:");

			int choice = in.nextInt();
			String firstName = "";
			String lastName = "";
			String phoneNum = "";
			String email ="";

			switch (choice) {
			case 1:
				
				if(user != null) {
					inputAddEntry(firstName,lastName,phoneNum, email,in,user);
				}else {
				//recreate address book after deletion
					user = new AddressBook();
					inputAddEntry(firstName,lastName,phoneNum, email,in,user);
				}
				break;
				
			case 2:
				System.out.println("Remove an entry");
				System.out.println("Enter an entry's email to remove: ");
				email = in.next();
				user.removeEntry(email);
				break;
			case 3:
				System.out.println("Search for a specific an entry");
				System.out.println("1. First Name ");
				System.out.println("2. Last Name ");
				System.out.println("3. Phone Number ");
				System.out.println("4. Email Address ");
				System.out.println("Chose a search type: ");
				int search = in.nextInt();

				switch (search) {
				case 1:
					System.out.println("Enter your search: ");
					String firstNameSearch = in.next();
					user.searchFirstName(firstNameSearch);
					break;
				case 2:
					System.out.println("Enter your search: ");
					String lastNameSearch = in.next();
					user.searchLastName(lastNameSearch);
					break;
				case 3:
					System.out.println("Enter your search: ");
					String phoneNumSearch = in.next();
					user.searchPhoneNumber(phoneNumSearch);
					break;
				case 4:
					System.out.println("Enter your search: ");
					String emailSearch = in.next();
					user.searchEmail(emailSearch);
					break;
				default:
					break;
				}
				break;
			case 4:
				System.out.println("Print Address Book");
				if (user != null) {
					user.printEntry();
				} else {
					System.out.println("No data in this address book");
				}
				
				break;
			case 5:
				System.out.println("Delete Book");
				user = null;
				System.gc();
				System.out.println("Address Book is empty!");
				break;
			case 6:
				System.out.println("Quit");
				System.exit(0);
				break;
			default:
				break;
			}

		}
	}

}
