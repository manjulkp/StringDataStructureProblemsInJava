package String;

import java.util.HashMap;
import java.util.Map;

public class LeftMostNonRepeating {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String str = "geeksforgeeks";

		System.out.println(findNonRepeating(str));

	}

	public static char findNonRepeating(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
				
			} else {
				map.put(str.charAt(i), 1);

			}
		}
		
		for(int i=0;i<str.length();i++)
		{
			if(map.get(str.charAt(i)) ==1)
			{
				return str.charAt(i);
			}
		}
		

		return 0;

	}
}
