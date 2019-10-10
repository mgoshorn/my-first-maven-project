package com.revature.test.services;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.enums.State;
import com.revature.services.CheckoutService;


/**
 * @Test - Indicates that this method can be run as a JUnit test
 * 
 * Generally used to:
 * 		Setup, breakdown, or reset state on objects being tested
 * @Before - Is a method that will run before each test in the class
 * @BeforeClass - A method run before the class begins running tests
 * @After - Is a method that will be run after each test.
 * @AfterClass - A method run after all the tests in the class have completed.
 * 
 *
 */
public class CheckoutServiceTaxTest {

	CheckoutService service = new CheckoutService();
	
	@Before
	public void beforeEachTest() {
		System.out.println("Before test");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before the class");
	}
	
	@After
	public void afterEachTest() {
		System.out.println("After each test");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After the class");
	}
	
	@Test
	public void testSubtotalFlorida() {
		BigDecimal subtotal = new BigDecimal(100);
		BigDecimal total = service.calculateTax(subtotal, State.FLORIDA);
		BigDecimal expectation = new BigDecimal(10);
		expectation = expectation.setScale(2);
		assertEquals("Grand total should be $10 for 100 subtotal in Florida",
				expectation, total);
	}
	
	@Test
	public void testSubtotalNewYork() {
		BigDecimal subtotal = new BigDecimal(50);
		BigDecimal total = service.calculateTax(subtotal, State.NEW_YORK);
		BigDecimal expectation = new BigDecimal(6).setScale(2);
		
		assertEquals("Grand total should be $6 for 50 subtotal in new york",
				expectation, total);
	}
	@Test
	public void testSubtotalCalifornia() {
		BigDecimal subtotal = new BigDecimal(200);
		BigDecimal total = service.calculateTax(subtotal, State.CALIFORNIA);
		BigDecimal expectation = new BigDecimal(20).setScale(2);
		assertEquals("Grand total should be $20 for 200 subtotal in California",
				expectation, total);
	}
}
