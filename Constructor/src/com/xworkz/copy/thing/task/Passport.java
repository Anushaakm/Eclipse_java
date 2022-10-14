package com.xworkz.copy.thing.task;

public class Passport {
	
	
		public Passport() {
			
		}
		public int no;
		public String name;
		public int expiryDate;
		public String country;
		public String issueDate;

		public Passport(int no) {
			this.no = no;
			System.out.println("Passport no");

		}

		public Passport(String country, String name) {
			this.country = country;
			this.name = name;

		}

		public Passport(String name) {
			this.name = name;
			System.out.println("Name of the Passport");
		}

		public Passport(String name, int no) {
			this.name = name;
			this.no = no;

		}

		public Passport(int no, String name) {
			this.no = no;
			this.name = name;

		}

		public Passport(int expiryDate, String country, String issueDate) {
			this.expiryDate = expiryDate;
			this.country = country;
			this.issueDate = issueDate;

		}

		public Passport(String country, int no, int expiryDate) {
			this.country = country;
			this.no = no;
			this.expiryDate = expiryDate;

		}

		public Passport(int no, int expiryDate) {
			this.no = no;
			this.expiryDate = expiryDate;

		}

	}

