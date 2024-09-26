package com.designPatterns.SingleTon;

public class Lazy {
	private static Lazy instance=null;
	private Lazy() {
		
	}

	 public static Lazy getInstance() {
		 if(instance==null) {
			 instance=new Lazy();
		 }
		return instance;

	}

}
