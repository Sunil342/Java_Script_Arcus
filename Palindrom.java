package com.palindrom;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		//int i;		
		
//		Scanner PD = new Scanner(System.in);		
//	   System.out.println("Enter the number for Palindrom verification");
//	   int num = PD.nextInt();
//	   
//	   int Org_num=num;
//	   int rev =0;
//	   
//	   while(num!=0) {
//		   
//		   rev = rev*10+num%10;
//		   num = num/10;
//		   
//	   }
//	   
//	   if(rev==Org_num) {
//		   System.out.println("The Given number is Palindrom : " +rev );
//		   
//		   
//	   }
		
		
		
		
		
	   
//	   else {
//		   System.out.println("The Given number is not  Palindrom : " +rev );
//		   
//	   }
//	
		
		Scanner  Pal = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = Pal.nextInt();
		
		int Org_num= num;
	    int rev =0;
	    
	    while (num!=0) {
	    	rev = rev*10+num%10;
	    	num = num/10;
	    	
	    	
	    
	    }
	    
	    if(rev==Org_num) {
	    	System.out.println("The Given number is Palindrom : " +rev);
	    }
	    else {
	    	System.out.println("The Given  number is not a Palindrom : "+rev);
	    }
	}
}	
       
		
		
		

	
	
