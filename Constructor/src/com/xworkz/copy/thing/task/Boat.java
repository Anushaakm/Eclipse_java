package com.xworkz.copy.thing.task;

public class Boat {
	public String name;
	public String color;
	public String companyName;
	public int no;
	public int length;
	public String owner;

	public Boat() {
		System.out.println("***");

	}

	public Boat(String name, String color) {
		this.name = name;
		this.color = color;
		System.out.println("Boat name and color");
	}

	public Boat(String name, int no) {
		this.name = name;
		this.no = no;
		System.out.println("Boat name and number");
	}

	public Boat(int no, String companyName) {
		this.no = no;
		this.companyName = companyName;
		System.out.println("Boat number and  companyName");
	}

	public Boat(String owner, String name, int no) {
		this.owner = owner;
		this.no = no;
		this.name = name;
		System.out.println("Boat owner,name and number");
	}

	public Boat(String owner, int no, String name) {
		this.owner = owner;
		this.no = no;
		this.name = name;
		System.out.println("Boat owner, number and name");
	}
	
	public Boat(int no,String color,String name) {
		this.no = no;
		this.color = color;
		this.name = name;
		System.out.println("Boat number, color and name");
	}
	
	public Boat(int no,int length,String owner) {
		this.no = no;
		this.length = length;
		this.owner = owner;
		System.out.println("Boat number, length, owner");
	}
	
}
