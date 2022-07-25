/**
 * Project_03
 * Object-Oriented Programming, CSE 271, Spring 2020
 * @author Ethan Gutknecht
 */

public class Cube extends Square implements Volume {
	/**
	 * Cube constructor with no parameters.
	 */
	public Cube(){
		super();
	}
	
	
	
	/**
	 * Cube constructor with parameters
	 * @param double - Side to set of new Cube
	 * @param String - Name to set of new Cube
	 */
	public Cube(double side, String name) {
		super(side, name);
	}

	
	
	/**
	 * @param  Cube - Cube to compare
	 * @return boolean - true if they are equal
	 */
	public boolean equals(Cube cube) {
		//make sure obj is a Cube
		if (cube instanceof Cube) {
			Cube i = (Cube)cube;
			if (super.getName().equals(i.getName()) && (super.getSide() == i.getSide())) return true;
			else return false; //if rank doesn't match return false
		}
		else return false; //if not the correct object type, it returns false.
	}
	
	
	
	/**
	 * @return String - String of all the information about the Cube.
	 */
	@Override
	public String toString() {
		return "Cube [Side: " + super.getSide() + ", Volume: " + this.getVolume() + "]";
	}
	
	
	
	/**
	 * @return double - Volume of the Cube.
	 */
	public double getVolume() {
		return (Math.pow(this.getSide(), 3));
	}
}
