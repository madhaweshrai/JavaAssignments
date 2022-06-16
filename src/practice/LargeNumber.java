package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int num= 567345;
          boolean isvalid = false;
         List<Long> list= new ArrayList<Long>();
          String subs="";
             String s=  Integer.toString(num);
             
             for(int i=1;i<=s.length() / 2;i++)
             {
            	 
            	 subs= s.substring(0, i);
            	 System.out.println(subs);
            	    // int num2=   Integer.parseInt(subs);
            	        Long num2=    Long.parseLong(subs);
            	        list.add(num2);
            	     String actual= subs;
            	     int al=actual.length();
            	     int l=s.length();
            	     System.out.println(al+" "+l);
            	     
            	     while(actual.length() < s.length())
            	    	 
            	     {
            	    	   //   actual +=  Integer.toString(++num2);
            	    	 
            	    	     actual +=  Long.toString(++num2);
            	    	     list.add(num2);
            	     }
            	     if(s.equals(actual))
            	     {
            	    	 isvalid=true;
            
            	    	 break;
            	    	 
            	     }
             }
             
           //  Collections.max(list);
             System.out.println(list+"  "+Collections.max(list));
             System.out.println(isvalid ? "YES " + subs : "NO");
	}

}
