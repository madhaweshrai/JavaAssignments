package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FindDuplicateInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<String>  list1 = new ArrayList<String>();
		 
		   list1.add("1"); list1.add("2"); list1.add("1");list1.add("1");
		    
		   List<String>  list2 = new ArrayList<String>();
		   
		   for(int i=0;i<list1.size();i++)
		   {
		   
		    if(!(list2.contains(list1.get(i))))
		    {
		    	list2.add(list1.get(i));
		    }
		   }
		   System.out.println(list1);
		   System.out.println(list2);
		   
		   //using set
		  Iterator<String> it= list1.iterator();
		   Set<String> s= new HashSet<String>();

while(it.hasNext())
{ 
	s.add(it.next());
	
}

		    
		   System.out.println("-"+s);
	}

}
