package com.inheritance;

public class Users {

	public static void main(String[] args) {
		
		Guest g = new Guest();
		
		g.read();
		
		Developer dev = new Developer();
		
		//dev.read();
		dev.write();
		
		
		Admin Ad = new Admin();
		//Ad.read();
		//Ad.write();
		Ad.manage();

	}

}
