package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Isogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(occurance("manjula"));
System.out.println(occurance("manjul"));
	}

	public static boolean occurance(String s) {
		char array[] = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);
			} else {
				map.put(array[i], 1);
			}
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() != 1) {
				return false;
			}
		}
		
		return true;

	}

}
