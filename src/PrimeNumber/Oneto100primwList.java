package PrimeNumber;

public class Oneto100primwList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0,count=0;
		for(int num=2;num<=100;num++)
			
		{
			
			
			for(int i=2;i<=num-1;i++)
			{
				if(num%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println( num);
				 count= count+1;
			}
			else
			{
				flag=0;
			}
		}
		System.out.println("total prime numbers are"+ count);
		
	}
	}

