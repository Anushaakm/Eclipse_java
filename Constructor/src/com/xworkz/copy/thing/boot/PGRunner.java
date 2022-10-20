package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.task.PG;
public class PGRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] size= {"Lion","Tiger","Elephant"};
		int[] quantity={25,56,34};
		int[] price={45,50,30};
		String[] food= {"Parrots","owls"};
		int[] rooms= {10,9};
		int[] roomNo= {12345,56789};
		
		
PG pg=new PG("Mysure",1,9880628176l,"Mysuru","Mysuru",size,quantity,price,food,rooms,roomNo);
pg.display();
}

}

