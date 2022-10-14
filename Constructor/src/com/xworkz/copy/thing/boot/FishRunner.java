package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.task.Fish;

public class FishRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish copy = new Fish();

		copy.length = 20l;
		copy.name = "Gold Fish";
		copy.price = 500;
		copy.type = "abc";
		copy.weight = 2.5;

		System.out.println(copy.length);
		System.out.println(copy.name);
		System.out.println(copy.price);
		System.out.println(copy.type);
		System.out.println(copy.weight);
		
		Fish copy1 = new Fish(3.0,800);
		System.out.println(copy1.price);
		System.out.println(copy1.weight);
		
		Fish copy2=new Fish(200,1.5);
		System.out.println(copy2.price);
		System.out.println(copy2.weight);
		
		Fish copy3=new Fish(200,"Anusha");
		System.out.println(copy3.price);
		System.out.println(copy3.name);
		
		Fish copy4=new Fish("Nayana",300);
		System.out.println(copy4.price);
		System.out.println(copy4.name);
		
		Fish copy5=new Fish(222,"Kavitha","Star fish");
		System.out.println(copy5.price);
		System.out.println(copy5.name);
		System.out.println(copy5.type);
		
		Fish copy6=new Fish("rama",400,"b");
		System.out.println(copy6.price);
		System.out.println(copy6.name);
		System.out.println(copy6.type);
		
		Fish copy7=new Fish("seetha","c",300);
		System.out.println(copy7.price);
		System.out.println(copy7.name);
		System.out.println(copy7.type);
		
	}

}
