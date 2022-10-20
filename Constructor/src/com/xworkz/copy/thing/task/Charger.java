package com.xworkz.copy.thing.task;

public class Charger {
	public String name;
	public int no;
	public long phone;
	public String location;
	public String city;
	public String[] size;
	public int[] quantity;
	public int[] prices;
	public String[] brands;
	public int[] sizeIncms;
	public int[] pincode;
	
	public Charger(String name, int no,long phone, String location, String city, String[] size, int[] quantity, int[] prices,String[] brands, int[] sizeIncms, int[] pincode)
	{
		System.out.println("Coonstructor1");
		this.name=name;
		this.no=no;
		this.phone=phone;
		this.location=location;
		this.city=city;
		this.size=size;
		this.quantity=quantity;
		this.prices=prices;
		this.sizeIncms=sizeIncms;
		this.pincode=pincode;
		this.brands=brands;
		
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(no);
		System.out.println(phone);
		System.out.println(location);
		System.out.println(city);
		
		for (int i = 0; i < size.length; i++) {
			
		System.out.println(size[i]);}
		
		for (int i = 0; i < quantity.length; i++) {
		System.out.println(quantity[i]);	
		}
		for (int i = 0; i <prices.length; i++) {
			System.out.println(prices[i]);
		}
		for (int i = 0; i < brands.length; i++) {
			System.out.println(brands[i]);	
			}
		for (int i = 0; i < sizeIncms.length; i++) {
			System.out.println(sizeIncms[i]);	
			}
		for (int i = 0; i < pincode.length; i++) {
			System.out.println(pincode[i]);	
			}
		}
}

