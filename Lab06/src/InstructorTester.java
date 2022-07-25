import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InstructorTester {

	@Test
	void testEqualsObject() {
		Instructor instructor1 = new Instructor("Ethan", 2000, "lecturer");
		Instructor instructor1copy = new Instructor("Ethan", 2000, "lecturer");
		Instructor instructor2 = new Instructor("Logan", 1998, "associate professor");
		
		assertEquals(true, instructor1.equals(instructor1copy));
		assertEquals(false, instructor1.equals(instructor2));
	}

	@Test
	void testToString() {
		Instructor instructor1 = new Instructor("Ethan", 2000, "lecturer");
		
		assertEquals("I am a lecturer. I am a person whose name is Ethan and was born in 2000", instructor1.toString());
	}

	@Test
	void testInstructor() {
		Instructor defultInstructor1 = new Instructor();
		assertEquals(null, defultInstructor1.getRank());
	}

	@Test
	void testInstructorStringIntString() {
		Instructor defultInstructor1 = new Instructor("Ethan", 2000, "lecturer");
		assertEquals("lecturer", defultInstructor1.getRank());
	}

	@Test
	void testGetRank() {
		Instructor defultInstructor1 = new Instructor("Ethan", 2000, "lecturer");
		assertEquals("lecturer", defultInstructor1.getRank());
	}

	@Test
	void testSetRank() {
		Instructor defultInstructor1 = new Instructor("Ethan", 2000, "lecturerrrrrr");
		defultInstructor1.setRank("lecturer");
		assertEquals("lecturer", defultInstructor1.getRank());
	}

}
