package com.revature;

import java.math.BigDecimal;

import com.revature.enums.State;
import com.revature.models.ShoppingCartItem;

public interface CheckoutInterface {

	BigDecimal calculateSubtotal(ShoppingCartItem[] items);
	
	BigDecimal calculateTax(BigDecimal subtotal, State state);
	
	BigDecimal calculateGrandTotal();
}
