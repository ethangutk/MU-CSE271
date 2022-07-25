
public class CarDriver {
	public static void main(String args[]) {
		System.out.println("Main running...");
		
		Car car1 = new Car();
		System.out.println("Car's defult values: " + car1.toString()); //tests the initializing variable function and to string function
		
		car1 = new Car("Ethan", "Toyota", "Corola", 1998); //tests initialize 1
		System.out.println("Car's values using function 1: " + car1.toString()); //tests the initializing variable function and to string function
		
		car1 = new Car("Dennis", "Jeep", "Wrangler", 2017, (float)1.0); //tests initialize 2
		System.out.println("Car's values using function 2: " + car1.toString()); //tests the initializing variable function and to string function
		
		car1 = new Car("Ethan", "Toyota", "Corola", 1998, (float)1.0, 30, true); //tests initialize 3
		System.out.println("Car's values using function 3: " + car1.toString()); //tests the initializing variable function and to string function
		
		Car car2 = new Car(car1); //this creates a copy of car 1 in car 2 
		System.out.println("Car 1: " + car1.toString());
		System.out.println("Car 2: " + car2.toString()); // testing car copy function
		
		System.out.println("------------------"); //divider line making console more easy to read
		
		//testing if cars are the same
		System.out.println("Testing if cars are the same...");
		boolean areSame = car1.equals(car1);
		if (areSame == true) System.out.println("Cars are identical");
		else System.out.println("Cars are different");
		//tests if they are different at the end of the function
		
		System.out.println("------------------"); //divider line making console more easy to read
		
		//testing get and set functions
		System.out.println("Changing Car 2's information...");
		car2.setOwner("Dennis");
		car2.setMake("Jeep");
		car2.setModel("Wrangler");
		try {
			car2.setFuelLevel((float) 1.0);
			car2.setSpeed(60);
			car2.setYearModel(2017);
		}
		catch (IllegalAccessException e1) {
			System.out.println("Setting speed,");
		}
		car2.setStart(true);
		System.out.println("Car 2's new information:");
		System.out.println("Owner: " + car2.getOwner());
		System.out.println("Make: " + car2.getMake());
		System.out.println("Model: " + car2.getModel());
		System.out.println("Year: " + car2.getYearModel());
		System.out.println("Fuel: " + car2.getFuelLevel());
		System.out.println("Speed: " + car2.getSpeed());
		System.out.println("Start: " + car2.getStart());
		
		
		System.out.println("------------------"); //divider line making console more easy to read
		
		
		//testing accelerate function 1
		System.out.println("Accelerating Car 2 (current speed:" + car2.getSpeed() +", current fuel level:" + car2.getFuelLevel() + ")");
		boolean acclerationSuccessful = car2.accelerate();
		if (acclerationSuccessful == true) System.out.println("Acceleration Successful (current speed:" + car2.getSpeed() + ")");
		else if (acclerationSuccessful == false) System.out.println("Acceleration failed, not enough fuel");
		
		//testing accelerate function 2
		System.out.println("Accelerating Car 2 (current speed:" + car2.getSpeed() +", current fuel level:" + car2.getFuelLevel() + ")");
		acclerationSuccessful = car2.accelerate();
		if (acclerationSuccessful == true) System.out.println("Acceleration Successful (current speed:" + car2.getSpeed() + ")");
		else if (acclerationSuccessful == false) System.out.println("Acceleration failed, not enough fuel");
		
		//testing accelerate function 3
		System.out.println("Setting speed to 248mph and fuel level to 1.0");
		try {
			car2.setSpeed(248);
			car2.setFuelLevel((float) 1.0);
		} catch (IllegalAccessException e) {
			System.out.println("Setting fuel level failed.");
		}
		System.out.println("Accelerating Car 2 (current speed:" + car2.getSpeed() +", current fuel level:" + car2.getFuelLevel() + ")");
		acclerationSuccessful = car2.accelerate();
		if (acclerationSuccessful == true) System.out.println("Acceleration Successful (current speed:" + car2.getSpeed() + ")");
		else if (acclerationSuccessful == false) System.out.println("Acceleration failed.");
		System.out.println("Car's final speed:" + car2.getSpeed());
		
		//testing accelerate function 4
		System.out.println("Setting speed to 3mph and fuel level to 0.03");
		try {
			car2.setSpeed(3);
			car2.setFuelLevel((float) 0.03);
		} catch (IllegalAccessException e) {
			System.out.println("Setting fuel level failed.");
		}
		System.out.println("Accelerating Car 2 (current speed:" + car2.getSpeed() +", current fuel level:" + car2.getFuelLevel() + ")");
		acclerationSuccessful = car2.accelerate();
		if (acclerationSuccessful == true) System.out.println("Acceleration Successful (current speed:" + car2.getSpeed() + ")");
		else if (acclerationSuccessful == false) System.out.println("Acceleration failed.");
		System.out.println("Car's final speed:" + car2.getSpeed());
		
		System.out.println("------------------"); //divider line making console more easy to read
		
		
		//testing brake method 1
		boolean brakeSuccessful = car2.brake();
		if (brakeSuccessful) System.out.println("Braking successful; current speed:" + car2.getSpeed());
		else System.out.println("Braking failed; current speed:" + car2.getSpeed());
		
		//testing brake method 2
		System.out.println("Changing car 2's speed to 2mph");
		try {
			car2.setSpeed(2);
		} catch (IllegalAccessException e) {
			System.out.println("Setting speed failed.");
		}
		brakeSuccessful = car2.brake();
		if (brakeSuccessful) System.out.println("Braking successful; current speed:" + car2.getSpeed());
		else System.out.println("Braking failed; current speed:" + car2.getSpeed());
		
		//testing brake method 3
		System.out.println("Changing car 2's speed to -2mph, an illegal value");
		try {
			car2.setSpeed(-2);
		} catch (IllegalAccessException e) {
			System.out.println("Setting speed failed.");
		}
		brakeSuccessful = car2.brake();
		if (brakeSuccessful) System.out.println("Braking successful; current speed:" + car2.getSpeed());
		else System.out.println("Braking failed; current speed:" + car2.getSpeed());
		
		System.out.println("------------------"); //divider line making console more easy to read
		
		//testing if gas tank is empty method
		System.out.println("Changing fuel level of car 2 to 0.5");
		try {
			car2.setFuelLevel((float) 0.5);
		} catch (IllegalAccessException e) {
			System.out.println("Setting fuel level failed.");
		}
		boolean gasSuccessful = car2.isGasTankEmpty();
		if (gasSuccessful == false) System.out.println("Not empty; current fuel level:" + car2.getFuelLevel());
		else System.out.println("Empty; current fuel level:" + car2.getFuelLevel());
		
		System.out.println("...changing fuel level of car 2 to 0.03...");
		try {
			car2.setFuelLevel((float) 0.03);
		} catch (IllegalAccessException e) {
			System.out.println("Setting fuel level failed.");
		}
		gasSuccessful = car2.isGasTankEmpty();
		if (gasSuccessful == false) System.out.println("Not empty; current fuel level:" + car2.getFuelLevel());
		else System.out.println("Empty; current fuel level:" + car2.getFuelLevel());
		
		System.out.println("------------------"); //divider line making console more easy to read
		
		//testing owner function 1
		System.out.println("Owner of car 1: " + car1.getOwner() + " and owner of car 2: " + car2.getOwner());
		boolean sameOwner = car1.sameOwner(car2);
		if (sameOwner == true) System.out.println("The owner of the car is the same");
		else System.out.println("The owners of the cars are different");
		System.out.println("...changing owners of the car so they are the same...");
		
		car2.setOwner("Ethan");
		//testing owner function 2
		System.out.println("Owner of car 1: " + car1.getOwner() + " and owner of car 2: " + car2.getOwner());
		sameOwner = car1.sameOwner(car2);
		if (sameOwner == true) System.out.println("The owner of the car is the same");
		else System.out.println("The owners of the cars are different");
		
		System.out.println("------------------"); //divider line making console more easy to read
		
		System.out.println("Testing if cars are the same...");
		areSame = car1.equals(car2);
		if (areSame == true) System.out.println("Cars are identical");
		else  System.out.println("Cars are different");
		
		System.out.println("------------------");
		
		System.out.println("Finished testing all outcomes.");
	}
}





