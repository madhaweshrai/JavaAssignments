package Assignments;

public class CheckPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121;
		int tempnum=num;
		int rev=0;
		int rem;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}

		if(tempnum==rev)
		{
			System.out.println(rev+" is Plaindrom");
		}
		else
		{
			System.out.println(rev+" is Not a Plaindrom");
		}
	}

}
