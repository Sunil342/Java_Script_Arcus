package com.variables;

public class Localvariabls {
	
	public void add() {
		
		int i=10;
		int j=20;
		int sum = i+j;
		
		System.out.println(sum);
		
	}
	
	
	public static void substract() {
		
		int x=30;
		int y=20;
		int substract= x-y;
		
		System.out.println(substract);
		
	}
	
	
	public int Product(int a, int b) {
		
		int product = a*b;
		
		return product;
		

		
		
	}
	
	
	

	public static void main(String[] args) {
		
		Localvariabls lv = new Localvariabls();
		
		lv.add();
		lv.substract();
		
		//lv.Product(10, 20);
		
		System.out.println(lv.Product(10, 20));
	  
		
		
		
		
		
		







	}

}
