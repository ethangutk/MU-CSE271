
public class Car {
	/**
	 * @author Ethan Gutknecht
	 */
	
	
	// Declare variables or properties
	public int yearModel, numberOfWheels, speed;
	public String make;
	public double fuelLevel;
	
	
	/**
	 * @return Void
	 */
	public void accelerate() {
		if (fuelLevel >= 0.5) { //checks car fuel to proceed
			speed +=  4;
			fuelLevel -= 0.5;
		}
	}
	
	
	
	/**
	 * @return Void
	 */
	public void brake() {
		if (speed > 3) { //checks car speed to proceed
			speed =- 3;
		}
		else {
			speed = 0;
		}
	}
	
	
	
	/**
	 * @return Boolean: if the cars are equal it will return true, if not false
	 */
	public boolean equals(Car c) {
		boolean returnValue = true;
		if(!make.equals(c.make)) returnValue = false; //if any one of these don't equal return value changes
		if(c.yearModel != yearModel) returnValue = false;
		if(c.numberOfWheels != numberOfWheels) returnValue = false;
		
		return returnValue;
	}
	
	
	
	/**
	 * @return String: text description of a car
	 */
	public String toString() {
		String returnString = "";
		returnString += "Make: " + make + ", "; //make
		returnString += "Year: " + yearModel + ", "; //make
		returnString += "Wheels: " + numberOfWheels + ", "; //make
		returnString += "Speed: " + speed + ", "; //make
		returnString += "Fuel Level: " + fuelLevel; //make
		
		return returnString;
	}
}
