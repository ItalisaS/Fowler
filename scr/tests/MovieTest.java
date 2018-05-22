package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import program.Movie;

public class MovieTest {

	@Test
	public void testTitle() {
		String title = "TestTitle";
		Movie movie = new Movie(title, 7);
		assertEquals(title, movie.getTitle());
	}
	
	@Test
	public void testPriceCode() {
		int priceCode = 20;
		Movie movie = new Movie("test", priceCode);
		assertEquals(priceCode, movie.getPriceCode());
		
		priceCode = 10;
		movie.setPriceCode(priceCode);
		assertEquals(priceCode, movie.getPriceCode());
	}

}
