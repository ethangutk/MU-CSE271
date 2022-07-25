import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CylinderTester {

	@Test
	void testSphere() {
		Cylinder testCylinder1 = new Cylinder();
		assertEquals(null, testCylinder1.getName());
		assertEquals(0.0,  testCylinder1.getRadius(), 0.0001);
	}

	@Test
	void testCylinderDoubleStringDouble() {
		//Normal Cylinder
		Cylinder testCylinder1 = new Cylinder(5.0, "Cylinder 1", 2.0);
		assertEquals("Cylinder 1", testCylinder1.getName());
		assertEquals(5.0, testCylinder1.getRadius(), 0.01);
		assertEquals(2.0, testCylinder1.getHeight(), 0.01);
		
		//With radius lower than zero
		Cylinder testCylinder2 = new Cylinder(-5.0, "Cylinder 2", -4.0);
		assertEquals(0.0, testCylinder2.getRadius(), 0.01);
		assertEquals(0.0, testCylinder2.getHeight(), 0.01);
	}

	@Test
	void testGetRadius() {
		Cylinder testCylinder1 = new Cylinder(5.0, "Cylinder 1", 2.0);
		assertEquals(5.0, testCylinder1.getRadius(), 0.01);
	}

	@Test
	void testEqualsCylinder() {
		Cylinder testCylinder1 = new Cylinder(5.0, "Cylinder 1", 4.0);
		Cylinder testCylinder1copy = new Cylinder(5.0, "Cylinder 1", 4.0);
		Cylinder testCylinder2 = new Cylinder(15.0, "Cylinder 2", 4.0);
		
		assertEquals(true, testCylinder1.equals(testCylinder1copy));
		assertEquals(false, testCylinder1.equals(testCylinder2));
	}

	@Test
	void testToString() {
		Cylinder testCylinder1 = new Cylinder(5.0, "Cylinder 1", 2.0);
		assertEquals("Cylinder [Radius: 5.0, Volume: " + testCylinder1.getVolume() + "]", testCylinder1.toString());
	}
	
	@Test
	void testGetArea() {
		Cylinder testCylinder1 = new Cylinder(5.0, "Cylinder 1", 2.0);
		assertEquals(testCylinder1.getArea() * testCylinder1.getHeight(), testCylinder1.getVolume(), 0.01);
	}

}
