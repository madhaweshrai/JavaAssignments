package practice;

public class SeparateTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num= 858687;
          boolean isvalid = false;
          int max[];
          String subs="";
             String s=  Integer.toString(num);
             
             for(int i=1;i<=s.length() / 2;i++)
             {
            	 
            	 subs= s.substring(0, i);
            	 System.out.println(subs);
            	    // int num2=   Integer.parseInt(subs);
            	        Long num2=    Long.parseLong(subs);
            	     String actual= subs;
            	     int al=actual.length();
            	     int l=s.length();
            	     System.out.println(al+" "+l);
            	     
            	     while(actual.length() < s.length())
            	    	 
            	     {
            	    	   //   actual +=  Integer.toString(++num2);
            	    	     actual +=  Long.toString(++num2);
            	    	      
            	     }
            	     if(s.equals(actual))
            	     {
            	    	 isvalid=true;
            
            	    	 break;
            	    	 
            	     }
             }
             
             System.out.println(isvalid);
             System.out.println(isvalid ? "YES " + subs : "NO");
 
	}

}
