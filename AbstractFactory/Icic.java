package com.designPatterns.AbstractFactory;

public class Icic implements Bank {
	private final String name;
	public Icic() {
		name="icic";
	}
	public String getBankName() {
		return name ;
	}
}
