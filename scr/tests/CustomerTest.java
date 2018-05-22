package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import program.Customer;

public class CustomerTest {

	@Test
	public void testGetCustomerName() {
		String name = "TestName";
		Customer testCostumer = new Customer(name);
		assertEquals(name,testCostumer.getName());
	}

}
