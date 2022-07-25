import static org.junit.Assert.*;
import org.junit.Test;

public class CarTester {
	double delta = 0.0000001;
	
	//test car defults
	@Test
	public void testCar() {
		Car testCarDefults = new Car();
		
		assertEquals(null, testCarDefults.getOwner());
		assertEquals(null, testCarDefults.getMake());
		assertEquals(null, testCarDefults.getModel());
		assertEquals(2020, testCarDefults.getYearModel());
		assertEquals(1.0f, testCarDefults.getFuelLevel(), delta);
		assertEquals(0, testCarDefults.getSpeed());
		assertEquals(false, testCarDefults.getStart());	
	}
	//test first car initialize 
	@Test
	public void testCarStringStringStringInt() {
		Car ethansCar = new Car("Ethan", "Jeep", "Wrangler", 2017);
		
		assertEquals("Ethan", ethansCar.getOwner());
		assertEquals("Jeep", ethansCar.getMake());
		assertEquals("Wrangler", ethansCar.getModel());
		assertEquals(2017, ethansCar.getYearModel());
	}
	//test second car initialize 
	@Test
	public void testCarStringStringStringIntFloat() {
		Car ethansCar = new Car("Ethan", "Jeep", "Wrangler", 2017, 1.0f);
		
		assertEquals("Ethan", ethansCar.getOwner());
		assertEquals("Jeep", ethansCar.getMake());
		assertEquals("Wrangler", ethansCar.getModel());
		assertEquals(2017, ethansCar.getYearModel());
		assertEquals(1.0f, ethansCar.getFuelLevel(), delta);
	}
	//test third car initialize 
	@Test
	public void testCarStringStringStringIntFloatIntBoolean() {
		Car ethansCar = new Car("Ethan", "Jeep", "Wrangler", 2017, 1.0f, 0, false);
		
		assertEquals("Ethan", ethansCar.getOwner());
		assertEquals("Jeep", ethansCar.getMake());
		assertEquals("Wrangler", ethansCar.getModel());
		assertEquals(2017, ethansCar.getYearModel());
		assertEquals(1.0f, ethansCar.getFuelLevel(), delta);
		assertEquals(0, ethansCar.getSpeed());
		assertEquals(false, ethansCar.getStart());	
	}
	//test car copy method
	@Test
	public void testCarCar() {
		Car car1 = new Car("Ethan", "Jeep", "Wrangler", 2017, 1.0f, 0, false);
		Car car2 = new Car(car1);
		//copied car 1 to car 2
		assertEquals("Owner: Ethan, Make: Jeep, Model: Wrangler, Year: 2017, Speed: 0, Fuel Level: 1.0"
				, car2.toString());	//testing it
	}

	
	
	//test get owner
	@Test
	public void testGetOwner() {
		Car ethansCar = new Car("Ethan", "Jeep", "Wrangler", 2017, 1.0f, 0, false);
		assertEquals("Ethan", ethansCar.getOwner());
	}
	//test set owner
	@Test
	public void testSetOwner() {
		Car defultCar = new Car();
		defultCar.setOwner("Ethan");
		assertEquals("Ethan", defultCar.getOwner());
	}

	
	//test get make
	@Test
	public void testGetMake() {
		Car ethansCar = new Car("Ethan", "Jeep", "Wrangler", 2017, 1.0f, 0, false);
		assertEquals("Jeep", ethansCar.getMake());
	}
	//test set make
	@Test
	public void testSetMake() {
		Car defultCar = new Car();
		defultCar.setMake("Jeep");
		assertEquals("Jeep", defultCar.getMake());
	}

	
	//test get model
	@Test
	public void testGetModel() {
		Car ethansCar = new Car("Ethan", "Jeep", "Wrangler", 2017, 1.0f, 0, false);
		assertEquals("Wrangler", ethansCar.getModel());
	}
	//test set model
	@Test
	public void testSetModel() { //multiple cases
		Car defultCar = new Car();
		defultCar.setModel("Wrangler");
		assertEquals("Wrangler", defultCar.getModel());
	}

	
	//test get year
	@Test
	public void testGetYearModel() {
		Car ethansCar = new Car("Ethan", "Jeep", "Wrangler", 2017, 1.0f, 0, false);
		assertEquals(2017, ethansCar.getYearModel());
	}
	//test set year (normal values)
	@Test
	public void testSetYearModel() {
		Car defultCar = new Car();
		defultCar.setYearModel(2017);;
		assertEquals(2017, defultCar.getYearModel());
	}
	//test set year (illegal values)
	@Test(expected=IllegalArgumentException.class) 
	public void testSetYearModelException() {
		Car defultCar = new Car();
		defultCar.setYearModel(1600);
		defultCar.setYearModel(2023);		
	}

	
	//test get fuel level
	@Test
	public void testGetFuelLevel() {
		Car ethansCar = new Car("Ethan", "Jeep", "Wrangler", 2017, 0.5f, 0, false);
		assertEquals(0.5f, ethansCar.getFuelLevel(), delta);
	}
	//test set fuel level (normal values)
	@Test
	public void testSetFuelLevel() {
		Car defultCar = new Car();
		
		defultCar.setFuelLevel(0.5f);;;
		assertEquals(0.5f, defultCar.getFuelLevel(), delta);
	}
	//test set fuel level (illegal values)
	@Test(expected=IllegalArgumentException.class)
	public void testSetFuelLevelException() {
		Car defultCar = new Car();
		defultCar.setFuelLevel(-0.4f);
		defultCar.setFuelLevel(1.3f);
	}
	
