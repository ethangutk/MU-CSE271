/**
 * Project_03
 * Object-Oriented Programming, CSE 271, Spring 2020
 * @author Ethan Gutknecht
 */


public class Sphere extends Circle implements Volume {
	
	/**
	 * Sphere constructor with no parameters.
	 */
	public Sphere(){
		super();
	}
	
	/**
	 * Sphere constructor with parameters
	 * @param double - Radius to set of new Sphere
	 * @param String - Name to set of new Sphere
	 */
	public Sphere(double radius, String name) {
		super(radius, name);
	}

	/**
	 * @param Sphere - sphere to compare
	 * @return boolean - true if they are equal
	 */
	public boolean equals(Sphere sphere) {
		//make sure obj is a circle
		if (sphere instanceof Sphere) {
			Sphere i = (Sphere)sphere;
			if (this.getName().equals(i.getName()) && (super.getRadius() == i.getRadius())) return true;
			else return false; //if rank doesn't match return false
		}
		else return false; //if not the correct object type, it returns false.
	}
	
	/**
	 * @return String - String of all the information about the Sphere.
	 */
	@Override
	public String toString() {
		return "Sphere [Radius: " + super.getRadius() + ", Volume: " + this.getVolume() + "]";
	}
	
	/**
	 * @return double - Volume of the shpere 
	 */
	public double getVolume() {
		return ((4/3) * Math.PI * Math.pow(super.getRadius(), 3));
	}
	
}
