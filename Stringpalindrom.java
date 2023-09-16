package com.practicePrograms;

import java.util.Scanner;

public class Stringpalindrom {

	public static void main(String[] args) {

//       Scanner pd = new Scanner(System.in);
//       
//       System.out.println("Enter the String");
//       

//       String Length = pd.nextLine();
//       
//       String Org_Length=Length;
//       
//      String rev="";
//      
//     for(int i=0;i>=0;i--) {
//    	 rev = rev+Org_Length;
//    	 
//    	 if(Org_Length.equals(rev)) {
//    		 System.out.println("Given String is : " +Length);
//    		 System.out.println("Given string is a Palindrom :" +rev);
//    	 }
//    	 else {
//    		 System.out.println("Given String is : " +Length);
//    		 System.out.println("Given string is not  a Palindrom :" +rev);
//    	 
//    		 
//    	 }
//    	  
//      }
		
		  Scanner pd = new Scanner(System.in);
	       
       System.out.println("Enter the String");
       String Length = pd.nextLine();
       
       
       String Org_Length=Length;
       String rev ="";
       
       for(int i=0;i>=0;i--) {
    	   rev = rev+Org_Length;
    	   
       }
       if(Org_Length.equals(rev)) {
    	   System.out.println("The Given String is :" +Length);
    	   System.out.println("The String is  a Palindrom :"+rev);
       }
       
       else {
    	   System.out.println("The Given String is :" +Length);
    	   System.out.println("The Reverse String is not a Palindrom  :"+rev);
       }
		
	
	}
}
