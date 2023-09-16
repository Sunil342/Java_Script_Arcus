package com.Evenodd;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {

		int i=0;
      Scanner Scan = new Scanner(System.in);
      
     System.out.println("Enter the Salary");
     
     int Salary = Scan.nextInt();
     
     if(i%2==0) {
    	 
    	 System.out.println("The Entered Salary is Even :" +Salary);
     }
     
     
// else if(i==0) {
//    	 
//    	 System.out.println("The Employee is an Intent : " +Salary);
//    	 
//     }

     
     else if (i%2!=0){
    	 
    	 System.out.println("The Entered Salary is ODD :" +Salary);
     }
     
    
	}

}
