package com.designPatterns.Observer;

import java.util.*;

public class Channel {
           List<Subscriber> subs=new ArrayList<>();
           Subscriber sb=new Subscriber();
       
         public  void Subscribe(Subscriber s) {
        	   subs.add(s);
           }
           
         public  void unSubscribe(Subscriber s) {
        	   subs.remove(s);
           }
           
         public void upload(String s) {
        	 for(Subscriber sub:subs)
                sub.notifySubs();
        	   
            }
 
}
