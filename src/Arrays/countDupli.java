package Arrays;

public class countDupli {

	public static void main(String[] args) {
		// WAP to find array value is duplicate or not count duplicate time as well
		
		int value=505;
		int data=500; 
		int flag=0 , count=0;
		int arr[]=new int[5];
		
		// inserting data into array
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]= data;
			
			System.out.println(arr[i]);
			data=data+1;
			
		}
		
		//matching for duplicate
		for(int j=0;j<arr.length;j++)
		{
			if(value==arr[j])
			{
			 flag=1;
			 count++;
			 break;
			 
			}
		}
		
if(flag==1)
{
	System.out.println( value +" number is duplicate");
	
}
else
{System.out.println( value +" number is not duplicate");
	}
	}

}
