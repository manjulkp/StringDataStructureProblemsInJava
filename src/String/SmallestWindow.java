package String;

public class SmallestWindow {

	static final int no_of_chars = 256;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this is a test string"; 
        String pat = "tist";
        System.out.print("Smallest window is :\n " + 
        		getSubStringWindow(str, pat)); 
        
	}
	
	public static String getSubStringWindow(String str,String pat)
	{
	 int m = str.length();
	 int n = pat.length();
	 
	 if(m<n)
	 {
		 System.out.println("No such window exists"); 
         return ""; 
	 }
	 
	 int hash_pat[] = new int[no_of_chars]; 
     int hash_str[] = new int[no_of_chars]; 
   
     // store occurrence ofs characters of pattern 
     for (int i = 0; i < n; i++) 
         hash_pat[pat.charAt(i)]++; 
     
     int start = 0;
     int count = 0;
     int window_size =Integer.MAX_VALUE; 
     int start_index =-1;
     
     for (int j = 0; j < m ; j++) 
     { 
         
         hash_str[str.charAt(j)]++;
         
         if (hash_pat[str.charAt(j)] != 0 & hash_str[str.charAt(j)] <= hash_pat[str.charAt(j)] ) 
                 count++;
         
         if(count == n)
         {
        	 while ( hash_str[str.charAt(start)] > hash_pat[str.charAt(start)]  || hash_pat[str.charAt(start)] == 0) 
                 { 
       
                     if (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)]) 
                         hash_str[str.charAt(start)]--; 
                     start++; 
                 } 
        	 
        	 int len_window = j - start + 1; 
             if (window_size > len_window) 
             { 
            	 window_size = len_window; 
                 start_index = start; 
             } 
         }
     
	}
     
     
     if (start_index == -1) 
     { 
     System.out.println("No such window exists"); 
     return ""; 
     } 
   
     // Return substring starting from start_index 
     // and length min_len 
     return str.substring(start_index, start_index + window_size); 
	}

}
