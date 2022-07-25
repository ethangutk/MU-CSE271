import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTester {

	@Test
	void testEqualsObject() {
		Employee employee1 = new Employee("Logan", 1998, 150); 
		Employee employee1copy = new Employee("Logan", 1998, 150); 
		Employee employee2 = new Employee("Ethan", 2000, 100); 
		assertEquals(true,  employee1.equals(employee1copy));
		assertEquals(false, employee1.equals(employee2));
	}

	@Test
	void testToString() {
		Employee employee1 = new Employee("Ethan", 2000, 100);
		assertEquals("I am an employee and have a salary of $100.00. I am a person whose name is Ethan and was born in 2000", employee1.toString());
	}

	@Test
	void testEmployee() {
		Employee employee1 = new Employee();
		assertEquals(0, employee1.getSalary());
		//everything else has been tested in the person class
	}

	@Test
	void testEmployeeStringIntDouble() {
		Employee employee1 = new Employee("Ethan", 2000, 100);
		assertEquals(100.0, employee1.getSalary());
		//everything else has been tested in the person class
	}

	@Test
	void testGetSalary() {
		Employee employee1 = new Employee("Ethan", 2000, 100);
		assertEquals(100.0, employee1.getSalary());
	}

	@Test
	void testSetSalary() {
		Employee employee1 = new Employee("Ethan", 2000, 100);
		employee1.setSalary(150);
		assertEquals(150, employee1.getSalary());
	}

}
