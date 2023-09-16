package com.Evenodd;

public class EvenoddReturmtype {
	
	int n=5;
	public int Evenoddcheck() {
		
		if(n%2==0) {
			System.out.println("The Output of given number is");
			System.out.println("******************************");
			System.out.println("Given number is Even");
			return 0;
			
		}		
		
	 else if(n%2!=0) {
		 System.out.println("The Output of given number is");
		 System.out.println("******************************");
		 System.out.println("Given number is Odd");
	 }
		return 1;
		
	}
	


	public static void main(String[] args) {
		
		EvenoddReturmtype EOR = new EvenoddReturmtype();
		
		EOR.Evenoddcheck();	
		
	}

}
