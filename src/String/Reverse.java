package String;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= " Maddy rai";
		String Rev=null;
		
		for(int i=s1.length()-1;i>=0;i--)
			
		{
			Rev=  Rev+s1.charAt(i);
		}
		
System.out.println("reversed string "+ Rev);

String s2= Rev.replaceAll("\\s+", " ");
   char[]arr = s1.toCharArray();
System.out.println(s2);
System.out.println(s1.replace('a', 'p'));
System.out.println(f1());

Integer c= null;
System.out.println(c);
	}
	
	public static  int f1()
	{
		return 1;
	}

}
