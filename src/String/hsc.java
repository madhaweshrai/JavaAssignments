package String;

public class hsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given unordered array of odd and even number. find the maximum sum using only
		 * 3 number and sum should be even. array can be like as follows a)4 2 9 7 5 6
		 * ==> 9+7+6= 22
		 */
		
		
		int a[]= {4,2,9,7,5,6};
		int max=0;
		int temp=0;
		
		
		for(int i=0;i<=a.length-1;i++)
		{
			
			for(int j=i+1;j<=a.length-1;j++)
				
			{
				if(a[i]>a[j])
				{
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			
				
			}
		}
		
		for(int k=0;k<=a.length-1;k++)
		{
		System.out.println(a[k]);
		
		// find max based on 3 numbers
		
		    
		}
		for(int k=a.length-1;k>3;k++)
		{
	
		// find max based on 3 numbers
			max =max+a[k];
			System.out.println("max"+max);
		
		    
		}
		
		
		
	}

}
