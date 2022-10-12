package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.task.Developer;

public class DeveloperRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer copy=new Developer();
		copy.company="TCS";
		copy.education="BE";
		copy.experience="2 years";
		copy.name="Lavanya";
		copy.salary=1000000;
		System.out.println(copy.company);
		System.out.println(copy.education);
		System.out.println(copy.experience);
		System.out.println(copy.name);
		System.out.println(copy.salary);
	}

}
