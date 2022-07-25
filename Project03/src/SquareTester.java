import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTester {

	@Test
	void testGetName() {
		Square testSquare1 = new Square(5.0, "Square 1");
		assertEquals("Square 1", testSquare1.getName());
	}

	@Test
	void testSquare() {
		Square testSquare1 = new Square();
		assertEquals(null, testSquare1.getName());
		assertEquals(0.0, testSquare1.getSide(), 0.0001);
	}

	@Test
	void testSquareDoubleString() {
		//Normal Square
		Square testSquare1 = new Square(5.0, "Square 1");
		assertEquals("Square 1", testSquare1.getName());
		assertEquals(5.0, testSquare1.getSide(), 0.01);
		
		//With side lower than zero
		Square testSquare2 = new Square(-5.0, "Square 2");
		assertEquals(0.0, testSquare2.getSide(), 0.01);
	}

	@Test
	void testGetRadius() {
		Square testSquare1 = new Square(5.0, "Square 1");
		assertEquals(5.0, testSquare1.getSide(), 0.01);
	}

	@Test
	void testEqualsSquare() {
		Square testSquare1 = new Square(5.0, "Square 1");
		Square testSquare1copy = new Square(5.0, "Square 1");
		Square testSquare2 = new Square(10.0, "Square 2");
		
		assertEquals(true, testSquare1.equals (testSquare1copy));
		assertEquals(false, testSquare1.equals(testSquare2));
	}

	@Test
	void testToString() {
		Square testSquare1 = new Square(5.0, "Square 1");
		assertEquals("Square [Side: 5.0, Area: " + testSquare1.getArea() + "]", testSquare1.toString());
	}
	
	@Test
	void testGetArea() {
		Square testSquare1 = new Square(5.0, "Square 1");
		assertEquals(Math.pow(testSquare1.getSide() , 2), testSquare1.getArea());
	}
}
