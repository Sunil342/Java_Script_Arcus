package com.variablespractice;

public class Referencevariables {

	
	   int i;
	   String name;
	   int age;
	   
	public static void main(String[] args) {
		
		Referencevariables RV = new Referencevariables();
		
		RV.i=10;
		RV.name="dyychu";
		RV.age=16;
		
		System.out.println("1st reference variable");
		System.out.println("**********************");
		System.out.println(" ");
		System.out.println(RV.i);
		System.out.println(RV.name);
		System.out.println(RV.age);
		
		Referencevariables RV1 = new Referencevariables();
		
		
		System.out.println("2nd reference variable");
		System.out.println("**********************");
		System.out.println(" ");
		
		System.out.println(RV1.age=12);
		System.out.println(RV1.i=10);
		System.out.println(RV1.name="dsfrtnbcc");
		
		
		
		
	}

}
