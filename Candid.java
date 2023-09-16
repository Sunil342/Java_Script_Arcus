package com.Encapsulation;

public class Candid {
	
	private int id;
	private String name;
	
	
	public void getcandiddetails() {
		
		System.out.println(id);
		System.out.println(name);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
