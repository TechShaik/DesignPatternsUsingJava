package com.designPatterns.AbstractFactory;

public class Home {

	public static void main(String[] args) {
		BankFactory bf=new BankFactory();
          Bank b=bf.getBank("hdfc");
          System.out.println(b.getBankName());
          LoanFactory lf=new LoanFactory();
           Loan i=lf.getLoan("home");
           i.getRate();
           i.calIntrest(4);
			 
		 

	}

}
