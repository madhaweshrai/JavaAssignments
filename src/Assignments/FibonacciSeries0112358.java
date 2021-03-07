package Assignments;

public class FibonacciSeries0112358 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print series 0 1 1 2 3 5 8 13 21 34
		//FIbonacci series
		int count=10;
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2);
		for(int i=2;i<=count;i++)
		{
			int n3= n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
			
			
		}

	}

}
