package com.designPatterns.AbstractFactory;

public class HomeLaon extends Loan{

	 

	@Override
	void getRate() {
		rate=45.4;
		
	}

	@Override
	void calIntrest(int years) {
	 System.out.println("Intrest is : "+rate*years);
		
	}

	 
	
      
}
