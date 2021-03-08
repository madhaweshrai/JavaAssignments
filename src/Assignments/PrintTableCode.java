package Assignments;

import java.util.Scanner;

public class PrintTableCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to print table of 5 ot input any number
		Scanner sc= new Scanner(System.in);
		System.out.println("Write the table of");
		int t=sc.nextInt();
	
	
		// int t=5;
		
		for(int i=1;i<=10;i++) 
		{
			int table=t*i;
		//	System.out.println(table);
			System.out.println(t+"*"+i+"="+table);
		}

	}

}
