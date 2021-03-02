package Assignments;

public class Array_SearchNumberInsideArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WAP to search number inside array and print its position as well.
		
		int number= 104 , flag=0 , count=0;
		
		int arr[]= new int[5];
		
		arr[0] = 101;
		arr[1] = 102;
		arr[2] = 103;
		arr[3] = 104;
		arr[4] = 105;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(number==arr[i])
			{
				flag=1;
				count= count+i;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("Number "+number +" found at position "+ count);
		}
		else
		{
			System.out.println("Number not present");
		}
		

	}

}
