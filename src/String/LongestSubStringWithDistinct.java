package String;

public class LongestSubStringWithDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABDEFGABEF";
		System.out.println(longestDistinct(s));
	}

	public static int longestDistinct(String s) {
		int res = Integer.MIN_VALUE;
		int n = s.length();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (areDistinct(s, i, j))
					res = Math.max(res, j - i + 1);
			}
		}
		return res;
	}

	// check unique char from start index till end index
	public static boolean areDistinct(String s, int startIndex, int endIndex) {
		boolean visited[] = new boolean[256];
		for (int k = startIndex; k <= endIndex; k++) {
			if (visited[s.charAt(k)] == true) {
				return false;
			} else {
				visited[s.charAt(k)] = true;
			}
		}
		return true;

	}
}
