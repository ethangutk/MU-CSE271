import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExecutiveTester {

	@Test
	void testEqualsObject() {
		Executive executive1 = new Executive("Logan", 1998, 150, "Sales", "Room 120");
		Executive executive1copy = new Executive("Logan", 1998, 150, "Sales", "Room 120");
		Executive executive2 = new Executive("Ethan", 2000, 100, "Human Resources", "Room 321");
		assertEquals(true, executive1.equals(executive1copy));
		assertEquals(false,executive1.equals(executive2));
	}

	@Test
	void testToString() {
		Executive executive1 = new Executive("Ethan", 2000, 100, "Human Resources", "Room 321");
		assertEquals("I am an executive and my office location isRoom 321. I am a manager of the Human Resources department. I am an employee and have a salary of $100.00. I am a person whose name is Ethan and was born in 2000", executive1.toString());
	}

	@Test
	void testExecutive() {
		Executive executive1 = new Executive();
		assertEquals(null, executive1.getOfficeLocation());
		//everything else has been tested in the person class
	}

	@Test
	void testExecutiveStringIntIntStringString() {
		Executive executive1 = new Executive("Ethan", 2000, 100, "Human Resources", "Room 321");
		assertEquals("Room 321", executive1.getOfficeLocation());
		//everything else has been tested in the person class
	}

	@Test
	void testGetOfficeLocation() {
		Executive executive1 = new Executive("Ethan", 2000, 100, "Human Resources", "Room 321");
		assertEquals("Room 321", executive1.getOfficeLocation());
	}

	@Test
	void testSetOfficeLocation() {
		Executive executive1 = new Executive("Ethan", 2000, 100, "Human Resources", "Room 321");
		executive1.setOfficeLocation("Room 123");
		assertEquals("Room 123", executive1.getOfficeLocation());
	}

}
