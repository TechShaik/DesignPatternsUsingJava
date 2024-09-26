package com.designPatterns.AbstractFactory;

public class EducationLoan extends Loan{

	@Override
	void getRate() {
		rate=78.5;
		
	}

	@Override
	void calIntrest(int years) {
		 System.out.println("Intrest is : "+rate*years);
		
	}

}
