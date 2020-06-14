package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MaxOccuringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(occurance("manjula"));
	}

	public static char occurance(String s) {
		char array[] = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		int res = Integer.MIN_VALUE;
		int indexMax = -1;
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);
				
				if (res < map.get(array[i])) {
					res = map.get(array[i]);
					indexMax = i;
				}
				
			} else {
				map.put(array[i], 1);
			}
		}

		return s.charAt(indexMax);

	}

}
