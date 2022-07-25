
public class Triangle {
	private double base, height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double getArea() {
		double area = base * height * 0.5;
		return area;
	}
	
	public void scale(double factor) {
		this.base *= factor;
		this.height *= factor;
	}
	
	public boolean equals(Object otherObject) {
		boolean rv = true;
		if (otherObject != null && otherObject instanceof Triangle) {
			Triangle obj =  (Triangle) otherObject;
			if (this.base != obj.base) rv = false;
			if (this.height != obj.height) rv = false;
		}
		else rv = false;
		
		
		return rv;
	}
	
	public String toString() {
		return "Triangle [base=" + this.base + ", height=" + this.height +"]";
	}
}
