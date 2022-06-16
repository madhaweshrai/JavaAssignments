package Arrays;

import java.util.Arrays;

public class PrintArrayRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,6,4,3,0};
		int len= a.length;
		
		//rec(a,len);
		
		//System.out.println(Arrays.toString(a));
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}

	}

	
	static void rec(int []a,int len)
	{
		if(len==1)
			return;
		rec(a,len-1);
		
	}
}
