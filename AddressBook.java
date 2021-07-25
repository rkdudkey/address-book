package tts.addressbook;

import java.util.ArrayList;

public class  AddressBook {

	ArrayList<Entry> dataEntry = new ArrayList<Entry>();

	public void addEntry(Entry newEntry) {
		try {
			this.dataEntry.add(newEntry);
			System.out.println("Added new entry!");
		} catch (Exception e) {
			System.out.println("An error occurs");
		}
		
	}


	public void removeEntry(String userEmail) {
		
		try {
			if (!this.dataEntry.isEmpty()) {
				for (Entry data : this.dataEntry) {
					if (userEmail.equals(data.getEmail())) {
						int index = this.dataEntry.indexOf(data);
						System.out.println("Deleted the following entry:");				
						System.out.println(data);					
						// remove record
						this.dataEntry.remove(index);
						break;
					}
				}
			} else {
				System.out.println("No record in the database");
			}
		} catch (Exception e) {
			 System.out.println("An error occurs");
		}
		

	}

	public void printEntry() {		
		try {
			if (this.dataEntry.isEmpty()) {
				System.out.println("No entry data for this address book");
			} else {
				for (Entry name : this.dataEntry) {
					System.out.println(name);			
				}
			}
		} catch (Exception e) {
			System.out.println("An error occurs");
		}

	}

	public boolean checkEmail(String email) {
		try {
			for (Entry data : this.dataEntry) {
				if (email.equals(data.getEmail())) {
					return true;
				} else {
					return false;
				}
			}

		} catch (Exception e) {
			System.out.println("An error occurs");
		}
		
		return false;
	}

	public void searchFirstName(String firstName) {

		try {
			for (Entry data : this.dataEntry) {
				if (data.getFirstName().substring(0, 1).equals(firstName)) {
					System.out.println(data);
				}
			}
		} catch (Exception e) {
			System.out.println("An error occurs");
		}
		

	}
	
	public void searchLastName(String lastName) {
		try {
			for (Entry data : this.dataEntry) {
				if (data.getLastName().substring(0, 1).equals(lastName)) {
					System.out.println(data);
				}
			}
		} catch (Exception e) {
			System.out.println("Error is occured");
		}
		
	}
	
	public void searchPhoneNumber(String phoneNum) {
		try {
			for (Entry data : this.dataEntry) {
				if (data.getPhoneNumber().substring(0, 1).equals(phoneNum)) {
					System.out.println(data);
				}
			}
		} catch (Exception e) {
			System.out.println("An error occurs");
		}
		
	}
	
	public void searchEmail(String email) {
		try {
			for (Entry data : this.dataEntry) {
				if (data.getEmail().substring(0, 1).equals(email)) {
					System.out.println(data);
				}
			}
		} catch (Exception e) {
			System.out.println("An error occurs");
		}
		
	}
	
}
