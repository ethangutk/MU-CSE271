import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GlomeTester {


	@Test
	void testGlome() {
		Glome testGlome1 = new Glome();
		assertEquals(null, testGlome1.getName());
		assertEquals(0.0,  testGlome1.getRadius(), 0.0001);
	}

	@Test
	void testGlomeDoubleString() {
		//Normal Glome
		Glome testGlome1 = new Glome(5.0, "Glome 1");
		assertEquals("Glome 1", testGlome1.getName());
		assertEquals(5.0, testGlome1.getRadius(), 0.01);
		
		//With radius lower than zero
		Glome testGlome2 = new Glome(-5.0, "Glome 2");
		assertEquals(0.0, testGlome2.getRadius(), 0.01);
	}

	@Test
	void testGetRadius() {
		Glome testGlome1 = new Glome(5.0, "Glome 1");
		assertEquals(5.0, testGlome1.getRadius(), 0.01);
	}

	@Test
	void testEqualsGlome() {
		Glome testGlome1 = new Glome(5.0, "Glome 1");
		Glome testGlome1copy = new Glome(5.0, "Glome 1");
		Glome testGlome2 = new Glome(15.0, "Glome 2");
		
		assertEquals(true, testGlome1.equals(testGlome1copy));
		assertEquals(false, testGlome1.equals(testGlome2));
	}

	@Test
	void testToString() {
		Glome testGlome1 = new Glome(5.0, "Glome 1");
		assertEquals("Glome [Radius: 5.0, Volume: " + testGlome1.getVolume() + "]", testGlome1.toString());
	}
	
	@Test
	void testGetArea() {
		Glome testGlome1 = new Glome(5.0, "Glome 1");
		assertEquals(Math.PI * Math.pow(testGlome1.getRadius(), 2), testGlome1.getArea());
	}
}
