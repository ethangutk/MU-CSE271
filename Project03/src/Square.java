/**
 * Project_03
 * Object-Oriented Programming, CSE 271, Spring 2020
 * @author Ethan Gutknecht
 */

public class Square extends Shape implements Area {
	private double side;
	
	
	
	/**
	 * Square constructor with no parameters.
	 */
	public Square(){
		super();
		setSide(0.0);
	}
	
	
	
	/**
	 * Square constructor with parameters
	 * @param radius - Radius to set of new Square
	 * @param name - Name to set of new Square
	 */
	public Square(double side, String name) {
		super(name);
		setSide(side);
	}
	
	
	
	/**
	 * @param side - side to set to Square
	 */
	public void setSide(double side) {
		if (side < 0) this.side = 0.0;
		else this.side = side;
	}
	
	
	
	/**
	 * @param square - square to compare
	 * @return boolean - true if they are equal
	 */
	public boolean equals(Square square) {
		//make sure obj is a Square
		if (square instanceof Square) {
			Square i = (Square)square;
			if ((this.name.equals(i.name)) && (this.getSide() == i.getSide())) return true;
			else return false; //if rank doesn't match return false
		}
		else return false; //if not the correct object type, it returns false.
	}
	
	
	
	/**
	 * @return String - String of all the information about the Square.
	 */
	public String toString() {
		return "Square [Side: " + this.getSide() + ", Area: " + this.getArea() + "]";
	}

	
	
	/**
	 * @return double - Area of the square.
	 */
	public double getArea() {
		return (Math.pow(this.getSide(), 2));
	}
	
	
	
	/**
	 * @return double - radius of Square.
	 */
	public double getSide() {
		return side;
	}
	
	
	
	@Override
	public String getName() {
		return this.name;
	}
}
