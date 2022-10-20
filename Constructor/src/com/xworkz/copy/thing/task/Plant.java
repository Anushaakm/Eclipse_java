package com.xworkz.copy.thing.task;

public class Plant {
	public String name;
	public int no;
	public String location;
	public String city;
	public String[] plants;
	public int[] noOfplants;
	public int[] lengthOfPlants;
	public String[] types;
	public int[] noOfFlowers;
	public int[] noOfFruits;
	
	public Plant(String name, int no, String location, String city, String[] plants, int[] noOfplants, int[] lengthOfPlants,String[] types, int[] noOfFlowers, int[] noOfFruits)
	{
		System.out.println("Coonstructor1");
		this.name=name;
		this.no=no;
		this.location=location;
		this.city=city;
		this.plants=plants;
		this.noOfplants=noOfplants;
		this.lengthOfPlants=lengthOfPlants;
		this.types=types;
		this.noOfFlowers=noOfFlowers;
		this.noOfFruits=noOfFruits;
		
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(no);
		System.out.println(location);
		System.out.println(city);
		
		for (int i = 0; i < plants.length; i++) {
			
		System.out.println(plants[i]);}
		
		for (int i = 0; i < noOfplants.length; i++) {
		System.out.println(noOfplants[i]);	
		}
		for (int i = 0; i <lengthOfPlants.length; i++) {
			System.out.println(lengthOfPlants[i]);
		}
		for (int i = 0; i < types.length; i++) {
			System.out.println(types[i]);	
			}
		for (int i = 0; i < noOfFlowers.length; i++) {
			System.out.println(noOfFlowers[i]);	
			}
		for (int i = 0; i < noOfFruits.length; i++) {
			System.out.println(noOfFruits[i]);	
			}
		}
}

