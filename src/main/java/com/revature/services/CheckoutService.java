package com.revature.services;

import java.math.BigDecimal;

import com.revature.CheckoutInterface;
import com.revature.enums.State;
import com.revature.exception.InvalidCartException;
import com.revature.models.ShoppingCartItem;

public class CheckoutService implements CheckoutInterface {

	@Override
	public BigDecimal calculateSubtotal(ShoppingCartItem[] items) {
		BigDecimal subtotal = new BigDecimal(0);
		for(ShoppingCartItem item : items) {
			
			if (item.getQuantity() < 1) {
				throw new InvalidCartException();
			}
			
			subtotal = subtotal.add(item.getPrice()
					.multiply(new BigDecimal(item.getQuantity()))
			);
		}
		return subtotal.setScale(2);
	}

	@Override
	public BigDecimal calculateTax(BigDecimal subtotal, State state) {
		return subtotal.multiply(BigDecimal.valueOf(state.taxRate)).setScale(2);
	}

	@Override
	public BigDecimal calculateGrandTotal() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
