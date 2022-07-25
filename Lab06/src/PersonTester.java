import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTester {

	@Test
	void testPerson() {
		Person defultperson = new Person();
		
		assertEquals(null, defultperson.getName());
		assertEquals(0, defultperson.getYearOfBirth());
	}

	@Test
	void testPersonStringInt() {
		Person person1 = new Person("Ethan", 2000);
		
		assertEquals("Ethan", person1.getName());
		assertEquals(2000, person1.getYearOfBirth());
	}

	@Test
	void testEqualsObject() {
		Person person1 = new Person("Ethan", 2000);
		Person person1copy = new Person("Ethan", 2000);
		Person person2 = new Person("Logan", 1998);
		
		assertEquals(true, person1.equals(person1copy));
		assertEquals(false, person1.equals(person2));
	}

	@Test
	void testToString() {
		Person person1 = new Person("Ethan", 2000);
		assertEquals("I am a person whose name is Ethan and was born in 2000", person1.toString());
	}

	@Test
	void testGetName() {
		Person person1 = new Person("Ethan", 2000);
		assertEquals("Ethan", person1.getName());
	}

	@Test
	void testSetName() {
		Person person1 = new Person("Ethannnnnnnn", 2000);
		person1.setName("Ethan");;
		assertEquals("Ethan", person1.getName());
	}

	@Test
	void testGetYearOfBirth() {
		Person person1 = new Person("Ethan", 2000);
		assertEquals(2000, person1.getYearOfBirth());
	}

	@Test
	void testSetYearOfBirth() {
		Person person1 = new Person("Ethan", 2000);
		person1.setYearOfBirth(2001);;
		assertEquals(2001, person1.getYearOfBirth());
	}

}
