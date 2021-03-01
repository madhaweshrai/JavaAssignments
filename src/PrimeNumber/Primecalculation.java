package PrimeNumber;

public class Primecalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=19;
		int flag=0;
		for(int i=2;i<= num-1;i++)
		{
			
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println(num +" is prime");
		}
		else
		{
			
				System.out.println(num +" is not prime");
			
		}
		
	}
	}


