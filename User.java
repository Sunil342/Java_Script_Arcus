package com.interfaces;

public class User {

	public static void main(String[] args) {
		
		Lenovo LN = new Lenovo();
		
		LN.Copy();
		LN.paste();
		LN.cut();
		LN.camera();
		LN.Security();
        LN.Audio();
		
		Hp hp =new Hp();
		System.out.println(" ");
		hp.Copy();
	}

}
