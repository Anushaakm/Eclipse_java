package com.xworkz.copy.thing.task;

public class KSRTC {
	public String name;
	public int no;
	public long phone;
	public String location;
	public String city;
	public String[] familyMembers;
	public int[] noOfKids;
	public int[] noOfpets;
	public String[] names;
	public int[] distances;
	public int[] pincode;
	
	public KSRTC(String name, int no,long phone, String location, String city, String[] familyMembers, int[] noOfKids, int[] noOfpets,String[] names, int[] distances, int[] pincode)
	{
		System.out.println("Constructor1");
		this.name=name;
		this.no=no;
		this.phone=phone;
		this.location=location;
		this.city=city;
		this.familyMembers=familyMembers;
		this.noOfKids=noOfKids;
		this.noOfpets=noOfpets;
		this.names=names;
		this.distances=distances;
		this.pincode=pincode;
		
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(no);
		System.out.println(phone);
		System.out.println(location);
		System.out.println(city);
		
		for (int i = 0; i < familyMembers.length; i++) {
			
		System.out.println(familyMembers[i]);}
		
		for (int i = 0; i < noOfKids.length; i++) {
		System.out.println(noOfKids[i]);	
		}
		for (int i = 0; i <noOfpets.length; i++) {
			System.out.println(noOfpets[i]);
		}
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);	
			}
		for (int i = 0; i < distances.length; i++) {
			System.out.println(distances[i]);	
			}
		for (int i = 0; i < pincode.length; i++) {
			System.out.println(pincode[i]);	
			}
		}
}

