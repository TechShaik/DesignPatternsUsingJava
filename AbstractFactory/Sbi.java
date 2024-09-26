package com.designPatterns.AbstractFactory;

public class Sbi implements Bank {
    private final String name;

	public Sbi()
	{
		name="Sbi";
 	}
	@Override
	public 	String getBankName() {
		  	return name;
	}

}
