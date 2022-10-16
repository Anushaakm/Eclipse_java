package com.xworkz.copy.thing.task;

public class Chain {
	
		
		public String type;
		public int price;
		public int length;
		public String material;
		public double weight;
		public boolean stolen;
		public String usedFor;
		public boolean fresh;
		
		public Chain() {
			
			System.out.println("No-args constructor");
		}
		
		public Chain(String type) {
			this.type=type;
			System.out.println("Printing Only Type");
		}
		
		public Chain(String type, int price) {
			this(type);
			this.price=price;
			System.out.println("Printing Both Type and Price");
		}
		
	    public Chain(String type, int price,int length) {
	    	this(type,price);
	    	this.length=length;
	    	System.out.println("Printing Both Type and Price and Length");
	    }
	    
	    public Chain(String type, int price,int length , String material) {
	    	this(type,price,length);
	    	this.material=material;
	    	System.out.println("Printing Both Type , Price , Length, Material");
	    }
	    
	    public Chain(String type, int price,int length, String material,double weight) {
	    	this(type,price,length,material);
	    	this.weight=weight;
	    	System.out.println("Printing Both Type , Price , Length, Material, Weight");
	    }
	    
	    public Chain(String type, int price,int length, String material,double weight,boolean stolen) {
	    	this(type,price,length,material,weight);
	    	this.stolen=stolen;
	    	System.out.println("Printing Both Type , Price , Length, Material, Weight,Stolen");
	    }
	    
	    public Chain(String type, int price,int length, String material,double weight,boolean stolen, String usedFor) {
	    	this(type,price,length,material,weight,stolen);
	    	this.usedFor=usedFor;
	    	System.out.println("Printing Both Type , Price , Length, Material, Weight, Stolen, UsedFor");
	    }
	    
	    public Chain(String type, int price,int length, String material,double weight,boolean stolen, String usedFor, boolean fresh) {
	    	this(type,price,length,material,weight,stolen,usedFor);
	    	this.fresh=fresh;
	    	System.out.println("Printing Both Type , Price , Length, Material, Weight, Stolen, UsedFor, Fresh");
	    }
	    

	}

