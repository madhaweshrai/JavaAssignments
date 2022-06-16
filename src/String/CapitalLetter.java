package String;

public class CapitalLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="MaddyRai09@#";
		int upper=0;
		int lower=0;
		int number=0;
		int spl=0;
		
		
		for(int i=0;i<=s.length()-1;i++)
		{
			    char c=   s.charAt(i);
			if(c >= 'A' && c <= 'Z')
			{
				upper++;
				System.out.println(c);
			
			}
			else if(c >= 'a' && c <= 'z')
			{
				lower++;
				System.out.println(c);
			}
			else if(c >= '0' && c <= '9')
				
			{
				number++;
				System.out.println(c);
				
			}
           else 
				
			{
				spl++;
				System.out.println(c);
				
			}
		}
		
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(number);
		System.out.println(spl);

	}

}