	//test get speed
	@Test
	public void testGetSpeed() {
		Car ethansCar = new Car("Ethan", "Jeep", "Wrangler", 2017, 0.5f, 55, false);
		assertEquals(55, ethansCar.getSpeed());
	}
	//test set speed (normal values)
	@Test
	public void testSetSpeed() {
		Car defultCar = new Car();
		defultCar.setSpeed(50);
		assertEquals(50, defultCar.getSpeed());
	}
	//test get speed (illegal values)
	@Test(expected=IllegalArgumentException.class) 
	public void testSetSpeedException() {
		Car defultCar = new Car();
		defultCar.setSpeed(-5);
		defultCar.setSpeed(260);	
	}

	
	//test get start
	@Test
	public void testGetStart() {
		Car ethansCar = new Car("Ethan", "Jeep", "Wrangler", 2017, 0.5f, 55, true);
		assertEquals(true, ethansCar.getStart());
	}
	//test set start
	@Test
	public void testSetStart() {
		Car defultCar = new Car();
		defultCar.setStart(true);;
		assertEquals(true, defultCar.getStart());
	}

	@Test
	public void testAccelerate() {
		//car on and has gas
		Car ethansCar = new Car("Ethan", "Jeep", "Wrangler", 2017, 0.5f, 55, true);
		
		//car off -- has gas -- speed max
		ethansCar.setStart(false);
		ethansCar.setFuelLevel(1.0f);
		ethansCar.setSpeed(250);
		assertEquals(false, ethansCar.accelerate());
		
		//car off -- has gas -- speed 0
		ethansCar.setStart(false);
		ethansCar.setFuelLevel(1.0f);
		ethansCar.setSpeed(0);
		assertEquals(false, ethansCar.accelerate());
		
		//car off -- no gas -- speed max
		ethansCar.setStart(false);
		ethansCar.setFuelLevel(0.0f);
		ethansCar.setSpeed(250);
		assertEquals(false, ethansCar.accelerate());
				
		//car off -- no gas -- speed 0
		ethansCar.setStart(false);
		ethansCar.setFuelLevel(0.0f);
		ethansCar.setSpeed(0);
		assertEquals(false, ethansCar.accelerate());
		
		//car on -- has gas -- speed max
		ethansCar.setStart(true);
		ethansCar.setFuelLevel(1.0f);
		ethansCar.setSpeed(250);
		assertEquals(false, ethansCar.accelerate());
		
		//car on -- has gas -- speed 0  ///THIS IS THE ONLY
		ethansCar.setStart(true);
		ethansCar.setFuelLevel(1.0f);
		ethansCar.setSpeed(0);
		assertEquals(true, ethansCar.accelerate());
		
		//car on -- no gas -- speed max
		ethansCar.setStart(true);
		ethansCar.setFuelLevel(0.0f);
		ethansCar.setSpeed(250);
		assertEquals(false, ethansCar.accelerate());
		
		//car on -- no gas -- speed 0
		ethansCar.setStart(true);
		ethansCar.setFuelLevel(0.0f);
		ethansCar.setSpeed(0);
		assertEquals(false, ethansCar.accelerate());

	}

	@Test
	public void testBrake() {
		//if speed is 0
		//if start is false
		Car ethansCar = new Car("Ethan", "Jeep", "Wrangler", 2017, 0.5f, 55, true);
		
		//no speed car off
		ethansCar.setStart(false);
		ethansCar.setSpeed(0);
		assertEquals(false, ethansCar.brake());
		
		//no speed car on
		ethansCar.setStart(true);
		ethansCar.setSpeed(0);
		assertEquals(false, ethansCar.brake());
		
		//speed car off
		ethansCar.setStart(false);
		ethansCar.setSpeed(50);
		assertEquals(false, ethansCar.brake());
		
		//speed car on
		ethansCar.setStart(true);
		ethansCar.setSpeed(10);
		assertEquals(true, ethansCar.brake());
		
	}

	@Test
	public void testIsGasTankEmpty() {
		Car ethansCar = new Car("Ethan", "Jeep", "Wrangler", 2017, 0.0f, 55, true);
		assertEquals(true, ethansCar.isGasTankEmpty());
		ethansCar.setFuelLevel(0.5f);
		assertEquals(false, ethansCar.isGasTankEmpty());
	}

	@Test
	public void testSameOwner() {
		Car carDefults = new Car();
		Car ethansCar = new Car("Ethan", "Jeep", "Wrangler", 2017, 0.0f, 55, true);
		assertEquals(false, ethansCar.sameOwner(carDefults));
		carDefults.setOwner("Ethan");
		assertEquals(true, ethansCar.sameOwner(carDefults));
	}

	@Test
	public void testEqualsCar() {
		//if they are not the same
		Car car1 = new Car("Ethan", "Jeep", "Wrangler", 2017, 0.0f, 55, true);
		Car car2 = new Car("Ethan", "Jeep", "Wrangler", 2017, 0.0f, 55, true);
		//same car
		assertEquals(true, car1.equals(car2));
		//different make
		car2.setYearModel(2017);
		car2.setModel("Wrangler");
		car2.setMake("Different");
		assertEquals(false, car1.equals(car2));
		//different model
		car2.setYearModel(2017);
		car2.setModel("Different");
		car2.setMake("Jeep");
		assertEquals(false, car1.equals(car2));
		//different year
		car2.setYearModel(2019);
		car2.setModel("Wrangler");
		car2.setMake("Jeep");
		assertEquals(false, car1.equals(car2));
	}

	@Test
	public void testToString() {
		Car testCarDefults = new Car("Ethan", "Jeep", "Wrangler", 2017, 1.0f, 0, false);
		assertEquals("Owner: Ethan, Make: Jeep, Model: Wrangler, Year: 2017, Speed: 0, Fuel Level: 1.0", testCarDefults.toString());
	}
}
