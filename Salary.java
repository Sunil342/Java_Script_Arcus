package com.Inheritances;

public class Salary extends Designation {
	
	int Salary;

	public static void main(String[] args) {
	
		Salary Sal = new Salary();
		
		Sal.id=10;
		Sal.Designation="Test Engineer";
		Sal.Salary=50000;
		
		Sal.getemployeedetails();
		Sal.designation();
		System.out.print("Employee Salary is : ");
		System.out.println(+Sal.Salary);
		
		
		
		
		

	}

}
