/**
 * Project_03
 * Object-Oriented Programming, CSE 271, Spring 2020
 * @author Ethan Gutknecht
 */

public class Circle extends Shape implements Area{
	//variables
	private double radius;
	
	
	
	/**
	 * Circle constructor with no parameters.
	 */
	public Circle(){
		super();
		this.radius = 0.0;
	}
	
	
	
	/**
	 * Circle constructor with parameters
	 * @param radius - Radius to set of new circle
	 * @param name - Name to set of new circle
	 */
	public Circle(double radius, String name) {
		super(name);
		if (radius < 0) this.radius = 0.0;
		else this.radius = radius;
	}
	
	
	
	/**
	 * @param circle - Circle to compare
	 * @return boolean - true if they are equal
	 */
	public boolean equals(Circle circle) {
		//make sure obj is a circle
		if (circle instanceof Circle) {
			Circle i = (Circle)circle;
			if ((this.name.equals(i.name)) && (this.getRadius() == i.getRadius())) return true;
			else return false; //if rank doesn't match return false
		}
		else return false; //if not the correct object type, it returns false.
	}
	
	
	
	/**
	 * @return String - String of all the information about the circle.
	 */
	public String toString() {
		return "Circle [Radius: " + this.radius + ", Area: " + this.getArea() + "]";
	}
	
	
	
	/**
	 * @return String - Name of teh object
	 */
	@Override
	public String getName() {
		return this.name;
	}
	
	
	
	/**
	 * @return double - radius of circle.
	 */
	public double getRadius() {
		return radius;
	}
	
	
	
	/**
	 * @return double - Area of the circle.
	 */
	public double getArea() {
		return (Math.PI * Math.pow(this.getRadius(), 2));
	}
	
}
