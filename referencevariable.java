package com.variablePractice;

public class referencevariable {

	int i;
	String name;
	
	public static void main(String[] args) {
		
		referencevariable r = new referencevariable();
		
		r.i=10;
		r.name="hhhhhd";
		
		System.out.println("Reference Variable of 1st Vandidate");
		System.out.println("************************************");
		System.out.println(r.i);
		System.out.println(r.name);
		
		
referencevariable r1 = new referencevariable();
		
		r1.i=16;
		r1.name="hhgdg";
		
		System.out.println("   ");
		
		System.out.println("Reference Variable of 2nd Vandidate");
		System.out.println("************************************");
		
		System.out.println(r1.i);
		System.out.println(r1.name);
		
		
		
		
		
		
		
		
	}

}
