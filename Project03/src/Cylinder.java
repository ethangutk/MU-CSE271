/**
 * Project_03
 * Object-Oriented Programming, CSE 271, Spring 2020
 * @author Ethan Gutknecht
 */


public class Cylinder extends Circle implements Volume {
	private double height;
	
	
	/**
	 * Cylinder constructor with no parameters.
	 */
	public Cylinder(){
		super();
		this.height = 0.0;
	}
	
	
	
	/**
	 * Cylinder constructor with parameters
	 * @param double - Radius to set of new Cylinder
	 * @param String - Name to set of new Cylinder
	 */
	public Cylinder(double radius, String name, double height) {
		super(radius, name);
		if (height < 0) this.height = 0;
		else this.height = height;
	}

	
	
	/**
	 * @param Cylinder - cylinder to compare
	 * @return boolean - true if they are equal
	 */
	public boolean equals(Cylinder cylinder) {
		//make sure obj is a cylinder
		if (cylinder instanceof Cylinder) {
			Cylinder i = (Cylinder)cylinder;
			if (super.getName().equals(i.getName()) && (super.getRadius() == i.getRadius())) return true;
			else return false; //if rank doesn't match return false
		}
		else return false; //if not the correct object type, it returns false.
	}
	
	
	
	/**
	 * @return String - String of all the information about the Cylinder.
	 */
	@Override
	public String toString() {
		return "Cylinder [Radius: " + super.getRadius() + ", Volume: " + this.getVolume() + "]";
	}
	
	
	
	/**
	 * @return double - Height of cylinder
	 */
	public double getHeight() {
		return this.height;
	}
	
	
	/**
	 * @return double - Volume of the Cylinder.
	 */
	public double getVolume() {
		return (super.getArea() * this.height);
	}
}
