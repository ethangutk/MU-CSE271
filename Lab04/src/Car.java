	/** @author Ethan Gutknecht
	 *  
	 */

public class Car {
	private String owner, make, model;
	private int yearModel, speed;
	private float fuelLevel;
	private boolean start;
	
	/** @apiNote initializes values if they are not already done so
	 * 
	 */
	public Car() { //initialize blank
		this.speed = 0;
		this.fuelLevel = (float) 1.0;
		this.start = false;
		this.yearModel = 2020;
		this.owner = null;
		this.make = null;
		this.model = null;
	}
	
	/**@param Owner of the car's name
	 * @param Make of the car
	 * @param Model of the car
	 * @param year of the car
	 * 
	 * @apiNote initializes variables upon user input
	 * 
	 */
	public Car(String owner, String make, String model, int yearModel) {//initialize 1
		this.yearModel = yearModel;
		this.owner = owner;
		this.make = make;
		this.model = model;
	}
	
	/**@param Owner of the car's name
	 * @param Make of the car
	 * @param Model of the car
	 * @param year of the car
	 * @param fuel level of the car
	 * 
	 * @apiNote initializes variables upon user input
	 * 
	 */
	public Car(String owner, String make, String model, int yearModel, float fuelLevel) {//initialize 2
		this.fuelLevel = fuelLevel;
		this.yearModel = yearModel;
		this.owner = owner;
		this.make = make;
		this.model = model;
	}
	
	/**@param Owner of the car's name
	 * @param Make of the car
	 * @param Model of the car
	 * @param year of the car
	 * @param fuel level of the car
	 * @param Speed of the car
	 * @param if the car is on
	 * 
	 * @apiNote initializes variables upon user input
	 * 
	 */
	public Car(String owner, String make, String model, int yearModel, float fuelLevel, int speed, boolean start) {//initialize 3
		this.speed = speed;
		this.fuelLevel = fuelLevel;
		this.start = start;
		this.yearModel = yearModel;
		this.owner = owner;
		this.make = make;
		this.model = model;
	}
	
	/** @param car that we are copying
	 * 
	 * @apiNote creates a copy of a car upon input of another car
	 * 
	 */
	public Car(Car anotherCar) {
		this.speed = anotherCar.speed;
		this.fuelLevel = anotherCar.fuelLevel;
		this.start = anotherCar.start;
		this.yearModel = anotherCar.yearModel;
		this.owner = anotherCar.owner;
		this.make = anotherCar.make;
		this.model = anotherCar.make;
	}

	
	
	
	
	/**@param owner name to set
	 * @apiNote sets new owner to car
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**@param make to set
	 * @apiNote sets new make to car
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**@param model to set
	 * @apiNote sets new model to car
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**@param year to set
	 * @apiNote sets new year to car
	 */
	public void setYearModel(int yearModel) {
		if (yearModel <= 2021 && yearModel >= 1885) {
			this.yearModel = yearModel;
		}
		else throw new IllegalArgumentException("Year has to be between 2021 and 1885");
	}

	/**@param fuel level to set
	 * @apiNote sets new fuel level to car
	 */
	public void setFuelLevel(float fuelLevel) throws IllegalAccessException {
		if (fuelLevel >= (float)0.0 && fuelLevel <= (float)1.0) {
			this.fuelLevel = fuelLevel;
		}
		else throw new IllegalArgumentException("Fuel level has to be between 0.0 and 1.0.");
		
	}

	/**@param speed to set
	 * @apiNote sets new speed to car
	 */
	public void setSpeed(int speed) throws IllegalAccessException {
		if (fuelLevel >= 0 && fuelLevel <= 250) {
			this.speed = speed;
		}
		else throw new IllegalArgumentException("Speed has to be between 0 and 250.");
	}

	/**@param start value to set
	 * @apiNote sets new start value to car
	 */
	public void setStart(boolean start) {
		this.start = start;
	}

	/**@returns current owner of car
	 * @apiNote returns owner of the car
	 */
	public String getOwner() {
		return this.owner;
	}

	/**@returns current make of car
	 * @apiNote returns make of the car
	 */
	public String getMake() {
		return this.make;
	}

	/**@returns current model of car
	 * @apiNote returns model of the car
	 */
	public String getModel() {
		return this.model;
	}

	/**@returns current year of car
	 * @apiNote returns year of the car
	 */
	public int getYearModel() {
		return this.yearModel;
	}

	/**@returns current fuel level of car
	 * @apiNote returns fuel level of the car
	 */
	public float getFuelLevel() {
		return this.fuelLevel;
	}

	/**@returns current speed of car
	 * @apiNote returns speed of the car
	 */
	public int getSpeed() {
		return this.speed;
	}

	/**@returns current start value of car
	 * @apiNote returns start value of the car
	 */
	public boolean getStart() {
		return this.start;
	}
	
	
	
	
	/**@returns boolean if successful
	 * @apiNote accelerates the car 4mph if the fuel is 0.5>
	 */
	public boolean accelerate() {
		boolean rv = false;
		if (this.fuelLevel >= 0.05 && this.start == true && this.speed < 247) { //checks car fuel to proceed
			this.speed +=  4;
			this.fuelLevel -= 0.5;
			rv = true;
		}
		else if (this.fuelLevel >= 0.05 && this.start == true && this.speed >= 247 && this.speed < 250) { //checks car fuel to proceed
			this.speed = 250;
			this.fuelLevel -= 0.5;
			rv = true;
		}
		return rv;
	}
	
	/**@returns boolean if successful
	 * @apiNote brakes the car 3mph, if cars current speed is under 3mph then it sets speed to zero, else sets speed to zero.
	 */
	public boolean brake() {
		boolean rv = false;
		if (this.speed > 3) { //checks car speed to proceed
			this.speed -= 3;
			rv = true;
		}
		else if (this.speed <= 3 && this.speed > 0){
			this.speed = 0;
			rv = true;
		}
		else this.speed = 0;
		return rv;
	}
	
	/**@returns boolean if successful
	 * @apiNote checks if gas tank is empty
	 */
	public boolean isGasTankEmpty() {
		boolean rv = false;
		if (this.fuelLevel < 0.05) rv = true;
		return rv;
	}
	
	/**@returns true if they are the same
	 * @apiNote checks if owners are the same
	 */
	public boolean sameOwner(Car anotherCar) {
		boolean rv = false;
		if (this.owner.equalsIgnoreCase(anotherCar.owner)) rv = true;
		return rv;
	}
	
	/**@returns true if they are the same
	 * @apiNote checks if cars are the same only comparing make year and model
	 */
	public boolean equals(Car anotherCar) {
		boolean rv = true;
		if(!this.make.equals(anotherCar.make)) rv = false; //if any one of these don't equal return value changes
		if(this.yearModel != anotherCar.yearModel) rv = false;
		if(!this.model.equals(anotherCar.model)) rv = false;
		return rv;
	}
	
	/**@returns string of all the car values
	 * @apiNote this returns a string of all the values of the car inputed
	 */
	public String toString() {
		return ("Owner: " + this.owner +
				", Make: " + this.make +
				", Model: " + this.model +
				", Year: " + this.yearModel +
				", Speed: " + this.speed +
				", Fuel Level: " + this.fuelLevel);
	}
	
}

