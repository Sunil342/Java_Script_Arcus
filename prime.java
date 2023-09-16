package com.practicePrograms;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		
		
		Scanner Pr= new Scanner(System.in);
		System.out.println("Enter number ");

        int n = Pr.nextInt();
        
        boolean  prime = true;
        
        for(int i = 2; i%n!=0; i++) {
        	
        	if(n%i==0) {
        		
        		prime= false;
        		
        		System.out.println("The Given number is not a Prime : "+prime);
        		
        		break;
        		
        	}else {
        		 System.out.println("The Given number is a prime : " +prime);
        		 break;
       	}
        	
        
       
        }
	}
}


