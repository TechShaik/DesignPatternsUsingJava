package com.designPatterns.AbstractFactory;

public class BusinessLoan extends Loan {

	@Override
	void getRate() {
        rate=78.7;		
	}

	@Override
	void calIntrest(int years) {
		 System.out.println("Intrest is : "+rate*years);

		
	}

}
