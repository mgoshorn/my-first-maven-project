package com.revature.models;

import java.math.BigDecimal;

/**
 * 
 * 
 * Java Bean
 * 1) Private fields
 * 2) Public getter setters
 * 3) no-args constructor
 * 4) ? implement Serializable
 * 
 * Not meeting requirements:
 * POJO - Plain ol' Java Object
 * 
 * Generating Code: (alt+shift+s)
 * * getters/setters 
 * * hashcode/equals 
 * * constructor from superclass 
 * * constructor from fields 
 * * toString
 * 
 * @author Mitch
 *
 */
public class ShoppingCartItem {
	private String name;
	private int quantity;
	private BigDecimal price;
	
	@Override
	public String toString() {
		return "ShoppingCartItem [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}

	public ShoppingCartItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShoppingCartItem(String name, int quantity, BigDecimal price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + quantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShoppingCartItem other = (ShoppingCartItem) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

}
