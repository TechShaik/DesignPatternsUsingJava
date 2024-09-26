package com.designPatterns.AbstractFactory;

  class BankFactory extends AbstractFactory {

	@Override
	Bank getBank(String bank) {
		 if(bank.equalsIgnoreCase("sbi")) {
			 return new Sbi();
		 }else  if(bank.equalsIgnoreCase("hdfc")) {
			 return new Hdfc();
		 }else  if(bank.equalsIgnoreCase("icic")) {
			 return new Icic();
		 }
		return null;
	}
 

	@Override
	Loan getLoan(String loan) {
		// TODO Auto-generated method stub
		return null;
	}
	  

}
