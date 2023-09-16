package com.variables;

public class Staticvariables {
	
	int i=10;
	static String S;

	public static void main(String[] args) {
		
		Staticvariables SV = new Staticvariables();
		
		SV.i=10;
		SV.S= "INDIA";
		
		System.out.println("Static Variable of 1st candidate");
		System.out.println("*********************************");


		System.out.println(SV.i);
		System.out.println(SV.S);
		
		Staticvariables SV1 = new Staticvariables();
		
		System.out.println("Static Variable of 2nd candidate");
		System.out.println("*********************************");

		
		
		SV1.i=12;
		
		
		System.out.println(SV1.i);
		
		
		
	     System.out.println(SV1.S);
   		
		
		
		
		
		
		
		
		
		
		
		
	}

}
