//imports
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Collections;


/**
 * @author Ethan Gutknecht
 */

//class start
public class FileParser {
	
	/**
	 * @author Ethan Gutknecht
	 * Main method where other methods are executed 
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter input filename: ");
		String fileName = keyboard.next();
		
		Scanner fileInput = null;
		File file = new File(fileName);
		
		try {
			
			fileInput = new Scanner(file);
			System.out.println("Found. What do you want to output?");
			System.out.println("1. Raw word list");
			System.out.println("2. Palindromes");
			System.out.println("3. $100 words");
			
			System.out.print("Choose: ");
			int userIntChoice = keyboard.nextInt();
			System.out.print("Enter output filename: ");
			String outputFileName = keyboard.next();
			
			//Raw Word List in output file
			if (userIntChoice == 1) { 
				try {
					File outputFile = new File (outputFileName);
					parse(file, outputFile);
					System.out.println("Finished printing raw word list.");
				}
				catch (Exception E){ //couldnt write file
					System.out.print("Failed to make file " + outputFileName);
				}
			}
			
			
			
			//Palindromes in output file
			else if (userIntChoice == 2) {
				try {
					File outputFile = new File (outputFileName);
					parsePalindrome(file, outputFile);
					System.out.println("Finished printing palindromes.");
				}
				catch (Exception E){ //couldnt write file
					System.out.print("Failed to make file " + outputFileName);
				}
			}
			
			
			
			else if (userIntChoice == 3) { //takes the value of the words in the output file
			
				try {
					File outputFile = new File (outputFileName);
					parseHundredDollarWord(file, outputFile);
					System.out.println("Finished printing $100 words.");
				}
				catch (Exception E){
					System.out.print("Failed to make file " + outputFileName);
				}
			}
			else {
				System.out.println("Invalad Input.");
			}
			
		}
		catch (Exception E){
			System.out.println("File does not exist. Goodbye.");
		}
		
	}
	
	
	
	/**
	 * @author Ethan Gutknecht
	 * @param word: The word we are going to "clean"
	 * @return returns a string with no spaces and in all capital letters
	 */
	public static String clean(String word) { //finished
		return word.toUpperCase().replaceAll("[^A-Za-z]", "");
	}
	
	
	
	/**
	 * @author Ethan Gutknecht
	 * @param File in: the file we are going to read
	 * @param File out: the file we are going to write
	 * @return void
	 */
	public static void parse(File in, File out){
		PrintWriter fileWriter = null;
		try {
			Scanner readInputFile;
			readInputFile = new Scanner(in);
			fileWriter = new PrintWriter(out.getName());
			
			
			while (readInputFile.hasNextLine()) {
				
				String line = readInputFile.nextLine();
				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) != ' ') {
						fileWriter.print(line.charAt(i));
					}
					else {
						fileWriter.print("\n");
					}
				}
				
			}
			readInputFile.close();
			
		} 
		catch (FileNotFoundException e) {
			System.out.println("Failed to write in the file.");
		}
		fileWriter.close();
	}
	
	
	/**
	 * @author Ethan Gutknecht
	 * @param word: a word we will determine if it is a palindrome
	 * @return boolean
	 */
	public static boolean isPalindrome(String word) {//finished
		boolean returnValue = true;
		for (int start = 0, end = word.length()-1; start < end; start++, end--) {
			if (word.charAt(start) != word.charAt(end)){
				returnValue = false;
			}
		}
		
		return returnValue;
	}
	
	
	/**
	 * @author Ethan Gutknecht
	 * @param File in: the file we are going to read
	 * @param File out: the file we are going to write
	 * @return void
	 */
	public static void parsePalindrome(File in, File out){

		try {
			Scanner readInputFile; //classifies new scanner object 
			PrintWriter fileWriter = null; 
			readInputFile = new Scanner(in); //sets up reader for file
			fileWriter = new PrintWriter(out.getName()); //sets up writer for file
			ArrayList<String> words = new ArrayList<String>();
			
			while (readInputFile.hasNextLine()) { //creates an ArrayList of all the words
				String currentLine = readInputFile.nextLine();
				String nextWordToAdd = "";
				
				for (int i = 0; i <= currentLine.length(); i++) {
					if ((i) == currentLine.length() || currentLine.charAt(i) == ' ') { //if its a new word or the last word
						words.add(nextWordToAdd); //adds word to list
						nextWordToAdd = ""; //resets the word
 					}
					else { //if middle of word it will continue adding char until word ends
						nextWordToAdd += currentLine.charAt(i);
					}
				}
			}
			
			Collections.sort(words);
			String lastWordWrote = "";
			
			for (int i = 0; i < words.size(); i++) {
				words.set(i, clean(words.get(i))); //cleans array list
				if (isPalindrome(words.get(i)) == true && words.get(i).equalsIgnoreCase(lastWordWrote) == false) {
					lastWordWrote = words.get(i);
					fileWriter.println(words.get(i));
				}
			}
			
			
			readInputFile.close();
			fileWriter.close();
		}
		
		catch (Exception e) {
			System.out.println("Failed to write in the file.");
		}
		
	}
	
	
	/**
	 * @author Ethan Gutknecht
	 * @param word: a word we will find the value of based on the letters inside
	 * @return int the value of the word in dollars
	 */
	public static int value(String word) {
		int returnValue = 0;
		
		
		for (int i = 0; i < word.length(); i++) { //values every character in word
			char characterToCompair = word.toUpperCase().charAt(i);
			returnValue += (characterToCompair - 'A') + 1;
			
		}
		
		return returnValue;
	}
	
	
	/**
	 * @author Ethan Gutknecht
	 * @param File in: the file we are going to read
	 * @param File out: the file we are going to write
	 * @return void
	 */
	public static void parseHundredDollarWord (File in, File out) {
		try {
			Scanner readInputFile; //classifies new scanner object 
			PrintWriter fileWriter = null; 
			readInputFile = new Scanner(in); //sets up reader for file
			fileWriter = new PrintWriter(out.getName()); //sets up writer for file
			ArrayList<String> words = new ArrayList<String>();
			
			while (readInputFile.hasNextLine()) { //creates an ArrayList of all the words
				String currentLine = readInputFile.nextLine();
				String nextWordToAdd = "";
				
				for (int i = 0; i <= currentLine.length(); i++) {
					if ((i) == currentLine.length() || currentLine.charAt(i) == ' ') { //if its a new word or the last word
						words.add(nextWordToAdd); //adds word to list
						nextWordToAdd = ""; //resets the word
 					}
					else { //if middle of word it will continue adding char until word ends
						nextWordToAdd += currentLine.charAt(i);
					}
				}
			}
			
			Collections.sort(words);
			String lastWordWrote = "";
			
			for (int i = 0; i < words.size(); i++) {
				words.set(i, clean(words.get(i))); //cleans array list
				if (value(words.get(i)) == 100 && words.get(i).equalsIgnoreCase(lastWordWrote) == false) {
					lastWordWrote = words.get(i);
					fileWriter.println(words.get(i));
				}
			}
			readInputFile.close();
			fileWriter.close();
		}
		
		catch (Exception e){ //if try fails
			System.out.println("Failed to write in the file.");
		}
	}
	
}
