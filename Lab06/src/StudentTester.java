import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTester {

	@Test
	void testEqualsObject() {
		Student student1 = new Student("Computer Science", "Ethan", 2000);
		Student student1copy = new Student("Computer Science", "Ethan", 2000);
		Student student2 = new Student("Mechanical Engineer", "Logan", 1998);
		
		assertEquals(true, student1.equals(student1copy));
		assertEquals(false, student1.equals(student2));
	}

	@Test
	void testToString() {
		Student student1 = new Student("Computer Science", "Ethan", 2000);
		
		assertEquals("I am a student majoring in Computer Science. I am a person whose name is Ethan and was born in 2000", student1.toString());
	}

	@Test
	void testStudent() {
		Student defultstudent = new Student();
		
		assertEquals(null, defultstudent.getMajor());
	}

	@Test
	void testStudentStringStringInt() {
		Student student1 = new Student("Computer Science", "Ethan", 2000);
		
		assertEquals("Computer Science", student1.getMajor());
		//everything else has already been tested in parent testers
	}

	@Test
	void testGetMajor() {
		Student student1 = new Student("Computer Science", "Ethan", 2000);
		
		assertEquals("Computer Science", student1.getMajor());
	}

	@Test
	void testSetMajor() {
		Student student1 = new Student("Computer Science", "Ethan", 2000);
		student1.setMajor("Undecided");
		assertEquals("Undecided", student1.getMajor());
	}

}
