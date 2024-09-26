package com.designPatterns.FactoryDesign;

public class PlanType {
         public Plan getPlan(String Plan) {
        	 if(Plan.equalsIgnoreCase("Commercial")){
        		 return  new CommercialPlan();
        	 }else if(Plan.equalsIgnoreCase("Domestic")){
        		 return  new DomesticPlan();
        	 }else if(Plan.equalsIgnoreCase("Institutional")){
        		 return  new InstitutionalPan();
        	 }
			return null;
         }
}
