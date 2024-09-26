package com.designPatterns.AbstractFactory;

public class Hdfc implements Bank {
	private final String name;
	public Hdfc() {
		name="Hdfc";
	}
	public String getBankName() {
		return name ;
	}

}
