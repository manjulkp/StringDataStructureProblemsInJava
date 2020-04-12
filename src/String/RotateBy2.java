package String;

public class RotateBy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2 = "azonam";

		String s1 = "amazon";

		System.out.println(isRotated(s2, s1) ? "Yes" : "No");

	}

	public static boolean isRotated(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;

		String clockwise = "";
		String anticlockwise = "";

		clockwise = clockwise + s1.substring(2, s1.length()) + s1.substring(0, 2);

		anticlockwise = anticlockwise + s1.substring(s1.length() - 2, s1.length()) + s1.substring(0, s1.length() - 2);

		return (s2.equals(clockwise) || s2.equals(anticlockwise));

	}

}
