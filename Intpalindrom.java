package com.practicePrograms;

import java.util.Scanner;

public class Intpalindrom {

	public static void main(String[] args) {

//     Scanner PD = new Scanner(System.in);
//     System.out.println("Enter a Number ");
//     int num = PD.nextInt();
//     
//     int Org_num = num;
//     int rev =0;
//     
//     while(num!=0) {
//    	 rev = rev*10+num%10;
//    	 num = num/10;
//    	 
//     }
//     
//     if(Org_num==rev) {
//    	 System.out.println("Given number is a Palindrom : "+rev);
//    	 
//     }
//     
//     else {
//    	 
//    	 System.out.println("Given number is not a Palindrom : "+rev);
//     }

		
		
		Scanner PD = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int num = PD.nextInt();
		
		int Org_num = num;
		
		int rev=0;
		
		while(num!=0 ) {
			
			rev = rev*10+num%10;
			
			num = num/10;
		}
		
		if(Org_num==rev) {
			
			System.out.println("Value is Palindrom :" +rev);
			
			
			
		}
		
		else {
			System.out.println("Value is not  a  Palindrom :" +rev);
			
		}
	}

}
