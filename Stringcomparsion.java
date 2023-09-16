package com.Strings;

public class Stringcomparsion {

	public static void main(String[] args) {


		 String Str = "Arcus";
		 String Str1= "Arcus";
		 String Str2 = new String("Arcus");
		 String Str3 = new String("India");
		 
		 
		 boolean result = (Str==Str1);
		 System.out.println(result);
		 
		 boolean result1 = (Str.equals(Str1));
		 System.out.println(result1);
		 
		 boolean result2 = (Str==Str2);
		 System.out.println(result2);
		 
		 boolean result3 = (Str2.equals(Str3));
		 System.out.println(result3);
		 
		 

	}

}
