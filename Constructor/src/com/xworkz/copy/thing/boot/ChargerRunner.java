package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.task.Charger;

public class ChargerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] size= {"L","M","S"};
		int[] quantity={25,56,34};
		int[] price={450,500,300};
		String[] brands= {"Parrots","owls"};
		int[] sizeIncms= {10,90};
		int[] pincode= {12345,56789};
		
		
Charger charger=new Charger("Kurtha",1, 9449498840l,"Mysuru","Mysuru",size,quantity,price,brands,sizeIncms,pincode);
charger.display();
}


	}
