package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.task.Chocolate;

public class ChocolateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate type=new Chocolate();
		type.brand="cadberries";
		type.flavour="chocolate";
		type.name="Five Star";
		type.price=100;
		System.out.println(type.brand);
		System.out.println(type.flavour);
		System.out.println(type.name);
		System.out.println(type.price);
		
		Chocolate copy2=new Chocolate();
		copy2.brand="cadberries";
		copy2.flavour="chocolate";
		copy2.name="Five Star";
		copy2.price=100;
		System.out.println(copy2.brand);
		System.out.println(copy2.flavour);
		System.out.println(copy2.name);
		System.out.println(copy2.price);
		}

}
