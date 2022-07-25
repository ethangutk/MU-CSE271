import java.util.Scanner;
import java.util.Arrays;

public class GradeStatistics {
	public static double[] populateGrades() {
		//creates scanner
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many students do you have in the class:");
		int numberOfStudents = keyboard.nextInt();
		double[] grades = new double[numberOfStudents];		
		
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print("Enter grade of Student " + (i+1) + ":");
			grades[i] = keyboard.nextDouble();
		}
		
		return grades;
	}
	
	public static void sortGrades(double grades[]) {
		Arrays.sort(grades);
	}

	
	public static double getMean(double grades[]) {
		double sum = 0;
		
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		return sum / grades.length;
		
	}
	
	public static double getMedian(double grades[]) {
		
		if (grades.length % 2 == 0) {
			//(finds first middle + second middle) divides by two
			return (grades[(grades.length / 2) - 1] + grades[grades.length / 2]) / 2;
		}
		else {
			return grades[(grades.length) / 2];
		}
	}
	
	public static double[] getMinMax(double grades[]) {
		double[] minMax = new double[2];
		
		
		
		//find min
		double currentMin = Double.MAX_VALUE;
		
		for(int i = 0; i < grades.length - 1; i++) {
			if (currentMin > grades[i]) {
				currentMin = grades[i]; //changes currentMin to new min
				minMax[0] = currentMin; //sets currentMin in array
			}
		}
		
		//find max
		minMax[1] = grades[grades.length - 1];

		
		return minMax;
	}
	
	
	public static void printGrades(double grades[]) {
		//print grades spaced out by commas except the last one
		for(int i = 0; i < grades.length - 1; i++) {
			System.out.print(grades[i] + ", ");
		}
		System.out.print(grades[grades.length-1]);
	}
	
	public static void main(String args[]) {
		//1.
		double[] grades = populateGrades();
		//2. 
		System.out.print("The grades are: ");
		printGrades(grades);
		//3.
		sortGrades(grades);
		//4.
		System.out.print("\nThe sorted grades are: ");
		printGrades(grades);
		//5.
		System.out.print("\nMean = " + getMean(grades));
		//6.
		System.out.print("\nMedian = " + getMedian(grades));
		//7.
		double[] minMaxArray = getMinMax(grades);
		System.out.print("\nMin = " + minMaxArray[0] + " Max = " + minMaxArray[1]);
		
		
	}
	
}








