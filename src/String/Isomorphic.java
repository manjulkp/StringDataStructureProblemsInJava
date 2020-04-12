package String;

import java.util.Arrays;

public class Isomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(areIsomorphic("abc", "xyz"));
		
		System.out.println(areIsomorphic("aac", "xxz"));
		
		System.out.println(areIsomorphic("abc", "xxz"));
		
	}
	
	public static boolean areIsomorphic(String str1, String str2) 
    { 
		int size = 256;
		
        int m = str1.length(); 
        int n = str2.length(); 
          
        // Length of both strings must be same for one to one 
        // corresponance 
        if(m != n) 
            return false; 
        
        // To mark visited characters in str2 
        Boolean[] marked = new Boolean[size]; 
        Arrays.fill(marked, Boolean.FALSE); 
        
        // To store mapping of every character from str1 to 
        // that of str2. Initialize all entries of map as -1. 
        int[] map = new int[size]; 
        Arrays.fill(map, -1); 
        
        for(int i =0;i<n;i++)
        {
        	if(map[str1.charAt(i)] == -1)
        	{
        		if(marked[str2.charAt(i)] == true)
        			return false;
        		
        		marked[str2.charAt(i)] = true;
        		
        		map[str1.charAt(i)] = str2.charAt(i);
        		
        	}
        	else
        	{
        		if (map[str1.charAt(i)] != str2.charAt(i))
        			return false;
        	}
        }
        
        return true;
        
        
        
        
        
    }

}
