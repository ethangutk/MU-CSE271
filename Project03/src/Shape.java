/**
 * Project_03
 * Object-Oriented Programming, CSE 271, Spring 2020
 * @author Ethan Gutknecht
 */

abstract class Shape {
	//variables
	public String name;
	
	
	/** 
	 * Shape contructor for shape with no parameters
	 */
	public Shape() {
		this.name = null;
	}
	
	/** 
	 * Shape contructor for shape with name parameter
	 * @param name - Name of the shape
	 */
	Shape(String name){
		this.name = name;
	}
	
	/**
	 * Abstract method of get name.
	 */
	abstract String getName();
}
