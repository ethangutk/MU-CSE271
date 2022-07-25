/**
 * @author Ethan Gutknecht
 * @apiNote Class is a subclass of the manager class
 */


public class Executive extends Manager{
	//constructors
	private String officeLocation;
	
	
	/**
	 * @apiNote creates manager with defults 
	 */
	public Executive() { //Defaults
		super();
		this.officeLocation = null;
	}
	
	
	/**
	 * @apiNote creates manager with parameters 
	 */
	public Executive(String name, int yob, int salary, String department, String officeLocation) { //parameters
		super(name, yob, salary, department);
		this.officeLocation = officeLocation;
	}
	
	
	/**
	 * @apiNote takes an object and compares it to see if they are equal
	 * @return boolean if equal true 
	 */
	public boolean equals(Object obj) {
		//make sure obj is an executive
		if (obj instanceof Executive) {
			Executive e = (Executive)obj;
			if (this.officeLocation == e.officeLocation && super.equals(e)) return true;
			else return false; //if location doesn't match or anything else return false
		}
		else return false; //if it is not an executive return false
	}
	
	
	/**
	 * @apiNote takes executive info and turns it into string
	 * @return boolean if equal true 
	 */
	public String toString() { //creates a string of this sub class and all parent classes
		return "I am an executive and my office location is" + this.officeLocation + ". " + super.toString();					
	}

	
	/**
	 * @apiNote retreives office location
	 * @return string officelocation
	 */
	public String getOfficeLocation() { //gets office location
		return officeLocation;
	}

	
	/**
	 * @apiNote sets new office location
	 * @return void
	 */
	public void setOfficeLocation(String officeLocation) { //sets office location
		this.officeLocation = officeLocation;
	}

}
