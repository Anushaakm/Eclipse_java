package com.xworkz.copy.thing.task;

	public class Bank {
		public String name;
		public int no_employess;
		public long phone;;
		public String email;
		public String city;
		public String[] employees;
		public int[] employee_id;
		public int[] salary;
		public String[] projects;
		public String[] desgnation;
		public int[] team_no ;
		
		
		public Bank(String name,int no_employess,long phone,String email,String city, String[] employees,int[] employee_id, int[] salary,String[] projects
		 ,String[] desgnation,int[]team_no)
		{
			System.out.println("constructor of student");
			this.name=name;
			this.no_employess=no_employess;
			this.phone=phone;
			this.email=email;
			this.city=city;
			this.employees= employees;
			this.employee_id=employee_id;
			this.salary=salary;
			this.projects=projects;
			this.desgnation=desgnation;
			this.team_no=team_no;
		}
		
		public void display()
		{
			System.out.println(name);
			System.out.println(no_employess);
			System.out.println(phone);
			System.out.println(email);
			System.out.println(city);
			for (int i = 0; i < employees.length; i++) {
				
			System.out.println(employees[i]);}
			
			for (int i = 0; i < employee_id.length; i++) {
			System.out.println(employee_id[i]);	
			}
			for (int i = 0; i <salary.length; i++) {
				System.out.println(salary[i]);
			}
			for (int i = 0; i < projects.length; i++) {
				System.out.println(projects[i]);	
				}
			for (int i = 0; i <desgnation .length; i++) {
				System.out.println(desgnation[i]);	
				}
			for (int i = 0; i < team_no.length; i++) {
				System.out.println(team_no[i]);	
				}
			}

	}
