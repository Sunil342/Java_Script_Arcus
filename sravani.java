package com.arcus;

public class sravani {

	String username;
	int id;
	//long mobilenumber;
	String designation;
	String gender;
	long salary;
	//String Surname;





	public static void main(String[] args) {


		arcusDatatypes user= new arcusDatatypes();

		user.username="sravani";
		user.id=1234;
		//user.mobilenumber=8186933074;
		user.designation="tester";
		user.gender="f";
		user.salary=25000;


		System.out.println("Employee details");
		System.out.println("******");
		System.out.println(user.username);
		System.out.println(user.id);
		System.out.println(user.designation);
		System.out.println(user.gender);
		System.out.println(user.salary);



















	}

}
