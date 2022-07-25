import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTester {

	@Test
	void testCustomer() {
		Customer testCustomer = new Customer();
		
		assertEquals(null, testCustomer.getName());
		assertEquals(null, testCustomer.getSsn());
		assertEquals(0,    testCustomer.getAddress().getStreetNumber());
		assertEquals(null, testCustomer.getAddress().getStreetName());
		assertEquals(null, testCustomer.getAddress().getCity());
		assertEquals(null, testCustomer.getAddress().getState());
		assertEquals(null, testCustomer.getAddress().getZipCode());
		
	}

	@Test
	void testCustomerStringAddressString() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		
		assertEquals("Ethan Gutknecht", testCustomer.getName());
		assertEquals( "111-11-1111", testCustomer.getSsn());
		assertEquals(4800, testCustomer.getAddress().getStreetNumber());
		assertEquals("Westminster Road", testCustomer.getAddress().getStreetName());
		assertEquals("Broadview Heights", testCustomer.getAddress().getCity());
		assertEquals("OH", testCustomer.getAddress().getState());
		assertEquals("44147", testCustomer.getAddress().getZipCode());
	}

	@Test
	void testCustomerCustomer() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer1 = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		Customer testCustomer2 = new Customer(testCustomer1);
		Customer testCustomer3 = new Customer();
		assertEquals(true,  testCustomer1.equals(testCustomer2));
		assertEquals(false, testCustomer1.equals(testCustomer3));
	}

	@Test
	void testGetId() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		assertEquals(1000, testCustomer.getId());
	}

	@Test
	void testSetId() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		testCustomer.setId(1001);
		assertEquals(1001, testCustomer.getId());
	}

	@Test
	void testGetName() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		assertEquals("Ethan Gutknecht", testCustomer.getName());
	}

	@Test
	void testSetName() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Logan Gutknecht", testAddress, "111-11-1111");
		testCustomer.setName("Ethan Gutknecht");
		assertEquals("Ethan Gutknecht", testCustomer.getName());
	}

	@Test
	void testGetSsn() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		assertEquals("111-11-1111", testCustomer.getSsn());
	}

	@Test
	void testSetSsn() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		testCustomer.setSsn("222-22-2222");
		assertEquals("222-22-2222", testCustomer.getSsn());
	}

	@Test
	void testGetAddress() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		assertEquals(true, testCustomer.getAddress().equals(testAddress));
	}

	@Test
	void testSetAddress() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		Address newAddress = new Address(8888, "Lane Road", "Brecksville", "OH", "44141");
		testCustomer.setAddress(newAddress);
		assertEquals(true, testCustomer.getAddress().equals(newAddress));
	}

	@Test
	void testEqualsCustomer() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer1 = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		Customer testCustomer2 = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		Customer testCustomer3 = new Customer();

		assertEquals(true, testCustomer1.equals(testCustomer2));
		assertEquals(false, testCustomer1.equals(testCustomer3));
	}

	@Test
	void testToString() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Customer testCustomer = new Customer("Ethan Gutknecht", testAddress, "111-11-1111");
		
		assertEquals("1000, Ethan Gutknecht, 4800 Westminster Road, Broadview Heights, OH, 44147, 111-11-1111", testCustomer.toString());		
	}

}
