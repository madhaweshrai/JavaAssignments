package Arrays;

public class ShiftAllOneToLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={4,1,2,5,1,3,1,9,7};
		   int l= arr.length;
		   int count=arr.length-1;

		   for(int i=l-1;i>=0;i--)
		   
		   {
		       if(arr[i]!=1)
		       {
		          arr[count]=arr[i];
		          count--;
		         
		           
		       }
		      
		   }
		   
		while(count>=0)
		{
		    arr[count]=1;
		    count--;
		}

		 for(int j=0;j<=l-1;j++)
		 {
		     
		     System.out.print(arr[j]);
		 }

	}

}
