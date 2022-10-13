package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.task.Dustbin;


public class DustbinRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dustbin copy;
		copy=new Dustbin();
		System.out.println(copy.brand);
		System.out.println(copy.price);
		System.out.println(copy.ratings);
		System.out.println(copy.color);
		System.out.println(copy.type);
		System.out.println(copy.use);
		System.out.println(copy.weight);
		System.out.println(copy.bag);
		System.out.println(copy.origin);
		
		copy.thickness="2mm";
		copy.quality="good";
		copy.cap="Available";
		copy.open=true;
		copy.close=false;
		copy.shape="square";
		copy.volume="5l";
		copy.forWet=true;
		copy.quantity=1;
		
		System.out.println(copy.thickness);
		System.out.println(copy.quality);
		System.out.println(copy.cap);
		System.out.println(copy.open);
		System.out.println(copy.close);
		System.out.println(copy.shape);
		System.out.println(copy.volume);
		System.out.println(copy.forWet);
		System.out.println(copy.quantity);
	}

}
