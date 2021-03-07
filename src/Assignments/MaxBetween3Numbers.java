package Assignments;

public class MaxBetween3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=50;
		int num2=40;
		int num3=30;
		if((num1>num2) && (num1>num3))
		{
			System.out.println("Num1 is Max");
		}
		else if((num2>num1)&& (num2>num3))
		{
			System.out.println("Num2 is Max");
		}
		else
			System.out.println("Num3 is Max");

	}

}
