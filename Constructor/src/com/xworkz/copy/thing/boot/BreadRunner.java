package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.task.Bread;

public class BreadRunner {

	public static void main(String[] args) {
		

		
				Bread copy = new Bread();

				copy.shape = "rectangle";
				copy.name = "Gold Fish";
				copy.price = 50.5;
				copy.type = "abc";
				copy.quantity = 2;

				System.out.println(copy.shape);
				System.out.println(copy.name);
				System.out.println(copy.price);
				System.out.println(copy.type);
				System.out.println(copy.quantity);
				
				Bread copy1 = new Bread("A",80.0);
				System.out.println(copy1.price);
				System.out.println(copy1.name);
				
				Bread copy2=new Bread(80.0,"B");
				System.out.println(copy2.price);
				System.out.println(copy2.name);
				
				Bread copy3=new Bread(20.0,"Anusha","C");
				System.out.println(copy3.price);
				System.out.println(copy3.name);
				System.out.println(copy3.type);
				
				Bread copy4=new Bread("Nayana",30.0,"D");
				System.out.println(copy4.price);
				System.out.println(copy4.name);
				System.out.println(copy4.type);
				
				Bread copy5=new Bread("Kavitha","Star fish",40.0);
				System.out.println(copy5.price);
				System.out.println(copy5.name);
				System.out.println(copy5.type);
				
				Bread copy6=new Bread(400.0,4);
				System.out.println(copy6.price);
				System.out.println(copy6.quantity);
			
				
				Bread copy7=new Bread(30,300.0);
				System.out.println(copy7.price);
				System.out.println(copy7.quantity);
				
			}

		}

