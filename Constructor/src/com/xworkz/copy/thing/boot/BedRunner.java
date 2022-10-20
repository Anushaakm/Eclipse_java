package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.task.Bed;

public class BedRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] size= {"L","M","S"};
		int[] quantity={25,56,34};
		int[] price={450,500,300};
		String[] brands= {"Parrots","owls"};
		int[] sizeIncms= {10,90};
		int[] pincode= {12345,56789};
		
		
Bed bed=new Bed("Kurtha",1, 9449498840l,"Mysuru","Mysuru",size,quantity,price,brands,sizeIncms,pincode);
bed.display();
	}

}
