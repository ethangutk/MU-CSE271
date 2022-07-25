/**
 * Project_03
 * Object-Oriented Programming, CSE 271, Spring 2020
 * @author Ethan Gutknecht
 */


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTester {

	@Test
	void testGetName() {
		Circle testCircle1 = new Circle(5.0, "Circle 1");
		assertEquals("Circle 1", testCircle1.getName());
	}

	@Test
	void testCircle() {
		Circle testCircle1 = new Circle();
		assertEquals(null, testCircle1.getName());
		assertEquals(0.0, testCircle1.getRadius(), 0.0001);
	}

	@Test
	void testCircleDoubleString() {
		//Normal Circle
		Circle testCircle1 = new Circle(5.0, "Circle 1");
		assertEquals("Circle 1", testCircle1.getName());
		assertEquals(5.0, testCircle1.getRadius(), 0.01);
		
		//With radius lower than zero
		Circle testCircle2 = new Circle(-1.0, "Circle 1");
		assertEquals(0.0, testCircle2.getRadius(), 0.01);
	}

	@Test
	void testGetRadius() {
		Circle testCircle1 = new Circle(5.0, "Circle 1");
		assertEquals(5.0, testCircle1.getRadius(), 0.01);
	}

	@Test
	void testEqualsCircle() {
		Circle testCircle1 = new Circle(5.0, "Circle 1");
		Circle testCircle1copy = new Circle(5.0, "Circle 1");
		Circle testCircle2 = new Circle(10.0, "Circle 2");
		
		assertEquals(true, testCircle1.equals(testCircle1copy));
		assertEquals(false, testCircle1.equals(testCircle2));
	}

	@Test
	void testToString() {
		Circle testCircle1 = new Circle(5.0, "Circle 1");
		assertEquals("Circle [Radius: 5.0, Area: " + testCircle1.getArea() + "]", testCircle1.toString());
	}
	
	@Test
	void testGetArea() {
		Circle testCircle1 = new Circle(5.0, "Circle 1");
		assertEquals(Math.PI * Math.pow(testCircle1.getRadius(), 2), testCircle1.getArea());
	}

}
