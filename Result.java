package com.inheritance;

public class Result extends Students {

	String  Grade;

	public static void main(String[] args) {

		Result result = new Result();

		result.marks=60;
		result.Grade="A";

		result.marks();
		System.out.print("Student Grade is : ");
		System.out.println(result.Grade="A");
	}

}
