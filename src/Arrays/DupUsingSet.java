package Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DupUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {2,1,5,3,2,5,3,2,9,7};
		
		Set<Integer> s= new HashSet<Integer>();
		Set<Integer> s2= new TreeSet<Integer>();
		
		for(int e:a)
		{
			if(s.add(e)==false)
				
			{
				System.out.println(e);
			}
		}
		
		//remove duplicate element
		
		System.out.println("-------");
		for(int e:a)
		{
			s.add(e);
			
		}
		System.out.println(s);

	
	System.out.println("tree set-------");
	for(int e:a)
	{
		s2.add(e);
		
	}
	System.out.println(s2);
}

}
