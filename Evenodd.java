package com.Evenodd;

public class Evenodd {


	int i=5;

	public void Evenodd() {

		if(i%2==0) {
			System.out.println("Given number is Even");


		}else if(i%2!=0) {
			System.out.println("Given number is ODD");
		}
	}

	public static void main(String[] args) {

		Evenodd EO = new Evenodd();

		EO.Evenodd();


	}

}
