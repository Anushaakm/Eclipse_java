package com.xworkz.copy.thing.task;

public class Zoo {
	public String name;
	public int no;
	public long phone;
	public String location;
	public String city;
	public String[] animals;
	public int[] noOfAnimals;
	public int[] distanceFromcities;
	public String[] birds;
	public int[] noOfBirds;
	public int[] pincode;
	
	public Zoo(String name, int no,long phone, String location, String city, String[] animals, int[] noOfAnimals, int[] ditanceFromcities,String[] birds, int[] noOfBirds, int[] pincode)
	{
		System.out.println("Coonstructor1");
		this.name=name;
		this.no=no;
		this.phone=phone;
		this.location=location;
		this.city=city;
		this.animals=animals;
		this.noOfAnimals=noOfAnimals;
		this.distanceFromcities=ditanceFromcities;
		this.birds=birds;
		this.noOfBirds=noOfBirds;
		this.pincode=pincode;
		
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(no);
		System.out.println(phone);
		System.out.println(location);
		System.out.println(city);
		
		for (int i = 0; i < animals.length; i++) {
			
		System.out.println(animals[i]);}
		
		for (int i = 0; i < noOfAnimals.length; i++) {
		System.out.println(noOfAnimals[i]);	
		}
		for (int i = 0; i <distanceFromcities.length; i++) {
			System.out.println(distanceFromcities[i]);
		}
		for (int i = 0; i < birds.length; i++) {
			System.out.println(birds[i]);	
			}
		for (int i = 0; i < noOfBirds.length; i++) {
			System.out.println(noOfBirds[i]);	
			}
		for (int i = 0; i < pincode.length; i++) {
			System.out.println(pincode[i]);	
			}
		}
}
