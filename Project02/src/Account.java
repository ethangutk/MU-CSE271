




/**
 * @author Ethan Gutknecht
 */
public class Account {
	//variables
	private int id;
	private Customer customer;
	private double balance;
	static int numberTimesRun = 0;
	
	
	/** Creates
	 * @param customer (Customer) object to create the account by
	 */ 
	public Account(Customer customer) {
		this.id = 1000 + (10*numberTimesRun);
		this.customer = customer;
		this.balance = 0.0;
		
		numberTimesRun++;
	}
	
	
	/**
	 * @param customer (Customer) object to create the account by
	 * @param balance (double) value to be the balance of the account
	 */
	public Account(Customer customer, double balance) {
		this.id = 1000 + (10*numberTimesRun);
		this.customer = customer;
		this.balance = balance;
		
		numberTimesRun++;
	}
	
	
	/**
	 * @param account (Account) Make a copy of an account that is inputed
	 */
	public Account(Account account) {
		this.id = 1000 + (10*numberTimesRun);
		this.customer = account.getCustomer();
		this.balance = account.getBalance();
		
		numberTimesRun++;
	}

	
	/**
	 * @return int id of account
	 */
	public int getId() {
		return id;
	}

	
	/**
	 * @param id (int) sets a new id for account
	 */
	public void setId(int id) {
		this.id = id;
	}

	
	/**
	 * @return Customer customer under the account
	 */
	public Customer getCustomer() {
		return customer;
	}

	
	/**
	 * @param customer (Customer) new customer to set under account
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	/**
	 * @return double balance of account
	 */
	public double getBalance() {
		return balance;
	}

	
	/**
	 * @param balance (double) new value to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	/**
	 * @param amount (double) value to add to account balance
	 */
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	
	/**
	 * @param amount (double) attempted to withdrawl
	 * @return boolean true if successful 
	 */
	public boolean withdraw(double amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
			return true;
		}
		else return false;
	}
	
	
	/**
	 * @param account (Account) to test equality
	 * @return boolean true if equal, false if not
	 */
	public boolean equals(Account account) {
		boolean rv = true;
		//if anyone one of these if statements become true, the statement will return false.
		if (this.id != account.getId()) rv = false;
		if (!this.customer.equals(account.getCustomer())) rv = false; 
		if (this.balance != account.getBalance()) rv = false;
		return rv;
	}
	
	
	/**
	 * @return String values of the account in a String object
	 */
	public String toString() {
		return (this.id + ", " +  //account id
				this.customer.getId() + ", " +  //customer id
				this.customer.getName() + ", " + 
				this.customer.getAddress().getStreetNumber() + " " + 
				this.customer.getAddress().getStreetName() + ", " + 
				this.customer.getAddress().getCity() + ", " +
				this.customer.getAddress().getState() + ", " +
				this.customer.getAddress().getZipCode() + ", " +
				this.customer.getSsn() + ", " +
				this.balance);
	}
}
