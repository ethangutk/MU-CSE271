/**
 * Project_03
 * Object-Oriented Programming, CSE 271, Spring 2020
 * @author Ethan Gutknecht
 */


public class Contact {
	//variables
	public String firstName, lastName, phoneNumber, email, address;
	
	
	/**
	 * empty constructor of contact - fills all info with null
	 */
	public Contact() {
		this.firstName = null;
		this.lastName = null;
		this.phoneNumber = null;
		this.email = null;
		this.address = null;
	}

	
	/**
	 * @param firstName - first name of new contact
	 * @param lastName - last name of new contact
	 * @param phoneNumber - phone number of new contact
	 * @param email - email of new contact
	 * @param address - address of new contact
	 */
	public Contact(String firstName, String lastName, String phoneNumber, String email, String address){
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}
	
	
	/**
	 * @return String - string of all contacts info
	 */
	public String toString() {
		return (this.firstName + " " + this.lastName + ", " + this.address + ", " + this.email + ", " + this.phoneNumber);
	}
	
	
	/**
	 * @param otherObject - Object to compare
	 * @return boolean - true if they are equal
	 */
	public boolean equals(Contact otherObject) {
		boolean rv = true;
		if (otherObject != null && otherObject instanceof Contact) { //checks all variables of object
			Contact otherContact =  (Contact)otherObject;
			if (this.firstName != otherContact.firstName) rv = false;
			if (this.lastName  != otherContact.lastName) rv = false;
			if (this.address  != otherContact.address) rv = false;
			if (this.email  != otherContact.email) rv = false;
			if (this.phoneNumber  != otherContact.phoneNumber) rv = false;
		}
		else rv = false; //false if its not a contact object
		return rv;
	}
}
