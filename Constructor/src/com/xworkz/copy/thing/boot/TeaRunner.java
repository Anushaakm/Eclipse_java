package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.task.Tea;

public class TeaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tea copy;
		copy=new Tea();
		System.out.println(copy.brand);
		System.out.println(copy.price);
		System.out.println(copy.ratings);
		System.out.println(copy.color);
		System.out.println(copy.type);
		System.out.println(copy.milk);
		System.out.println(copy.protein);
		System.out.println(copy.bag);
		System.out.println(copy.origin);
		
		copy.calcium="0.2g";
		copy.cholesterol=false;
		copy.organic=true;
		copy.weight=250;
		copy.potassium="0g";
		copy.sodium="0.2g";
		copy.sugar=false;
		copy.vitamin_C="0.2g";
		copy.iron="2.0g";
		
		System.out.println(copy.calcium);
		System.out.println(copy.cholesterol);
		System.out.println(copy.organic);
		System.out.println(copy.weight);
		System.out.println(copy.potassium);
		System.out.println(copy.sodium);
		System.out.println(copy.sugar);
		System.out.println(copy.vitamin_C);
		System.out.println(copy.iron);
	}

}
