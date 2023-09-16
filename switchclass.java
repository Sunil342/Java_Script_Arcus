package com.Switch;

public class switchclass {

	public static void main(String[] args) {
		int Day=5;
		String Dayname="Unknown";
		
		switch(Day) {
		
         case 1: Dayname="Monday" ;
         
          break;
          
         case 2: Dayname="Tuesday";
         
         break;
         
         case 3: Dayname = "Wednesday";
         
         break;
				
        case 4: Dayname = "Thursday";
         
         break;
				
        case 5: Dayname = "Friday";
 
        break;
		
        case 6: Dayname = "Saturday";
 
        break;
		
       case 7: Dayname = "Sunday";
 
       break;
		
       default :
			System.out.println("Invalid Day");

        
			
		}
		
		System.out.println("The given day is :" +Day +" " +" : " + Dayname);
		
		

	}

}
