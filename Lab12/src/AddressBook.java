/**
 * Project_03
 * Object-Oriented Programming, CSE 271, Spring 2020
 * @author Ethan Gutknecht
 */

//imports
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	//variables
	static Scanner keyboard = new Scanner(System.in);
	static ArrayList<Contact> dataBase = new ArrayList<Contact>();
	
	/**
	 * Main driver for the program.
	 */
	public static void main(String[] args) {
	
	
	int userIntChoice = 0;
	
		while (true) {
			try {
			System.out.println("Address book operations:");
			System.out.println("1. Add");
			System.out.println("2. Remove");
			System.out.println("3. Save");
			System.out.println("4. Load");
			System.out.println("5. Display All");
			System.out.println("6. Search");
			System.out.println("7. Exit");
			
			System.out.print("Select an option (number): ");
			userIntChoice = keyboard.nextInt();
			}
			catch (Exception e) {
				System.out.println("---Failed to prompt user with options---");
			}
		
			
			if (userIntChoice == 1) { //add
				boolean successful = add();
				if (successful == true) System.out.println("Adding contact was successful");
				else System.out.println("Adding contact failed.");
			}
			else if (userIntChoice == 2) { //remove
				boolean successful = remove();
				if (successful == true) System.out.println("Removing contact was successful");
				else System.out.println("Removing contact failed.");
			}
			else if (userIntChoice == 3) { //save
				save(dataBase);
			}
			else if (userIntChoice == 4) { //load
				load();
			}
			else if (userIntChoice == 5) { //display all
				displayAll();
			}
			else if (userIntChoice == 6) { //search
				search();
			}
			else if (userIntChoice == 7) { //exit
				save(dataBase);
				System.out.println("Exiting...");
				keyboard.close();
				break;
			}
			else { //invalid input
				System.out.println("Invalid input.");
			}
			System.out.println(""); //adds a break between operations
			System.out.println(""); //adds a break between operations
		}
	}

	
	
	/** adds contact to array list with no duplicating phone numbers
	 * @return Boolean - if successful then true
	 */
	public static boolean add() {
		String firstNameToAdd, lastNameToAdd, phoneNumberToAdd, emailToAdd, addressToAdd;
		boolean contactAlreadyExists = false;
		System.out.print("First name: ");
		firstNameToAdd = keyboard.next();
		System.out.print("Last name: ");
		lastNameToAdd = keyboard.next();
		System.out.print("Phone number: ");
		phoneNumberToAdd = keyboard.next();
		System.out.print("Email: ");
		emailToAdd = keyboard.next();
		System.out.print("Address: ");
		addressToAdd = keyboard.next();
		
		for (int i = 0; i < dataBase.size(); i++) {
			if (dataBase.get(i).phoneNumber.equalsIgnoreCase(phoneNumberToAdd)) contactAlreadyExists = true;
		}
		if (contactAlreadyExists == false) {
			Contact contactToAdd = new Contact(firstNameToAdd, lastNameToAdd, phoneNumberToAdd, emailToAdd, addressToAdd);
			dataBase.add(contactToAdd);
			return true;
		}
		else return false;
	}

	
	
	/** remove contact from array list
	 * @return boolean - If successful then true
	 */
	public static boolean remove() {
		System.out.print("Phone number of contact to remove: ");
		String phoneNumberToRemove = keyboard.next();
		int indexOfRemovedContact = -1;
		
		for (int i = 0; i < dataBase.size(); i++) {
			if (dataBase.get(i).phoneNumber.equalsIgnoreCase(phoneNumberToRemove)) {
				indexOfRemovedContact = i;
				break;
			}
		}
		
		
		if (indexOfRemovedContact >= 0) {
			dataBase.remove(indexOfRemovedContact);
			return true;
		}
		else return false;
	}
	
	
	/**
	 * Creates save code for address book.
	 */
	public static void save(ArrayList<Contact> listToSave) {
		try {
			FileOutputStream fileos = new FileOutputStream("addressbook.dat");
		    ObjectOutputStream objectos = new ObjectOutputStream(fileos);
		    
		    objectos.writeObject(listToSave);
		    objectos.close();
		    fileos.close();
		    System.out.println("Save file successfully.");
		}
		catch (IOException e) {
			System.out.println("Failed to save file.");
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Creates load code for address book.
	 */
	@SuppressWarnings("unchecked")
	public static void load() {
		ArrayList<Contact> loadedContacts;
		try {
			FileInputStream rD = new FileInputStream("addressbook.dat");
	        ObjectInputStream rS = new ObjectInputStream(rD);

	        loadedContacts = (ArrayList<Contact>) rS.readObject();
	        rD.close();
	        rS.close();
	        
	        System.out.println("Loaded contacts:");
	        for (int i = 0; i < loadedContacts.size(); i++) {
				System.out.println(loadedContacts.get(i).toString());
			}
	        
		}
		catch (Exception e){
			System.out.println("Failed to read contact file.");
		}
		
	}
	
	
	/**
	 * Creates display all code for the address book.
	 */
	public static void displayAll() {
		for (int i = 0; i < dataBase.size(); i++) {
			System.out.println(dataBase.get(i).toString());
		}
	}
	
	
	/*
	 * Creates search code for the addressbook.
	 */
	public static void search() {
		System.out.print("Target search: ");
		String termToSearch = keyboard.next().toLowerCase();
		
		System.out.println("Search Results:");
		for (int i = 0; i < dataBase.size(); i++) {
			if (dataBase.get(i).toString().toLowerCase().contains(termToSearch) == true) {
				System.out.println(dataBase.get(i));
			}
		}
	}
}
