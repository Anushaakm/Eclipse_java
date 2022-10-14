package com.xworkz.copy.thing.task;

public class Fish {
	public String name;
	public String type;
	public int price;
	public double weight;
	public long length;
	
	public Fish() {
		System.out.println("Fish constructor1");
	}
	
	public Fish(String name, int price )
	{
		this.name=name;
		this.price=price;
		System.out.println("another constructor2");
	}
	
	public Fish(int price, String name)
	{
		this.name=name;
		this.price=price;
		System.out.println("another constructor3");
	}
	
	public Fish(int price, String name, String type)
	{
		this.name=name;
		this.price=price;
		this.type=type;
		System.out.println("another constructor4");
	}
	
	
	public Fish( String name,int price, String type)
	{
		this.name=name;
		this.price=price;
		this.type=type;
		System.out.println("another constructor5");
	}
	
	public Fish( String name, String type,int price)
	{
		this.name=name;
		this.price=price;
		this.type=type;
		System.out.println("another constructor6");
	}
	
	public Fish(int price, double weight)
	{
		this.weight=weight;
		this.price=price;
		
		System.out.println("another constructor7");
	}
	public Fish(double weight,int price)
	{
		this.weight= weight;
		this.price=price;
		
		System.out.println("another constructor8");
	}
	
	
	
}
