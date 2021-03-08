package Assignments;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=654321;
int rem;
int result=0;
while(num !=0)
{
	
	rem=num%10;
	result= result*10+rem;
	num=num/10;

}
System.out.println("Reverse on given number is "+result);
	}

}
