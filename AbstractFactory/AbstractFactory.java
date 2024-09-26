package com.designPatterns.AbstractFactory;

abstract class AbstractFactory {
	abstract Bank getBank(String bank);
	abstract Loan getLoan(String loan);
	 
	

}
