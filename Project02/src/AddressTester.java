import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddressTester {

	@Test
	void testAddress() {
		Address testAddress = new Address();
		assertEquals(0, testAddress.getStreetNumber());
		assertEquals(null, testAddress.getStreetName());
		assertEquals(null, testAddress.getCity());
		assertEquals(null, testAddress.getState());
		assertEquals(null, testAddress.getZipCode());
	}

	@Test
	void testAddressIntStringStringStringString() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		assertEquals(4800, testAddress.getStreetNumber());
		assertEquals("Westminster Road", testAddress.getStreetName());
		assertEquals("Broadview Heights", testAddress.getCity());
		assertEquals("OH", testAddress.getState());
		assertEquals("44147", testAddress.getZipCode());
	}

	@Test
	void testAddressAddress() {
		Address myAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Address testAddress = new Address(myAddress);
		assertEquals(4800, testAddress.getStreetNumber());
		assertEquals("Westminster Road", testAddress.getStreetName());
		assertEquals("Broadview Heights", testAddress.getCity());
		assertEquals("OH", testAddress.getState());
		assertEquals("44147", testAddress.getZipCode());
	}

	@Test
	void testGetStreetNumber() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		assertEquals(4800, testAddress.getStreetNumber());
	}

	@Test
	void testSetStreetNumber() {
		Address testAddress = new Address();
		testAddress.setStreetNumber(4800);
		assertEquals(4800, testAddress.getStreetNumber());
	}

	@Test
	void testGetStreetName() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		assertEquals("Westminster Road", testAddress.getStreetName());
	}

	@Test
	void testSetStreetName() {
		Address testAddress = new Address();
		testAddress.setStreetName("Westminster Road");
		assertEquals("Westminster Road", testAddress.getStreetName());
	}

	@Test
	void testGetCity() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		assertEquals("Broadview Heights", testAddress.getCity());
	}

	@Test
	void testSetCity() {
		Address testAddress = new Address();
		testAddress.setCity("Broadview Heights");
		assertEquals("Broadview Heights", testAddress.getCity());
		
	}

	@Test
	void testGetState() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		assertEquals("OH", testAddress.getState());
	}

	@Test
	void testSetState() {
		Address testAddress = new Address();
		testAddress.setState("OH");
		assertEquals("OH", testAddress.getState());
	}

	@Test
	void testGetZipCode() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		assertEquals("44147", testAddress.getZipCode());
	}

	@Test
	void testSetZipCode() {
		Address testAddress = new Address();
		testAddress.setZipCode("44147");
		assertEquals("44147", testAddress.getZipCode());
	}

	@Test
	void testEqualsAddress() {
		Address testAddress1 = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Address testAddress2 = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		Address testAddress3 = new Address(480, "Westminster Lane", "Broadviewville", "MN", "44141");
		assertEquals(true,  testAddress1.equals(testAddress2));
		assertEquals(false, testAddress2.equals(testAddress3));
	}

	@Test 
	void testToString() {
		Address testAddress = new Address(4800, "Westminster Road", "Broadview Heights", "OH", "44147");
		assertEquals("4800 Westminster Road, Broadview Heights, OH, 44147", testAddress.toString());
	}

}
