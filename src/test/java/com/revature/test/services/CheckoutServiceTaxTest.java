package com.revature.test.services;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import com.revature.enums.State;
import com.revature.services.CheckoutService;

public class CheckoutServiceTaxTest {
	
	CheckoutService service = new CheckoutService();
	
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
