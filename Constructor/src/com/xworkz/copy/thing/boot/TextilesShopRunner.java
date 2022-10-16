package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.task.TextileShop;

public class TextilesShopRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				TextileShop textileShop=new TextileShop("Raghavendra");
				System.out.println(textileShop.ownerName);

				TextileShop textileShop1=new TextileShop("Raghavendra", "Ramya");
				System.out.println(textileShop1.ownerName);
				System.out.println(textileShop1.ownerWifeName);
				
				TextileShop textileShop2=new TextileShop("Raghavendra", "Ramya", "Vanitha");
				System.out.println(textileShop2.ownerName);
				System.out.println(textileShop2.ownerWifeName);
				System.out.println(textileShop2.ownerDaughterName);
				
				TextileShop textileShop3=new TextileShop("Raghavendra", "Ramya", "Vanitha", 9723435637L);
				System.out.println(textileShop3.ownerName);
				System.out.println(textileShop3.ownerWifeName);
				System.out.println(textileShop3.ownerDaughterName);
				System.out.println(textileShop3.ownerDaughterNumber);
				
				TextileShop textileShop4=new TextileShop("Raghavendra", "Ramya", "Vanitha", 9723435637L,3);
				System.out.println(textileShop4.ownerName);
				System.out.println(textileShop4.ownerWifeName);
				System.out.println(textileShop4.ownerDaughterName);
				System.out.println(textileShop4.ownerDaughterNumber);
				System.out.println(textileShop4.ownersNoofWifes);
				
				TextileShop textileShop5=new TextileShop("Raghavendra", "Ramya", "Vanitha", 9723435637L ,3 ,45);
				System.out.println(textileShop5.ownerName);
				System.out.println(textileShop5.ownerWifeName);
				System.out.println(textileShop5.ownerDaughterName);
				System.out.println(textileShop5.ownerDaughterNumber);
				System.out.println(textileShop5.ownersNoofWifes);
				System.out.println(textileShop5.shopNo);
				
				TextileShop textileShop6=new TextileShop("Raghavendra", "Ramya", "Vanitha", 9723435637L ,3 ,45,6362456312L);
				System.out.println(textileShop6.ownerName);
				System.out.println(textileShop6.ownerWifeName);
				System.out.println(textileShop6.ownerDaughterName);
				System.out.println(textileShop6.ownerDaughterNumber);
				System.out.println(textileShop6.ownersNoofWifes);
				System.out.println(textileShop6.shopNo);
				System.out.println(textileShop6.contactNo);
				
				TextileShop textileShop7=new TextileShop("Raghavendra", "Ramya", 3);
				System.out.println(textileShop7.ownerName);
				System.out.println(textileShop7.ownerWifeName);
				System.out.println(textileShop7.ownersNoofWifes);
				
			
			}

		}
	