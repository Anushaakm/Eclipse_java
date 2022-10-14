package com.xworkz.copy.thing.task;

public class Bread {
	

		public String shape;
		public String type;
		public double price;
		public int quantity;
		public String name;
		
		public Bread() {
			System.out.println("Fish constructor1");
		}
		
		public Bread(String name, double price )
		{
			this.name=name;
			this.price=price;
			System.out.println("another constructor2");
		}
		
		public Bread(double price, String name)
		{
			this.name=name;
			this.price=price;
			System.out.println("another constructor3");
		}
		
		public Bread(double price, String name, String type)
		{
			this.name=name;
			this.price=price;
			this.type=type;
			System.out.println("another constructor4");
		}
		
		
		public Bread( String name,double price, String type)
		{
			this.name=name;
			this.price=price;
			this.type=type;
			System.out.println("another constructor5");
		}
		
		public Bread( String name, String type,double price)
		{
			this.name=name;
			this.price=price;
			this.type=type;
			System.out.println("another constructor6");
		}
		
		public Bread(int quantity,double price)
		{
			this.quantity=quantity;
			this.price=price;
			System.out.println("another constructor7");
		}
		public Bread(double price,int quantity)
		{
			this.quantity= quantity;
			this.price=price;	
			System.out.println("another constructor8");
		}
		
		
		
	}


