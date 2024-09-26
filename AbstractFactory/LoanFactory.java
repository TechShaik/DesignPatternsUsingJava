package com.designPatterns.AbstractFactory;

  class LoanFactory extends AbstractFactory {

	@Override
	Bank getBank(String bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Loan getLoan(String loan) {
         if(loan.equalsIgnoreCase("home")){
        	 return new HomeLaon();
         
         }else if(loan.equalsIgnoreCase("education")){
        	 return new EducationLoan();
         }
        	 else  if(loan.equalsIgnoreCase("business")){
            	 return new BusinessLoan();
	}
		return null;
	}

}
