import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CubeTester {


	@Test
	void testCube() {
		Cube testCube1 = new Cube();
		assertEquals(null, testCube1.getName());
		assertEquals(0.0, testCube1.getSide(), 0.0001);
	}

	@Test
	void testCubeDoubleString() {
		//Normal Cube
		Cube testCube1 = new Cube(5.0, "Cube 1");
		assertEquals("Cube 1", testCube1.getName());
		assertEquals(5.0, testCube1.getSide(), 0.01);
		
		//With radius lower than zero
		Cube testCube2 = new Cube(-1.0,"Cube 1");
		assertEquals(0.0, testCube2.getSide(), 0.01);
	}

	@Test
	void testGetRadius() {
		Cube testCube1 = new Cube(5.0, "Cube 1");
		assertEquals(5.0, testCube1.getSide(), 0.01);
	}

	@Test
	void testEqualsCube() {
		Cube testCube1 = new Cube(5.0, "Cube 1");
		Cube testCube1copy = new Cube(5.0, "Cube 1");
		Cube testCube2 = new Cube(11.0, "Cube 2");
		
		assertEquals(true, testCube1.equals(testCube1copy));
		assertEquals(false, testCube1.equals(testCube2));
	}

	@Test
	void testToString() {
		Cube testCube1 = new Cube(5.0, "Cube 1");
		assertEquals("Cube [Side: 5.0, Volume: " + testCube1.getVolume() + "]", testCube1.toString());
	}
	
	@Test
	void testGetVolume() {
		Cube testCube1 = new Cube(5.0, "Cube 1");
		assertEquals(Math.pow(testCube1.getSide(), 3), testCube1.getVolume());
	}
}
