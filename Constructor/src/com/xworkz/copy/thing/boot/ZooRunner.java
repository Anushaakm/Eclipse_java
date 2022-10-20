package com.xworkz.copy.thing.boot;


import com.xworkz.copy.thing.task.Zoo;

public class ZooRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] animals= {"Lion","Tiger","Elephant"};
		int[] noOfAnimals={25,56,34};
		int[] distance={45,50,30};
		String[] birds= {"Parrots","owls"};
		int[] noOfBirds= {10,9};
		int[] pincode= {12345,56789};
		
		
Zoo zoo=new Zoo("Mysure",1, 9449498840l,"Mysuru","Mysuru",animals,noOfAnimals,distance,birds,noOfBirds,pincode );
zoo.display();
	}

}
