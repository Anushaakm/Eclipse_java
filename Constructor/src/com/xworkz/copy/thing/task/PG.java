package com.xworkz.copy.thing.task;

public class PG {
	public String name;
	public int no;
	public long phone;
	public String location;
	public String city;
	public String[] size;
	public int[] quantity;
	public int[] prices;
	public String[] food;
	public int[] rooms;
	public int[] roomNos;
	
	public PG(String name, int no,long phone, String location, String city, String[] size, int[] quantity, int[] prices,String[] food, int[] rooms, int[] roomNos)
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
		this.food=food;
		this.rooms=rooms;
		this.roomNos=roomNos;
		
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
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);	
			}
		for (int i = 0; i < rooms.length; i++) {
			System.out.println(rooms[i]);	
			}
		for (int i = 0; i < roomNos.length; i++) {
			System.out.println(roomNos[i]);	
			}
		}
}

