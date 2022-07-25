
public class ShapeDriver {
	public static void main(String args[]) {
		Rectangle rectangle1 = new Rectangle(0, 0, 10.0, 5.0);
		Rectangle rectangle2 = new Rectangle(0, 0, 30.0, 10.0);
		Triangle triangle1 = new Triangle(10.0, 50.0);
		Triangle triangle2 = new Triangle(5.0, 10);
		
		
		//testing rectangle
		System.out.println("-----Testing Rectangle Class-----");
		//print general info
		System.out.println(rectangle1.toString());
		System.out.println(rectangle2.toString());
		//printing area
		System.out.println("Area of rectangle1; " + rectangle1.getArea());
		System.out.println("Area of rectangle2; " + rectangle2.getArea());
		
		
		//scaling 
		System.out.println("Scaling both rectangles by 0.5 and 2...");
		rectangle1.scale(0.5);
		rectangle2.scale(2);
		//reprint general info
		System.out.println(rectangle1.toString());
		System.out.println(rectangle2.toString());
		//printing area
		System.out.println("Area of rectangle1; " + rectangle1.getArea());
		System.out.println("Area of rectangle2; " + rectangle2.getArea());
		
		//equals method
		System.out.println(rectangle1.equals(rectangle2)); //false
		rectangle1 = new Rectangle(0, 0, 10.0, 5.0);
		rectangle2 = new Rectangle(0, 0, 10.0, 5.0);
		System.out.println(rectangle1.equals(rectangle2)); //true
		System.out.println(rectangle1.equals(triangle1)); //false
		System.out.println(rectangle1.equals(null)); //false
		
		
		
		
		//testing Triangle
		System.out.println("-----Testing Triangle Class-----");
		//print general info
		System.out.println(triangle1.toString());
		System.out.println(triangle2.toString());
		//printing area
		System.out.println("Area of triangle1; " + triangle1.getArea());
		System.out.println("Area of triangle2; " + triangle2.getArea());
		
		
		//scaling 
		System.out.println("Scaling both triangles by 0.5 and 2...");
		triangle1.scale(0.5);
		triangle2.scale(2);
		//reprint general info
		System.out.println(triangle1.toString());
		System.out.println(triangle2.toString());
		//printing area
		System.out.println("Area of triangle1; " + triangle1.getArea());
		System.out.println("Area of triangle2; " + triangle2.getArea());
		
		//equals method
		System.out.println(triangle1.equals(triangle2)); //false
		triangle1 = new Triangle(10.0, 5.0);
		triangle2 = new Triangle(10.0, 5.0);
		System.out.println(triangle1.equals(triangle2)); //true
		System.out.println(triangle1.equals(rectangle1)); //false
		System.out.println(triangle1.equals(null)); //false
	}
}
