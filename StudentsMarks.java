package com.Scanner;

import java.util.Scanner;

public class StudentsMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student Marks");
		int Marks = sc.nextInt();
		System.out.println("Student Marks is :" +Marks);

		if(Marks>500) {
			System.out.println("Distriction : "  +Marks);

		} else if (Marks>=350) {
			System.out.println("First Class : " +Marks);


		} else if(Marks>=250) {
			System.out.println("Second Class : " +Marks);
		}
		else if(Marks<250) {
			System.out.println("Fail the examination : " +Marks);
		}

	}
}