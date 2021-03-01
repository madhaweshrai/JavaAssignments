package DataTypes;

public class VotingEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program which ensures voting eligibility with the conditions that
		// if anyone having age 18 then they can cast their vote.
		// bytes stores values -127 to 128 which is best for storing these tyoes of cases
		// Byte>> int>> float>> Double>> long
		// age= 18;
		byte age= 18;
		System.out.println("Your Age is "+ age);
		if (age>=18)
		{
			System.out.println("CONGRATULATIONS "+"You are Eligible to cast your vote");
		}
		else
		{
			System.out.println("SORRY! "+"You are too young for voting systen=m,please try later");
		}
	}

}
