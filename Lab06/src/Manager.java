/**
 * @author Ethan Gutknecht
 * @apiNote Class is a subclass of the employee class
 */


public class Manager extends Employee{
	//variables
	private String department;
	
	
	/**
	 * @apiNote creates manager with defults 
	 */
	public Manager() { //Defaults
		super();
		this.department = null;
	}
	
	
	/**
	 * @apiNote creates manager with parameters 
	 */
	public Manager(String name, int yob, int salary, String department) { //parameters
		super(name, yob, salary);
		this.department = department;
	}
	
	
	/**
	 * @apiNote takes an object and compares it to see if they are equal
	 * @return boolean if equal true 
	 */
	public boolean equals(Object obj) {
		//make sure obj is a student
		if (obj instanceof Manager) {
			Manager m = (Manager)obj;
			if (this.department == m.department && super.equals(m)) return true;
			else return false; //if department doesn't match or anything else return false
		}
		else return false; //if it is not a manager return false
	}
	
	
	/**
	 * @apiNote takes manager info
	 * @return boolean if equal true 
	 */
	public String toString() { //creates a string of this sub class and all parent classes
		return "I am a manager of the " + this.department +" department. " + super.toString();					
	}
	
	
	/**
	 * @apiNote returns a string of department
	 * @return String of department
	 */
	public String getDepartment() { //gets department
		return department;
	}

	
	/**
	 * @apiNote sets a department of manager
	 * @return void
	 */
	public void setDepartment(String department) { //sets department
		this.department = department;
	}
}
