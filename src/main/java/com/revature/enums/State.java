package com.revature.enums;

public enum State {

	FLORIDA(0.1),
	NEW_YORK(0.12),
	CALIFORNIA(0.1);

	public double taxRate;
	
	private State(double taxRate) {
		this.taxRate = taxRate;
	}
}
