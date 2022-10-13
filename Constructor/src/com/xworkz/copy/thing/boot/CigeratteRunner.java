package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.task.Cigarette;

public class CigeratteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cigarette smoke = new Cigarette();
		smoke. owner="R.J.Reynolds";
		smoke. chemicals="Hydrogen Cynide";
		smoke. color="White";
		smoke. tobaccoQuantity=100.0;
		smoke. export="all over the world";
		smoke. originatedPlace="USA";
		smoke. productionQuality="Ultra-Premium";
		smoke. brandAmbassader="Winston group and Company";
		smoke. discount=5;	
		
		System.out.println(smoke.type); 
		System.out.println(smoke.brand); 
		System.out.println(smoke.company); 
		System.out.println(smoke.logo);
		System.out.println(smoke.location);
		System.out.println(smoke.price);    
		System.out.println(smoke.gst); 
		System.out.println(smoke.quantity); 
		System.out.println(smoke.quality); 
		System.out.println(smoke.owner);
		System.out.println(smoke.chemicals);
		System.out.println(smoke.productionQuality);
		System.out.println(smoke.originatedPlace);
		System.out.println(smoke.brandAmbassader);
		System.out.println(smoke.discount);
		System.out.println(smoke.color);
		System.out.println(smoke.tobaccoQuantity);
		System.out.println(smoke.export);
				
		
		
		
		
		
	   
		
	}

}
