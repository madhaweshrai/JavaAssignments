package practice;

import java.util.Arrays;

public class SortStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s[]={"aaz","abz","bb"};
        String temp;
        
        
        for(int i=0;i<=s.length-1;i++)
        {
            
            for(int j=1;j<=s.length-1;j++)
            {
                
                
                
                if( s[j-1].compareTo(s[j])>0)
                {
                	temp=s[j-1];
                	s[j-1]=s[j];
                	s[j]=temp;
                	
                	//temp=s[i];
                //	s[i]=s[j];
                	//s[j]=temp;
                }
                	
            }
        }
        
        System.out.println(Arrays.toString(s));
	}

}
