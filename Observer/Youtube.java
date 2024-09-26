package com.designPatterns.Observer;

public class Youtube {

	public static void main(String[] args) {
		 Subscriber shaik=new Subscriber();
		 Subscriber sravs=new Subscriber();
		 Subscriber shahid=new Subscriber();
		 Subscriber suhail=new Subscriber();

		 Channel tp=new Channel();
		 tp.Subscribe(shaik);
		 tp.Subscribe(suhail);
		 tp.Subscribe(sravs);
		 tp.Subscribe(shahid);
          
		 tp.upload("learn Java coding");
		 
	}

}
