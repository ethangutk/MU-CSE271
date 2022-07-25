import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SphereTester {

	@Test
	void testSphere() {
		Sphere testSphere1 = new Sphere();
		assertEquals(null, testSphere1.getName());
		assertEquals(0.0,  testSphere1.getRadius(), 0.0001);
	}

	@Test
	void testSphereDoubleString() {
		//Normal Sphere
		Sphere testSphere1 = new Sphere(5.0, "Sphere 1");
		assertEquals("Sphere 1", testSphere1.getName());
		assertEquals(5.0, testSphere1.getRadius(), 0.01);
		
		//With radius lower than zero
		Sphere testSphere2 = new Sphere(-5.0, "Sphere 2");
		assertEquals(0.0, testSphere2.getRadius(), 0.01);
	}

	@Test
	void testGetRadius() {
		Sphere testSphere1 = new Sphere(5.0, "Sphere 1");
		assertEquals(5.0, testSphere1.getRadius(), 0.01);
	}

	@Test
	void testEqualsSphere() {
		Sphere testSphere1 = new Sphere(5.0, "Sphere 1");
		Sphere testSphere1copy = new Sphere(5.0, "Sphere 1");
		Sphere testSphere2 = new Sphere(15.0, "Sphere 2");
		
		assertEquals(true, testSphere1.equals(testSphere1copy));
		assertEquals(false, testSphere1.equals(testSphere2));
	}

	@Test
	void testToString() {
		Sphere testSphere1 = new Sphere(5.0, "Sphere 1");
		assertEquals("Sphere [Radius: 5.0, Volume: " + testSphere1.getVolume() + "]", testSphere1.toString());
	}
	
	@Test
	void testGetArea() {
		Sphere testSphere1 = new Sphere(5.0, "Sphere 1");
		assertEquals(((4/3) * Math.PI * Math.pow(5.0, 3)), testSphere1.getVolume(), 0.01);
	}

}
