package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		System.out.println("Enter a b c: ");
		a = myObj.nextInt();
		b = myObj.nextInt();
		c = myObj.nextInt();
		
		
		// calc discrimnant
		 d =  b*b - 4*a * c; 
		 if (d < 0) {
			 System.out.println ("Roots : imaginary");
		 }
		 else if (d == 0) {
			 double roots = -b/2*a; 
			 System.out.printf("Roots :%.2f\n",roots);
		 }
		 else {
			 double rootone= ((-1)*b + Math.sqrt(d)) / 2 * a;
			 double rootTwo=((-1)*b - Math.sqrt(d)) / 2 * a;
			 
			 if (rootone >rootTwo) {
			 System.out.printf ("Roots :%.2f, %.2f\n",rootTwo, rootone);
			 
			 }
			 else {
				 System.out.printf ("Roots :%.2f, %.2f\n",rootone, rootTwo);
				
			 }
		 }
		 
		// output
	}
	
}
