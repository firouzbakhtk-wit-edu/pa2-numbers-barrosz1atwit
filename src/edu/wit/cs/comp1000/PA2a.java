package edu.wit.cs.comp1000;
import java.util.Scanner;  // Import the Scanner class

// TODO: document this class
public class PA2a {

	// TODO: document this function 
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter five whole numbers: ");

	    int number = myObj.nextInt();  // Read user input
		// TODO: package edu.wit.
	    int number2 = myObj.nextInt();  // Read user input
	    int number3 = myObj.nextInt();  // Read user input
	    int number4 = myObj.nextInt();  // Read user input
	    int number5 = myObj.nextInt();  // Read user input
	    
	    //System.out.println("Number1 = " + number);  // Output user input
	    
	    int positivenumbers = 0;
	    int negativenumbers = 0;
	    int allnumbers=0;
	    int countpositivenumbers=0;
	    int countnegativenumbers=0;
	    
	    double averageofpositivenumbers = 0; 
	    double averageofnegativenumbers = 0;
	    double averageofallnumbers = 0;
	    
	    if(number > 0){
	    	positivenumbers = positivenumbers + number;
	    	countpositivenumbers=countpositivenumbers + 1;
	    	
	    			
	    }
	    else {
	    	negativenumbers = negativenumbers + number;
	    	countnegativenumbers=countnegativenumbers + 1;
	    	

	    	
	    
	    
	    }
	    if(number2 > 0) {
	    	positivenumbers = positivenumbers + number2;
	    	countpositivenumbers=countpositivenumbers + 1;
			
	    }
	    else {
	    	negativenumbers = negativenumbers + number2;
	    	countnegativenumbers=countnegativenumbers + 1;

	    	
	    }
	    
	    if(number3 > 0) {
	    	positivenumbers = positivenumbers + number3;
	    	countpositivenumbers=countpositivenumbers + 1;
			
	    }
	    else {
	    	negativenumbers = negativenumbers + number3;
	    	countnegativenumbers=countnegativenumbers + 1;
	    	
	    }
	    if(number4 > 0) {
	    	positivenumbers = positivenumbers + number4;
	    	countpositivenumbers=countpositivenumbers + 1;
			
	    }
	    else {
	    	negativenumbers = negativenumbers + number4;
	    	countnegativenumbers=countnegativenumbers + 1;
	    	
	    }
	    if(number5 > 0) {
	    	positivenumbers = positivenumbers + number5;
	    	countpositivenumbers=countpositivenumbers + 1;
			
	    }
	    else {
	    	negativenumbers = negativenumbers + number5;
	    	countnegativenumbers=countnegativenumbers + 1;
	    	
	    }
	   
	   allnumbers = positivenumbers + negativenumbers;
	   
	   
	   averageofallnumbers= (double) allnumbers/5;
	   
	   if (countpositivenumbers > 0)
	   {
		   averageofpositivenumbers = (double)positivenumbers/countpositivenumbers;
	   }
	   
	   if (countnegativenumbers > 0)
	   {
		   averageofnegativenumbers=(double)negativenumbers/countnegativenumbers;
	   }
	   
	   /*if (countpositivenumbers == 1)
	   {
		   System.out.println("The sum of the " + countpositivenumbers + " positive number: " + positivenumbers);
	   }
	   else
	   {
		   System.out.println("The sum of the " + countpositivenumbers + " positive numbers: " + positivenumbers);
	   }
	   
	   if (countnegativenumbers == 1)
	   {
		   System.out.println("The sum of the " + countnegativenumbers + " negative number: " + negativenumbers);
	   }
	   else
	   {
		   System.out.println("The sum of the " + countnegativenumbers + " negative numbers: " + negativenumbers);
	   }
	   System.out.println("The sum of the 5 numbers: " + allnumbers );
	   if (countpositivenumbers == 1)
			   {
	   System.out.println("The average of the " + countpositivenumbers + " positive number: " + averageofpositivenumbers);
			   }
	   else
	   {
	   System.out.println("The average of the " + countpositivenumbers + " positive numbers: " + averageofpositivenumbers);

	   }
	  if (countnegativenumbers == 1) 
	  {
	   System.out.println("The average of the " + countnegativenumbers + " non-positive number: " + averageofnegativenumbers);
	  }
	  else
	  {
		   System.out.println("The average of the " + countnegativenumbers + " non-positive numbers: " + averageofnegativenumbers);
	  }
	   System.out.println("The average of the 5 numbers: " +  averageofallnumbers);*/
	   
	   if (countpositivenumbers == 1)
	   {
		   System.out.printf("The sum of the %d positive number: %d\n", countpositivenumbers, positivenumbers);
	   }
	   else
	   {
		   System.out.printf("The sum of the %d positive numbers: %d\n", countpositivenumbers, positivenumbers);
	   }
	   
	   if (countnegativenumbers == 1)
	   {
		   System.out.printf("The sum of the %d negative numbers: %d\n", countnegativenumbers, negativenumbers);
	   }
	   else
	   {
		   System.out.printf("The sum of the %d negative numbers: %d\n", countnegativenumbers, negativenumbers);
	   }
	   
	   System.out.printf("The sum of the 5 numbers: %d\n", allnumbers);
	   
	   if (countpositivenumbers == 1)
	   {
	   System.out.printf("The average of the %d positive numbers: %.2f\n", countpositivenumbers, averageofpositivenumbers);
	}
	   else
	   {
	   System.out.printf("The average of the %d positive numbers: %.2f\n", countpositivenumbers, averageofpositivenumbers);

	   }
	  if (countnegativenumbers == 1) 
	  {
	   System.out.printf("The average of the %d non-positive numbers: %.2f\n", countnegativenumbers, averageofnegativenumbers);
	  }
	  else
	  {
		   System.out.printf("The average of the %d non-positive numbers: %.2f\n", countnegativenumbers, averageofnegativenumbers);
	  }
	   System.out.printf("The average of the 5 numbers: %.2f\n", averageofallnumbers);
	}
}

