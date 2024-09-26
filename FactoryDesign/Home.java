package com.designPatterns.FactoryDesign;

public class Home {

	public static void main(String[] args) {
		 PlanType p=new PlanType();
		   Plan pl=p.getPlan("institutional");
		   pl.getRate();
		   pl.calBill(78);
	}

}
