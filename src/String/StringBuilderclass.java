package String;

public class StringBuilderclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // SB is mutable in nanute and its methods are async ,it is very fast in nature
		// they have all methods of string but other imp methods also like
		//append , setchatst,insert and all
		
		 String st="Tony";
		StringBuilder sb= new StringBuilder(st);
		System.out.println(sb);
		
		// fun 1
		sb.setCharAt(0, 'P');
		System.out.println(sb);
		
		//fun2
		sb.insert(2, 'n');
		System.out.println(sb);
		
		//fun3
		System.out.println(sb.substring(0, 4));
		
		//fun4 - uses same object to appent in heap m/r differ 4m string literals
		sb.append('j');
		sb.append(st);   //accepts entire stringas well
		sb.reverse();
		
		System.out.println(sb);
		
		
		
	}

}
