package String;

public class ModifiedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aabbbcc";
		System.out.println(modified(s));

	}
	
	 public static long modified(String a){
	        long ans = 0, same = 1;
	        
	        // check for any 3 consecutive same characters
	        // if found, then increment the count of characters to be inserted
	        for(long i = 1; i < a.length(); i++)
	        {
	            if(a.charAt((int)i) == a.charAt((int)i-1))
	                same++;
	            else
	            {
	            	if(same == 3)
	            	{
	            		ans++;
	            	}
	            	else
	            	{
	                
	                same = 1;
	            	}
	            }
	        }
	        
	        
	        return ans;
	    }
}
