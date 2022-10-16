package com.xworkz.copy.thing.task;

public class TextileShop {
	
		public String ownerName;
		public String ownerWifeName;
		public String ownerDaughterName;
		public long ownerDaughterNumber; 
		public int ownersNoofWifes;
		public int shopNo;
		public long contactNo;
		
		public TextileShop(String ownerName) {
			this.ownerName=ownerName;
			System.out.println("Printing Details");
		}
		
		public TextileShop(String ownerName, String ownerWifeName) {
			this(ownerName);
			this.ownerWifeName=ownerWifeName;
		}
		
		public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName) {
			this(ownerName,ownerWifeName);
			this.ownerDaughterName=ownerDaughterName;
		}
		
		public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName, long ownerDaughterNumber) {
			this(ownerName,ownerWifeName,ownerDaughterName);
			this.ownerDaughterNumber=ownerDaughterNumber;
		}
		
		public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName, long ownerDaughterNumber,int ownersNoofWifes) {
			this(ownerName,ownerWifeName,ownerDaughterName,ownerDaughterNumber);
			this.ownersNoofWifes=ownersNoofWifes;
		}
		
		public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName, long ownerDaughterNumber,int ownersNoofWifes,int shopNo) {
			this(ownerName,ownerWifeName,ownerDaughterName,ownerDaughterNumber,ownersNoofWifes);
			this.shopNo=shopNo;
		}
		
		public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName, long ownerDaughterNumber,int ownersNoofWifes,int shopNo,long contactNo) {
			this(ownerName,ownerWifeName,ownerDaughterName,ownerDaughterNumber,ownersNoofWifes,shopNo);
			this.contactNo=contactNo;
		}
		
		public TextileShop(String ownerName, String ownerWifeName, int ownersNoofWife) {
			this(ownerName,ownerWifeName);
			this.ownersNoofWifes=ownersNoofWife;
			
		}
		
		
		
	
}
