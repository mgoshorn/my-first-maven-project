package com.revature.test.services;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import com.revature.models.ShoppingCartItem;
import com.revature.services.CheckoutService;

public class CheckoutServiceSubtotalTest {
	
	CheckoutService service = new CheckoutService();
	
	@Test
	public void testStandardCart() {
		// setup
		ShoppingCartItem apples = 
				new ShoppingCartItem("apple", 1, new BigDecimal(2.0));
		ShoppingCartItem[] cart = { apples };
		
		BigDecimal result = service.calculateSubtotal(cart);
		BigDecimal expectation = new BigDecimal(2.0).setScale(2);
		
		// Assertion to confirm that our expectation is met
		assertEquals("Cost of one apple should be $2.00", expectation, result);
	}

	@Test
	public void testStandardCartWithBananas() {
		// setup
		ShoppingCartItem apples = 
				new ShoppingCartItem("apple", 3, new BigDecimal(2.0));
		ShoppingCartItem bananas =
				new ShoppingCartItem("banana", 5, new BigDecimal(1.0));
		ShoppingCartItem[] cart = { apples, bananas };
		
		BigDecimal result = service.calculateSubtotal(cart);
		BigDecimal expectation = new BigDecimal(11.0).setScale(2);
		
		// Assertion to confirm that our expectation is met
		assertEquals("Cost of apples and bananas should be $11.00", expectation, result);
	}
	
	@Test
	public void testStandardCartWithBananasAndChairs() {
		// setup
		ShoppingCartItem apples = 
				new ShoppingCartItem("apple", 3, new BigDecimal(2.0));
		ShoppingCartItem bananas =
				new ShoppingCartItem("banana", 5, new BigDecimal(1.0));
		ShoppingCartItem chairs =
				new ShoppingCartItem("chairs", 2, new BigDecimal(25.0));
		ShoppingCartItem[] cart = { apples, bananas, chairs };
		
		BigDecimal result = service.calculateSubtotal(cart);
		BigDecimal expectation = new BigDecimal(61.0).setScale(2);
		
		// Assertion to confirm that our expectation is met
		assertEquals("Cost of apples and bananas and chairs should be $61.00", expectation, result);
	}
}
