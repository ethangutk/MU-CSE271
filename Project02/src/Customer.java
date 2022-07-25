




/**
 * @author Ethan Gutknecht
 */
public class Customer {
	//variables
	private int id;
	private String name, ssn;
	private Address address;
	static int numberTimesRun = 0;
	
	
	/** Creates defult version of the customer object when there aren't any parameters.
	 * 
	 */
	public Customer() {
		this.name = null;
		this.address = new Address();
		this.ssn = null;
		this.id = (1000 + numberTimesRun);
		
		numberTimesRun++;
	}
	
	
	/**
	 * @param name (String) object for the name variable
	 * @param address (Address) object for the address variable
	 * @param ssn (String) object for the social security number
	 */
	public Customer(String name, Address address, String ssn) {
		this.name = name;
		this.address = address;
		this.ssn = ssn;
		this.id = (1000 + numberTimesRun);
		numberTimesRun++;
	}
	
	
	/**
	 * @param customer (Customer) Create a copy of the input customer object
	 */
	public Customer(Customer customer) {
		this.name = customer.name;
		this.address = customer.address;
		this.ssn = customer.ssn;
		this.id = (1000 + numberTimesRun);
		numberTimesRun++;
	}
	
		
	/**
	 * @return int id of the customer
	 */
	public int getId() {
		return id;
	}
	
	
	/**
	 * @param id (int) new id to set for the customer
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	
	/**
	 * @return String name of customer
	 */
	public String getName() {
		return name;
	}

	
	/**
	 * @param name (String) new name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	/**
	 * @return String social security number of customer
	 */
	public String getSsn() {
		return ssn;
	}

	
	/**
	 * @param ssn (String) new social security number to set for customer
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	/**
	 * @return Address address of customer
	 */
	public Address getAddress() {
		return address;
	}

	
	/**
	 * @param address (Address) new address to set for customer
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	/**
	 * @param customer (Customer) customer to test equality with
	 * @return boolean true if they are equal
	 */
	public boolean equals(Customer customer) {
		boolean rv = true;
		//if anyone one of these if statements become true, the statement will return false.
		if (this.name != customer.name) rv = false;
		if (!this.ssn.equals(customer.ssn)) rv = false; 
		if (!this.address.equals(customer.address)) rv = false;
		return rv;
	}
	
	
	/**
	 * @return String of all values connected with customer.
	 */
	public String toString() {
		return (this.id + ", " + 
				this.name + ", " + 
				this.address.getStreetNumber() + " " + 
				this.address.getStreetName() + ", " + 
				this.address.getCity() + ", " +
				this.address.getState() + ", " +
				this.address.getZipCode() + ", " +
				this.ssn);

	}
	
	
	
}
