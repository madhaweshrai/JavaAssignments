package Assignments;

import java.util.Arrays;

public class Array_SortArray {

	public static void main(String[] args) {
		/*
		 * //using method int arr[]= new int[5]; arr[0]= 800; arr[1]= 500; arr[2]= 900;
		 * arr[3]= 600; arr[4]= 700;
		 * 
		 * Arrays.sort(arr);
		 * 
		 * for(int i=0;i<=arr.length-1;i++) { System.out.println(arr[i]); }
		 */
		
		// without using method
		
		int arr[]= new int[5];
		arr[0]= 800; arr[1]= 500; arr[2]= 900;
	    arr[3]= 600; arr[4]= 700;
	    
	    for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=i+1;j<arr.length;j++)
	    	{
	    		int temp=0;
	    		if(arr[i]>arr[j])
	    		{
	    			temp = arr[i];
	    			arr[i]= arr[j];
	    			arr[j]= temp;
	    		}
	    	}
	    	System.out.println(arr[i]);
	    }
	    
		
	}

}
