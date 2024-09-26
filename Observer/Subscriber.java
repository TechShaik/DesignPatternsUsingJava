package com.designPatterns.Observer;

public class Subscriber {
          String name;          
          Channel channel; 
          
         public void notifySubs() {
        	  System.out.println("Video uploaded");
          }
         
         public void subscribe(String name) {
        	 this.name=name;
         }
         
         public void unSbscribe(String name) {
        	 this.name=name;
         }
         
}
