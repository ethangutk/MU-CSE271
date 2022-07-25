/**
 * @author Ethan Gutknecht
 * @apiNote Class is a subclass of the person class
 */


public class Student extends Person {
	//variables
	private String major;
	
	
	/**
	 * @apiNote creates student with defults 
	 */
	public Student() {
		super(); //Defaults name and year of birth by calling person class
		this.major = null; //Defaults major
	}
	
	
	/**
	 * @apiNote creates student with parameters 
	 */
	public Student(String m, String n, int yob) {
		super(n, yob); //sets name and year of birth
		this.major = m; //sets major
	}
	
	
	/**
	 * @apiNote compares two objects to see if they are equal
	 * @return boolean true if equal
	 */
	public boolean equals(Object obj) {
		//make sure obj is a student
		if (obj instanceof Student) {
			Student s = (Student)obj;
			if (this.major.equals(s.major) && super.equals(s)) return true;
			else return false; //if major doesn't match return false
		}
		else return false; //if it is not a student return false
	}
	
	
	/**
	 * @apiNote takes values and creates a string
	 * @return String returns string of values
	 */
	public String toString() {
		return "I am a student majoring in " + this.major + ". " + super.toString();
	}

	
	/**
	 * @apiNote retreives major
	 * @return String major
	 */
	public String getMajor() { //gets major
		return major;
	}

	
	/**
	 * @apiNote sets new major for student
	 * @return void
	 */
	public void setMajor(String major) { //sets major
		this.major = major;
	}
}
