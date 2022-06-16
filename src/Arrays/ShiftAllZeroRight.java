package Arrays;

import java.util.Arrays;

public class ShiftAllZeroRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,0,0,0,1,0,1};
		int l=a.length;
		int count=0;
		for(int i=0;i<=l-1;i++)
		{
			if(a[i]!=0)
			{
				a[count++]=a[i];
			}
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println("----------");
		while(count<l)
		{
			a[count++]=0;
		}
		
		System.out.println(Arrays.toString(a));

	}

}
