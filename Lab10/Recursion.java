import java.util.Arrays;

public class Recursion {
	
	
	
	
	 public static int factorial(int n) {
		 
		 if (n <= 1) return 1; //if n = 1, return 1 rather then having an infinite loop
		 
		 else { //calls this method and multiplies every int before original N
			int factorialReturn = (n * factorial(n-1));
			return factorialReturn; 
		 }
	 }
	 
	 
	 
	 
	 public static int power(int x, int n) {
		 if (n == 0) return 1;
		 
		 else { 
			int powerReturn = x * power(x, n-1);
			return powerReturn; 
		 }
	 }
	 
	 
	 
	 
	 public static int sumDigits(int n) {
		 if (n < 10) return n;
		 else { 
			int length = Integer.toString(n).length() - 1;
			int nextReturnDigit = (n % (int)(Math.pow(10, length)));
			int currentDigit = ((n - nextReturnDigit) /  (int)Math.pow(10, length));
			return currentDigit + sumDigits(nextReturnDigit); 
		 }
	 }
	 
	 
	 
	 
	 public static void printBackward(String word) {
		 	if ((word == null) || (word.length() <= 1)) System.out.println(word);
		 	else {
		 		System.out.print(word.charAt(word.length()-1)); 
		 		printBackward(word.substring(0,word.length()-1)); 
		 	}
	 }
	 
	 
	 
	 
	 public static boolean isPalindrome(String word) {
		 if (word.length() == 1) return true;
		 else if (word.charAt(0) == word.charAt(word.length()- 1) && word.length() > 2) {
			 return isPalindrome(word.substring(1, word.length() - 1));
		 }
		 else if (word.charAt(0) == word.charAt(word.length()- 1) && word.length() == 2) {
			 return true;
		 }
		 else return false; 
	 }
	 
	 
	 
	 
	 public static int sumPositive(int[] array) {
		if (array[array.length - 1] > 0 && array.length > 1) 
			return array[array.length - 1] + sumPositive(Arrays.copyOfRange(array, 0, array.length-1));
		if ((array[array.length - 1] < 0 && array.length > 1))
			return sumPositive(Arrays.copyOfRange(array, 0, array.length-1));
		if ((array.length == 1 && array[0] > 0)) return array[0];
		else return 0;
	 }
	 
	 public static int max(int[] array) { //[3, 1, 9]
		 if (array.length == 1) return array[0];
		 if (array[0] < max(Arrays.copyOfRange(array,1,array.length))) {
			 return max(Arrays.copyOfRange(array,1,array.length));
		 }
		 else return 0;
	 }
	
	
	
}



