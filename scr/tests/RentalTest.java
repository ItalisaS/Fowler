package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import program.Movie;
import program.Rental;


public class RentalTest {

	@Test
	public void testGetDaysRented() {
		int daysRented = 10;
		Rental rental = new Rental(new Movie("test", 5),daysRented);
		assertEquals(daysRented, rental.getDaysRented());
	}
	
	@Test
	public void testGetMovie() {
		Rental rental = new Rental(new Movie("test", 5),10);
		assertEquals("test", rental.getMovie().getTitle());
		assertEquals(5, rental.getMovie().getPriceCode());
		
	}

}
