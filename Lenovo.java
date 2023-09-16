package com.interfaces;

public class Lenovo implements Laptop {

	@Override
	public void Copy() {
		System.out.println("Lenovo copy code");
	}

	@Override
	public void paste() {
		System.out.println("Lenovo cut code");
	}

	@Override
	public void cut() {
		System.out.println("Lenovo Paste code");
	}

	@Override
	public void keyboard() {
		System.out.println("Lenovo keyboard code"); 
		
	}
	
	public void camera() {
		System.out.println("Lenovo Camera code");
	}

  
		
	

}
