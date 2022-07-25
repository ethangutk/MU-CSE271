/**
 * @author Ethan Gutknecht
 * @apiNote Class is a subclass of the person class
 */


public class Person {
	//constructors
	private String name;
	private int yearOfBirth;
	
	
	/**
	 * @apiNote creates a person based on defult values
	 */
	public Person(){
		this.name = null;
		this.yearOfBirth = 0;
	}
	
	
	/**
	 * @apiNote creates a person based on parameters
	 */
	public Person(String n, int yob){
		this.name = n;
		this.yearOfBirth = yob;
	}
	
	
	/**
	 * @apiNote creates a person based on defult values
	 * @return boolean true if equal
	 */
	public boolean equals(Object obj) {
		//make sure obj is a person
		if (obj instanceof Person) {
			Person p = (Person)obj;
			if (this.name.equals(p.getName()) && this.yearOfBirth == p.getYearOfBirth()) return true;
			else return false; //if names & year don't match return false
		}
		else return false; //if it is not a person return false
	}
	
	
	/**
	 * @apiNote creates a string of a persons info
	 * @return string of persons info
	 */
	public String toString() {
		return "I am a person whose name is " + this.name
				+ " and was born in " + this.yearOfBirth;
	}

	
	/**
	 * @apiNote retrieves name of person
	 * @return string of persons name
	 */
	public String getName() {
		return name;
	}

	
	/**
	 * @apiNote sets name of person
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	/**
	 * @apiNote retrieves year of birth of person
	 * @return int returns birth year of person
	 */
	public int getYearOfBirth() {
		return yearOfBirth;
	}

	
	/**
	 * @apiNote sets year of birth of person
	 */
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
}
