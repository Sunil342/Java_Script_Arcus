package com.practicePrograms;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		//Scanner PN = new Scanner(System.in);
		Scanner PN = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int i = PN.nextInt();
		
	int j = 2;
		
		if(i/1==0 & i/i==0 & i%j!=0) {
			
			System.out.println("The Given number is  a Prime :"+i);
			
		}
		//else if(i%1!=0||i%i!=0)
		else{
			System.out.println("The Given number is not a  Prime :"+i);
		}

	}

}
