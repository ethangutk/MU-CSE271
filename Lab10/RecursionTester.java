import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionTester {

	@Test
	void testFactorial() {
		assertEquals(1, Recursion.factorial(-1));
		assertEquals(120, Recursion.factorial(5));
	}

	@Test
	void testPower() {
		assertEquals(1, Recursion.power(90, 0));
		assertEquals(125, Recursion.power(5, 3));
	}

	@Test
	void testSumDigits() {
		assertEquals(45, Recursion.sumDigits(123456789));
	}

	@Test
	void testPrintBackward() {
		System.out.println("Print backwords test, input GOODNESS:");
		Recursion.printBackward("GOODNESS");
	}

	@Test
	void testIsPalindrome() {
		assertEquals(true,  Recursion.isPalindrome("ABBA"));
		assertEquals(true,  Recursion.isPalindrome("A"));
		assertEquals(true,  Recursion.isPalindrome("ABCBA"));
		assertEquals(false, Recursion.isPalindrome("ABCDEF"));
	}

	@Test
	void testSumPositive() {
		int[] array1 = {2, -5, 3, 5, -1};
		int[] array2 = {-1, -3, -5};
		
		assertEquals(10, Recursion.sumPositive(array1));
		assertEquals( 0, Recursion.sumPositive(array2));
	}

	@Test
	void testMax() {
		int[] array1 = {2, 10, 3, 5, 1};
		assertEquals(0, Recursion.max(array1));
		
	}

}
