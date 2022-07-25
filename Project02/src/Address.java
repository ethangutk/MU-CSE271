




/**
 * @author Ethan Gutknecht
 */
public class Address {
	//variables
	private int streetNumber;
	private String streetName, city, state, zipCode;
	
	
	/**
	 * Creates an address with no parameters
	 */
	public Address() {
		this.streetNumber = 0;
		this.streetName = null;
		this.city = null;
		this.state = null;
		this.zipCode = null;
	}
	
	
	/**
	 * @param streetNumber (int) Street number of address object
	 * @param streetName (String) Name of the street in address object
	 * @param city (String) Name of the city in the address object
	 * @param state (String) Name of the state in the address object
	 * @param zipCode (String) Name of the zip code in the address object 
	 */
	public Address(int streetNumber, String streetName, String city, String state, String zipCode) {
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	
	/**
	 * @param address (Address) address object to copy
	 */
	public Address(Address address) {
		this.streetNumber = address.streetNumber;
		this.streetName = address.streetName;
		this.city = address.city;
		this.state = address.state;
		this.zipCode = address.zipCode;
	}

	
	/**
	 * @return int Street number from address object
	 */
	public int getStreetNumber() {
		return streetNumber;
	}

	
	/**
	 * @param streetNumber (int) new street number to set for address object
	 */
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	
	/**
	 * @return String street name of address object
	 */
	public String getStreetName() {
		return streetName;
	}

	
	/**
	 * @param streetName (String) new street name to set for the address object
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	
	/**
	 * @return String city of address object
	 */
	public String getCity() {
		return city;
	}

	
	/**
	 * @param city (String) new city to set for address object
	 */
	public void setCity(String city) {
		this.city = city;
	}

	
	/**
	 * @return String state in the address object
	 */
	public String getState() {
		return state;
	}

	
	/**
	 * @param state (String) new state to set for address object
	 */
	public void setState(String state) {
		this.state = state;
	}

	
	/**
	 * @return String zip code of address object
	 */
	public String getZipCode() {
		return zipCode;
	}
	
	
	/** 
	 * @param zipCode (String) new zip code 
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
	/**
	 * @param address (Address) address being compaired to see if they are equal
	 * @return boolean if they are equal returns true.  If not, false.
	 */
	public boolean equals(Address address) {
		boolean rv = true;
		//if anyone one of these if statements become true, the statement will return false.
		if (this.streetNumber != address.streetNumber) rv = false;
		if (!this.streetName.equals(address.streetName)) rv = false; 
		if (!this.city.equals(address.city)) rv = false;
		if (!this.state.equals(address.state)) rv = false;
		if (!this.zipCode.equals(address.zipCode)) rv = false;
		return rv;
	}
	
	
	/**
	 * @return String of all the values in the address object.
	 */
	public String toString() {
		return (this.streetNumber + " " + this.streetName + ", " + this.city + ", " + this.state + ", " + this.zipCode);
	}
	
	
	
	
}
