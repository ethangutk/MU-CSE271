/**
 * Project_03
 * Object-Oriented Programming, CSE 271, Spring 2020
 * @author Ethan Gutknecht
 */

public class Glome extends Sphere implements Volume{
	/**
	 * Glome constructor with no parameters.
	 */
	public Glome(){
		super();
	}
	
	
	
	/**
	 * Glome constructor with parameters
	 * @param double - radius to set of new Glome
	 * @param String - Name to set of new Glome
	 */
	public Glome(double radius, String name) {
		super(radius, name);
	}

	
	
	/**
	 * @param  Glome - glome to compare
	 * @return boolean - true if they are equal
	 */
	public boolean equals(Glome glome) {
		//make sure obj is a Glome
		if (glome instanceof Glome) {
			Glome i = (Glome)glome;
			if (super.getName().equals(i.getName()) && (super.getRadius() == i.getRadius())) return true;
			else return false; //if rank doesn't match return false
		}
		else return false; //if not the correct object type, it returns false.
	}
	
	
	
	/**
	 * @return String - String of all the information about the Glome.
	 */
	@Override
	public String toString() {
		return "Glome [Radius: " + super.getRadius() + ", Volume: " + this.getVolume() + "]";
	}
	
	
	
	/**
	 * @return double - Volume of the Glome.
	 */
	public double getVolume() {
		return (0.5 * Math.pow(Math.PI, 2) * Math.pow(this.getRadius(), 4));
	}
}
