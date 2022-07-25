import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTester {

	@Test
	void testAccountCustomer() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		Account testAccount = new Account(testCustomer);
		
		assertEquals(0.00, testAccount.getBalance());
		assertEquals("Ethan Gutknecht", testAccount.getCustomer().getName());
		assertEquals( "111-11-1111", testAccount.getCustomer().getSsn());
		assertEquals(4800, testAccount.getCustomer().getAddress().getStreetNumber());
		assertEquals("Westminster Road", testAccount.getCustomer().getAddress().getStreetName());
		assertEquals("Broadview Heights", testAccount.getCustomer().getAddress().getCity());
		assertEquals("OH", testAccount.getCustomer().getAddress().getState());
		assertEquals("44147", testAccount.getCustomer().getAddress().getZipCode());
	}

	@Test
	void testAccountCustomerDouble() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		Account testAccount = new Account(testCustomer, 1000.00);
		
		assertEquals(1000.00, testAccount.getBalance());
		assertEquals("Ethan Gutknecht", testAccount.getCustomer().getName());
		assertEquals( "111-11-1111", testAccount.getCustomer().getSsn());
		assertEquals(4800, testAccount.getCustomer().getAddress().getStreetNumber());
		assertEquals("Westminster Road", testAccount.getCustomer().getAddress().getStreetName());
		assertEquals("Broadview Heights", testAccount.getCustomer().getAddress().getCity());
		assertEquals("OH", testAccount.getCustomer().getAddress().getState());
		assertEquals("44147", testAccount.getCustomer().getAddress().getZipCode());
	}

	@Test
	void testAccountAccount() {
		Address  testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		Account  tempAccount = new Account(testCustomer);
		Account  testAccount = new Account(tempAccount);
		
		assertEquals(0.00, testAccount.getBalance());
		assertEquals("Ethan Gutknecht", testAccount.getCustomer().getName());
		assertEquals( "111-11-1111", testAccount.getCustomer().getSsn());
		assertEquals(4800, testAccount.getCustomer().getAddress().getStreetNumber());
		assertEquals("Westminster Road", testAccount.getCustomer().getAddress().getStreetName());
		assertEquals("Broadview Heights", testAccount.getCustomer().getAddress().getCity());
		assertEquals("OH", testAccount.getCustomer().getAddress().getState());
		assertEquals("44147", testAccount.getCustomer().getAddress().getZipCode());
	}

	@Test
	void testGetId() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		Account testAccount = new Account(testCustomer, 1000.00);
		assertEquals(1020, testAccount.getId());
	}

	@Test
	void testSetId() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		Account testAccount = new Account(testCustomer, 1000.00);
		testAccount.setId(1010);
		assertEquals(1010, testAccount.getId());
	}

	@Test
	void testGetCustomer() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		Account testAccount = new Account(testCustomer, 1000.00);
		
		assertEquals(true, testAccount.getCustomer().equals(testCustomer));
	}

	@Test
	void testSetCustomer() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer1 = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		Customer testCustomer2 = new Customer("Logan Gutknecht", testAddress, "222-11-1111");
		Account testAccount = new Account(testCustomer1, 1000.00);
		
		testAccount.setCustomer(testCustomer2);
		assertEquals(true, testAccount.getCustomer().equals(testCustomer2));
	}

	@Test
	void testGetBalance() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		Account testAccount = new Account(testCustomer, 1000.00);
		
		assertEquals(1000.00, testAccount.getBalance());
	}

	@Test
	void testSetBalance() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		Account testAccount = new Account(testCustomer, 1000.00);
		
		testAccount.setBalance(2000.00);
		assertEquals(2000.00, testAccount.getBalance());
	}

	@Test
	void testDeposit() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		Account testAccount = new Account(testCustomer, 1000.00);
		
		testAccount.deposit(500.00);
		assertEquals(1500.00, testAccount.getBalance());
	}

	@Test
	void testWithdraw() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		Account testAccount = new Account(testCustomer, 1000.00);
		
		assertEquals(true, testAccount.withdraw(500.00));
		assertEquals(false, testAccount.withdraw(1000.00));
	}

	@Test
	void testEqualsAccount() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer1 = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		Customer testCustomer2 = new Customer("Ethan Gutknecht", testAddress, "222-22-2222");
		Account testAccount1 = new Account(testCustomer1, 1000.00);
		Account testAccount2 = new Account(testCustomer2, 1500.00);
		
		assertEquals(true,  testAccount1.equals(testAccount1));
		assertEquals(false, testAccount1.equals(testAccount2));
		
		
	}

	@Test
	void testToString() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		Account testAccount = new Account(testCustomer, 1000.00);
		
		assertEquals("1040, 1003, Ethan Gutknecht, 4800 Westminster Road, Broadview Heights, OH, 44147, 111-11-1111, 1000.0",
				testAccount.toString());
	}

}
