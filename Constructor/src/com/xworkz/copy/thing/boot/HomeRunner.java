package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.task.Home;

public class HomeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] familyMember= {"Lion","Tiger","Elephant"};
		int[] noOfkids={25,56,34};
		int[] noOfpets={45,50,30};
		String[] names= {"Parrots","owls"};
		int[] ages= {10,9};
		int[] pincode= {12345,56789};
		
		
Home home=new Home("Mysure",1, 9449498840l,"Mysuru","Mysuru",familyMember,noOfkids,noOfpets,names,ages,pincode );
home.display();
	}

}
