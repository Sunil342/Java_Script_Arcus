package com.arcus;

public class arcusDatatypes {


	// This is Employee Details

	String username;
	int id;
	// long mobilenumber;
	String designation;
	String   gender;
	long   salary;



	public static void main(String[] args) {





		arcusDatatypes user = new arcusDatatypes();

		user.username="Name :- Sravani";

		user.id= 12;
		user.designation="Designation:-HR Associate";
		user.gender ="gender:-F";
		user.salary=15000;

		System.out.println("Employee Details");
		System.out.println("***********************");
		System.out.println(user.username);
		System.out.println(user.id);
		System.out.println(user.designation);
		System.out.println(user.gender);
		System.out.println(user.salary);
		













	}

}
