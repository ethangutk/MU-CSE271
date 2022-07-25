import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileIO {
	public static void main(String args[]) {
		// Create a Scanner class object
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter an integer, N :");
		int integerInput = keyboard.nextInt();
		Random rnd = new Random();
		
		
		try { //creates numbers.txt with integerInput number of random integers
			PrintWriter input = new PrintWriter("numbers.txt");
			for (int i = 0; i < integerInput; i++) {
				input.println(rnd.nextInt(100) + 1);
			}
			input.close();
		}
		catch (Exception E){
			System.out.println("Error with input.");
		}
		
		
		//creates array and fills it with random numbers 
		int[] numbers = new int[integerInput];
		try {
			
			Scanner scn = new Scanner(new File("numbers.txt"));
			for (int i = 0; i < integerInput; i++) {
				numbers[i] = scn.nextInt();
			}
			scn.close();
		}
		catch (Exception E){
			System.out.println("Error with reading numbers");
		}
		
		
		try { //creates output.txt 
			//prints unsorted array
			PrintWriter output = new PrintWriter("output.txt");
			output.print("Numbers:");
			output.println("");
			for (int i = 0; i < integerInput; i++) {
				if (i == 0) output.print("["); //for beginning
				output.print(numbers[i]);
				if (i < integerInput - 1) output.print(", "); //for ending
			}
			output.println("]"); //final bracket
			
			//prints sorted array
			Arrays.sort(numbers);
			output.print("Sorted Numbers:");
			output.println("");
			for (int i = 0; i < integerInput; i++) {
				if (i == 0) output.print("["); //for beginning
				output.print(numbers[i]);
				if (i < integerInput - 1) output.print(", "); //for ending
			}
			output.println("]"); //final bracket
			output.println("Number of odd numbers: " + (integerInput - countEvens(numbers, integerInput)));
			output.println("Number of evens: " + (countEvens(numbers, integerInput)));
			output.println("Smallest number: " + numbers[0]);
			output.println("Largest number: " + numbers[numbers.length - 1]);
			output.println("Mean: " + getMean(numbers, integerInput));
			output.close();
		}
		catch (Exception E){
			System.out.println("Error with outputting numbers ");
		}
	}
	
	public static int countEvens(int[] numbers, int numberofints) {
		int rv = 0;
		for (int i = 0; i < numberofints; i++) {
			if (numbers[i] % 2 == 0) rv++;
		}
	return rv;
	}
	
	public static double getMean(int[] numbers, int numberofints) {
		double rv = 0;
		for (int i = 0; i < numberofints; i++) {
			rv += numbers[i];
		}
		rv = rv / (numbers.length + 0.0);
	return rv;
	}
}
