package com.interfaces;

public interface Laptop {
	
	public void Copy();
	
	public void  paste();
	
	public void cut();
	
	public void keyboard();
	
   default void Security() {
	   
	   System.out.println("Laptop Security Code");
   }
   
   default void Audio() {
	    System.out.println("Laptop Voice Code");
	   
   }

}
