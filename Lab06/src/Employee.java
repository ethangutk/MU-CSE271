/**
 * @author Ethan Gutknecht
 * @apiNote Class is a subclass of the person class
 */


public class Employee extends Person {
	//variables
	private int salary;

	
	
	/**
	 * @apiNote Creates defults for employee
	 */
	public Employee() { //Defaults
		super();
		this.salary = 0;
	}
	
	
	/**
	 * @apiNote Creates employee based on parameters
	 */
	public Employee(String name, int yob, int salary) { //parameters
		super(name, yob);
		this.salary = salary;
	}
	
	
	/**
	 * @apiNote Compares two employees
	 * @return boolean true if they are equal
	 */
	public boolean equals(Object obj) {
		//make sure obj is an employee
		if (obj instanceof Employee) {
			Employee e = (Employee)obj; 
			if (this.salary == e.getSalary() && super.equals(e)) return true;
			else return false; //if salary doesn't match return false or anything else
		}
		else return false; //if it is not an employee return false
	}

	
	/**
	 * @apiNote creates a string off of variables
	 * @return String of emploees
	 */
	public String toString() { //creates a string of this sub class and all parent classes
		return "I am an employee and have a salary of $" + this.salary +".00. " + super.toString(); 
	}

	
	/**
	 * @apiNote retreives salary variable
	 * @return int salary variable
	 */
	public int getSalary() { //gets salary
		return salary;
	}

	
	/**
	 * @apiNote sets salary of employee
	 */
	public void setSalary(int salary) { //sets salary
		this.salary = salary;
	}
}

