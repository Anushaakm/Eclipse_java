package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.task.DistrictCollector;

public class DistrictCollectorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistrictCollector copy1=new DistrictCollector();
		copy1.age=45;
		copy1.batchNo=12;
		copy1.district="Chitradurga";
		copy1.name="Rama";
		System.out.println(copy1.age);
		System.out.println(copy1.batchNo);
		System.out.println(copy1.district);
		System.out.println(copy1.name);
		
		
		DistrictCollector copy2=new DistrictCollector();
		copy2.age=50;
		copy2.batchNo=13;
		copy2.district="Chigmanglore";
		copy2.name="seetha";
		System.out.println(copy2.age);
		System.out.println(copy2.batchNo);
		System.out.println(copy2.district);
		System.out.println(copy2.name);

	}

}
