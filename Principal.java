package com.Inheritances;

public class Principal  extends Teacher{

	
      String Principalname;
      
	public static void main(String[] args) {
		
		
	Principal Pal = new Principal();
	 Pal.id=10;
	 Pal.name="ABC";
	 Pal.ReportingFaculty="XYZ";
	 Pal.Principalname="PQRS";
	 
		Pal.getstudentdetails();
		Pal.getteacherdetails();
		
		
//		System.out.println("The School details are ");
//		System.out.println("id: "+Pal.id);
//		System.out.println("Name : "+Pal.name);
//		System.out.println("ReportingFaculty  is : "+Pal.ReportingFaculty);
		System.out.println("Principalname is : "+Pal.Principalname);
//		
	
		
		
		
		
		
		
		
		
		
	


		

	}

}
