package Arrays;

import java.util.Arrays;

public class recussionsort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int a[]= {2,6,4,3};
		int len= a.length;
		
		rec(a,len);
		Thread.sleep(1000);
		System.out.println(Arrays.toString(a));

	}
	
	static void rec(int a[],int len)
	{
		int temp=0;
		if(len==1)
			return;
		for(int i=0;i<len-1;i++)
		{
			if(a[i]>a[i+1])
			{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			}
			
		}
		rec(a,len-1);
	}

}
