package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.task.Bus;

public class BusRunner {

	public static void main(String[] args) {
		
		Bus bus1=new Bus();
		bus1.busNo=001;
		bus1.source="Bengalore";
		bus1.destination="Chitradurga";
		System.out.println(bus1.busNo);
		System.out.println(bus1.source);
		System.out.println(bus1.destination);
		
		Bus bus2=new Bus();
		bus2.busNo=002;
		bus2.source="Chikmanlore";
		bus2.destination="Chitradurga";
		System.out.println(bus2.busNo);
		System.out.println(bus2.source);
		System.out.println(bus2.destination);
		
	}

}
