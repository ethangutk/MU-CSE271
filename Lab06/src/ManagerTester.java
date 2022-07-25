import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ManagerTester {

	@Test
	void testEqualsObject() {
		Manager manager1 = new Manager("Logan", 1998, 150, "Sales");
		Manager manager1copy = new Manager("Logan", 1998, 150, "Sales");
		Manager manager2 = new Manager("Ethan", 2000, 100, "Human Resources");
		assertEquals(true, manager1.equals(manager1copy));
		assertEquals(false,manager1.equals(manager2));
	}

	@Test
	void testToString() {
		Manager manager1 = new Manager("Ethan", 2000, 100, "Human Resources");
		assertEquals("I am a manager of the Human Resources department. I am an employee and have a salary of $100.00. I am a person whose name is Ethan and was born in 2000", manager1.toString());
	}

	@Test
	void testManager() {
		Manager manager1 = new Manager();
		assertEquals(null, manager1.getDepartment());
	}

	@Test
	void testManagerStringIntIntString() {
		Manager manager1 = new Manager("Ethan", 2000, 100, "Human Resources");
		assertEquals("Human Resources", manager1.getDepartment());
	}

	@Test
	void testGetDepartment() {
		Manager manager1 = new Manager("Ethan", 2000, 100, "Human Resources");
		assertEquals("Human Resources", manager1.getDepartment());
	}

	@Test
	void testSetDepartment() {
		Manager manager1 = new Manager("Ethan", 2000, 100, null);
		manager1.setDepartment("Human Resources");
		assertEquals("Human Resources", manager1.getDepartment());
	}

}
