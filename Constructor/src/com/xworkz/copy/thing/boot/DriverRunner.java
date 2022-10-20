package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.task.Driver;

public class DriverRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] familyMember= {"Lion","Tiger","Elephant"};
			int[] noOfkids={25,56,34};
			int[] noOfpets={45,50,30};
			String[] names= {"Parrots","owls"};
			int[] ages= {10,9};
			int[] pincode= {12345,56789};
			
			
	Driver driver=new Driver("Mysure",1, 9449498840l,"Mysuru","Mysuru",familyMember,noOfkids,noOfpets,names,ages,pincode );
	driver.display();
		}
	}

