package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateStringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello madam";
		 char c[]= s.toCharArray();
		 
		 Map<Character,Integer> m=new HashMap<Character,Integer>();
		 
		 for(char cnew:c)
		 {
			      Integer count=  m.get(cnew);
			      if(count==null)
			      {
			    	  m.put(cnew, 1);
			      }
			      else
			      {
			    	  m.put(cnew, ++count);
			    	  
			      }
		 }
		 System.out.println(m);
		 
		 Set<Entry<Character,Integer>> set= m.entrySet();
		 
		 for(Entry<Character,Integer> setnew:set)
		 {
			 if(setnew.getValue()>1)
			 System.out.println(setnew.getKey());
		 }
		 
		 // 
		 System.out.println("--------------");
		        Iterator<Entry<Character,Integer>> i=  m.entrySet().iterator();
		        
		        while(i.hasNext())
		        {
		        	Entry<Character,Integer> es= i.next();
		        	if(es.getValue()>1)
		        		System.out.println(es.getKey());
		        	
		        }
		   	 System.out.println("--------------");
		   	 
		   	 Set<Character> s1=new TreeSet<Character>();
		   	 
		   	 for(Character k:c)
		   	 {
		   		 if(s1.add(k)==false)
		   		 {
		   			 System.out.println(k);
		   		 }
		   	 }
		   	 
		   	 
		   	 

	}

}
