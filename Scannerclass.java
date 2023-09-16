package com.Scanner;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Marks");
		int Marks = sc.nextInt();

		//System.out.println("Employee marks is :" +Marks);

		if(Marks>=90) {
			Scannerclass s = new Scannerclass();
			System.out.println("Student Grade is A : " +Marks);
		}
		else if(Marks>80) {
			System.out.println("Student Grade is B : " +Marks);

		}else if(Marks>=70) {
			System.out.println("Student Grade is C :" +Marks);

		}else if(Marks>=60) {
			System.out.println("Student Grade is D :" +Marks);
		}

		else if(Marks<35) {
			System.out.println("Student Grade is F" +Marks);
			System.out.println("Student is Fail the examination");
		}

	}

}
