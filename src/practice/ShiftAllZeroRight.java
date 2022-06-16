package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ShiftAllZeroRight {

	public static void main(String[] args) {
		int count=0;
	    int a[]={1,0,1,0,1,0,1,3,5,4};
	   
	     for(int i=0;i<=a.length-1;i++)
	     {
	    	 //shifted non 0 element to left
	         if(a[i]!=0)
	         {
	             a[count++]=a[i];
	            
	         }
	     }
	     //shifted  0 element to right
	     while(count<a.length)
	     {
	         a[count++]= 0;
	       
	     }
	      
	              
	    for(int k=0;k<a.length;k++)
	    {
	    	System.out.println(a[k]);
	    }
	              
	    }
	}


