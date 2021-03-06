package String;

public class RotatedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "AACD"; 
        String str2 = "ACDA"; 
       
        rotated(str1,str2);
        
	}
	
	public static void rotated(String s1,String s2)
	{
		String temp = s1+s1;
		boolean status = search(temp,s2);
		if(status)
		{
			System.out.println("The two string are rotated");
		}
		else
		{
			System.out.println("The two string not rotated");
		}
		
	}
	
	static boolean search(String txt, String pat)  
	{  
	    int M = pat.length();  
	    int N = txt.length();  
	    int i = 0;  
	  
	    while (i <= N - M)  
	    {  
	        int j;  
	  
	        /* For current index i, check for pattern match */
	        for (j = 0; j < M; j++)  
	            if (txt.charAt(i + j) != pat.charAt(j))  
	                break;  
	  
	        if (j == M) // if pat[0...M-1] = txt[i, i+1, ...i+M-1]  
	        {  
	            System.out.println("Pattern found at index "+i);  
	            i = i + M; 
	            return true;
	        }  
	        else if (j == 0)  
	            i = i + 1;  
	        else
	            i = i + j; // slide the pattern by j  
	    }
	    return false;
	    
	}
	

}


