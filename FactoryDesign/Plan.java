package com.designPatterns.FactoryDesign;

abstract class Plan {
	double rate;
       abstract void getRate();
    	  void calBill(int units) {
    		  System.out.println("Bills is :"+rate*units);
    	  }
       
}
