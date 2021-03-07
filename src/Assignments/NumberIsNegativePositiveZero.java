package Assignments;

import java.util.Scanner;

public class NumberIsNegativePositiveZero {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number ::");
	      Scanner sc = new Scanner(System.in);
	      num = sc.nextInt();
	    
	      if(num<0)
	      {
	    	  System.out.println("Negative");
	      }
	      else if(num>0)
	      {
	    	System.out.println("Positive");  
	      }
	      else
	    	  System.out.println("Zero");
	    	  

	}

}
