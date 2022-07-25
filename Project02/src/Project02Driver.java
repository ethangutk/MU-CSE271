import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;




public class Project02Driver {
	//variables
	
	
	
	
	
	/**
	 * @param fileName (String) This is the file name that will be read
	 * @return Account[] New accounts read off of file are put into this array
	 */
	public static Account[] readAccountsFromFile(String fileName) {
		ArrayList<String> accountStrings = new ArrayList<String>();
		
		
		//Try catch block creates an array list of the strings
		//from the accounts.txt file, later they will be
		//formated to account objects
		try {
			File file = new File(fileName);
			Scanner inputFile = new Scanner(file);
			while (inputFile.hasNextLine()) accountStrings.add(inputFile.nextLine());
			inputFile.close();
		}
		catch (Exception e){
			System.out.println("Failed to read " + fileName + " file.");
		}
		
		
		//STRING FORMAT: "(0)name, (1)streetNumber streetName, 
		//				  (2)city, (3)state, (4)zipCode, (5)ssn, (6)balance"      
		//Everytime this loop runs, a new account will be made and added to
		//the account Array.
		
		int arraySize = 0;
		for (int i = 0; i < accountStrings.size(); i++) {
			if (accountStrings.get(i).length() > 8) arraySize++;
		} //filtering out the blank lines if there is any

		Account[] returnAccountArray = new Account[arraySize];
		for (int i = 0; i < arraySize; i++) {
				//variables
			int tempstoragestreetNumber = 0;
			String tempstoragename, tempstoragestreetName, tempstoragecity, tempstoragestate, tempstoragezipCode, tempstoragessn;
			double tempstoragebalance;
			
			//CREATING VARIABLES TO PUT IN NEW ACCOUNT OBJECT
			String[] dataTempStorage = accountStrings.get(i).split(", "); //splits everything else
			
			tempstoragename = dataTempStorage[0]; //creates name value 
			
			String stringStorage = "";
			for (int charIndex = 0; charIndex < dataTempStorage[1].length(); charIndex++) { //creates street number and name values
				if (dataTempStorage[1].charAt(charIndex) == ' ') {
					tempstoragestreetNumber = Integer.parseInt(stringStorage);
					tempstoragestreetName = dataTempStorage[1].substring(charIndex + 1);
					break;
				}
				else stringStorage += dataTempStorage[1].charAt(charIndex);
			}
			
			tempstoragecity = dataTempStorage[2]; //creates city value
			tempstoragestate = dataTempStorage[3]; //creates state value
			tempstoragezipCode = dataTempStorage[4]; //creates zipCode value
			tempstoragessn = dataTempStorage[5]; //creates SSN value
			tempstoragebalance = Double.parseDouble(dataTempStorage[6]); //creates balance value
			
			
			
			
			//Make new account
			Address newAccountAddress = new Address(tempstoragestreetNumber, tempstoragename, tempstoragecity, tempstoragestate, tempstoragezipCode);
			Customer newAccountCustomer = new Customer(tempstoragename, newAccountAddress, tempstoragessn);
			Account newAccount = new Account(newAccountCustomer, tempstoragebalance);
			
			//add account made to return array
			returnAccountArray[i] = newAccount;
		}
		return returnAccountArray;
	}
	
	
	
	
	
	
	/**
	 * @param accounts (Account[]) Accounts to write in a new file
	 * @param fileName (String) File name that will be created
	 * @return boolean true if successful 
	 */
	public static boolean writeAccountsToFile(Account[] accounts, String fileName) {
		PrintWriter fileWriter = null;
		try {
			fileWriter = new PrintWriter(fileName);
			for (int i = 0; i < accounts.length; i++) { //accounts.length
				fileWriter.println(accounts[i].toString());
			}
			fileWriter.close();
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
		
	
	
	
	/**
	 * Main method that runs the code in other methods and classes
	 */
	public static void main(String [] args) {
		Account[] accountArray = readAccountsFromFile("accounts.txt");
		writeAccountsToFile(accountArray, "accountscopy.txt");
		
	}
}
