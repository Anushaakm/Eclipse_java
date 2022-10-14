package com.xworkz.copy.thing.task;

public class BoatRunner {

	public static void main(String[] args) {
		Boat copy = new Boat();
		copy.name = "KGF";
		copy.length = 250;
		copy.no = 12;
		copy.owner = "Yash";
		copy.companyName = "boat";
		copy.color = "black";

		System.out.println(copy.name);
		System.out.println(copy.length);
		System.out.println(copy.no);
		System.out.println(copy.owner);
		System.out.println(copy.companyName);
		System.out.println(copy.color);
		
		Boat copy1=new Boat("Anu","brown");
		System.out.println(copy1.name);
		System.out.println(copy1.color);
		System.out.println("--------------");
		
		Boat copy2=new Boat("Anu",24);
		System.out.println(copy2.name);
		System.out.println(copy2.no);
		System.out.println("--------------");
		
		Boat copy3=new Boat(24,"x-workz");
		System.out.println(copy3.companyName);
		System.out.println(copy3.no);
		System.out.println("--------------");
		
		
		

	}

}

	
