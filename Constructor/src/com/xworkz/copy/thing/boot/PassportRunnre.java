package com.xworkz.copy.thing.boot;

import com.xworkz.copy.thing.task.Passport;

public class PassportRunnre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passport visa = new Passport();

		System.out.println(visa.name);
		System.out.println(visa.no);
		System.out.println(visa.expiryDate);
		System.out.println(visa.country);
		System.out.println(visa.issueDate);

		Passport visa0 = new Passport(224);
		System.out.println(visa0.no);

		Passport visa1 = new Passport("Rishab");
		System.out.println(visa1.name);

		Passport visa2 = new Passport("Rishab", 50);
		System.out.println(visa2.name);
		System.out.println(visa2.no);

		Passport visa3 = new Passport(876, "Rakshith");
		System.out.println(visa3.no);
		System.out.println(visa3.name);

		Passport visa4 = new Passport(19, "India", "18-08-2000");
		System.out.println(visa4.expiryDate);
		System.out.println(visa4.country);
		System.out.println(visa4.issueDate);

		Passport visa5 = new Passport("India", 870, 12);
		System.out.println(visa5.name);
		System.out.println(visa5.no);
		System.out.println(visa5.expiryDate);

		Passport visa6 = new Passport(670, 37);
		System.out.println(visa6.no);
		System.out.println(visa6.expiryDate);

		Passport visa7 = new Passport("India", "Rakshith");
		System.out.println(visa7.country);
		System.out.println(visa7.name);

	}

}
