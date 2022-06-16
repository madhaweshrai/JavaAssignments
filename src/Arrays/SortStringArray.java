package Arrays;

import java.util.Arrays;

public class SortStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a[]= {"John","ram","ammy"};
		
		String temp;
		
		for (int i=0;i<a.length-1;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if((a[i].compareTo(a[j]))>0)
					
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			
		}
		for (int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}
	}

}
