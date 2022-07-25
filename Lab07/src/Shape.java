
public interface Shape {
	/**
	 * 
	 * @return return a double value of the shape, formula for area varies by shape
	 */
	double getArea();
	
	/**
	 * 
	 * @param factor What factor the shape will be scaled up or down by
	 */
	void scale(double factor);
}
