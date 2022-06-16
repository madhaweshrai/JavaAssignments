package Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class DupUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "maddyrai";
		
		char c[]=  s.toCharArray();
		
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		
		for(char e: c)
		{
			  Integer count= map.get(e);
			  if(count==null)
			  {
				  map.put(e, 1);
			  }else
			  {
				  map.put(e, ++count);
			  }
		}
		
		 Iterator<Entry<Character,Integer> > i= map.entrySet().iterator();
		 while(i.hasNext())
			 
		 {
			 Entry<Character,Integer> es= i.next();
			 if(es.getValue()>1) {
			 System.out.println(es.getKey() +"-"+es.getValue());
			 }
		 }
		 System.out.println("-------------------");
		 //using set with map print unique array element
		  Set<Entry<Character,Integer> > set= map.entrySet();
		  for(Entry<Character,Integer> e: set)
		  {
			  if(!(e.getValue()>1))
			  {
				  System.out.println(e.getKey());
			  }
		  }
		 
		 
		

	}

}
