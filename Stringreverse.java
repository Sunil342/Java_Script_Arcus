package com.reversestring;

public class Stringreverse {

	public static void main(String[] args) {


		StringBuffer stb = new StringBuffer("India");
		
		stb.append(" is a Developing Country");
		
		System.out.println("The Given String is :"+stb);
		
		stb.reverse();
		System.out.println("  ");
		System.out.println("The Reverse String is  : " +stb);
		

	}

}
