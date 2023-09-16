package com.interfaces;

public class Hp implements Laptop {

	@Override
	public void Copy() {
		System.out.println("HP copy code");
	}

	@Override
	public void paste() {
		System.out.println("HP cut code");
	}

	@Override
	public void cut() {
		System.out.println("HP Paste code");
	}

	@Override
	public void keyboard() {
		System.out.println("HP keyboard code"); 
		
	}

}
