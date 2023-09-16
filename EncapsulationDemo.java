package com.Encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {

		Candidate c = new Candidate();

		//Setting the data using Mutator methods
		//c.setId(100);
		c.setId(100);
		c.setName("James");

		//Getting the data using Accessor methods
		System.out.println(c.getId());
		System.out.println(c.getName());

	}










}


