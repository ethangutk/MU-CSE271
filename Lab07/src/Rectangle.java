
public class Rectangle implements Shape{
	private int x, y;
	private double length, width;
	
	
	public Rectangle(int x, int y, double length, double width) {
		this.x = x;
		this.y = y;
		this.length = length;
		this.width = width;
	}
	
	public double getArea() {
		double returnValue = length * width;
		return returnValue;
	}
	
	public void scale(double factor) {
		this.length = (this.length * factor);
		this.width = (this.width * factor);
		
	}
	
	public boolean equals(Object otherObject) {
		boolean rv = true;
		if (otherObject != null && otherObject instanceof Rectangle) {
			Rectangle obj =  (Rectangle) otherObject;
			if (this.length != obj.length) rv = false;
			if (this.width  != obj.width) rv = false;
		}
		else rv = false;
		return rv;
	}

	public String toString() {
		return "Rectangle [x = " + this.x +", y = " + this.y +", length=" + this.length +", width=" + this.width +"]";
	}
}
