package com.twodimensionalarray;

public class Twodimensionalarray {

	public static void main(String[] args) {


		int Array[][] = new int[3][3];

		Array[0][0]= 10;
		Array[0][1]= 20;
		Array[0][2]= 30;

		Array[1][0]= 40;
		Array[1][1]= 50;
		Array[1][2]= 60;

		Array[2][0]= 70;
		Array[2][1]= 80;
		Array[2][2]= 90;

		for(int i=0;i<3;i++) {

			for(int j=0;j<3;j++) {

				System.out.println(Array[i][j] + "  ");


			}
			System.out.println(" ");
		}

	}
}


