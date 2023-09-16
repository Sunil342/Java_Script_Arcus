package com.Arrays;

import java.util.Scanner;

public class CountryArrayExample {

	// Method to create an array of countries
	public static String[] createcountryArray(int numOfcountries) {

		Scanner scanner = new Scanner(System.in);
		String[] countries = new String[numOfcountries];

		System.out.println("Please enter the names of " +numOfcountries+ "country:");
		for (int i = 0; i < numOfcountries; i++) {
			System.out.print("Enter the name of country#" + (i + 1) + ": ");
			countries[i] = scanner.nextLine();
		}

		// Close the scanner
		scanner.close();
		return countries;
	}

	// Method to print the countries in the array
	public static void printcountries(String[] country) {
		System.out.println("You entered the following countries:");
		for (String Nation : country) {
			System.out.println(Nation);
		}
	}

	// to print the size of the array
	public int getCountryArraySize(String[] country) {
		return country.length;
	}

	public static void main(String[] args) {

		CountryArrayExample Nat = new CountryArrayExample();
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter the number of countries
		System.out.print("Enter the number of countries: ");
		int numFruits = scanner.nextInt();
		String[] countryarray = createcountryArray(numFruits);
		Nat.printcountries(countryarray);
		int countryArrayLength = Nat.getCountryArraySize(countryarray);
		System.out.println("Length of the countries array is : " + countryArrayLength);

	}
}
