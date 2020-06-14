package String;

public class RotateBy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2 = "eksforGeeksGe";

		String s1 = "GeeksforGeeks";

		System.out.println(isRotated(s1, s2, 2) ? "Yes" : "No");

	}

	public static boolean isRotated(String s1, String s2, int rotate) {
		if (s1.length() != s2.length())
			return false;

		String clockwise = "";
		String anticlockwise = "";

		// right rotate
		clockwise = clockwise + s1.substring(s1.length() - rotate, s1.length()) + s1.substring(0, s1.length() - rotate);
		System.out.println("the string in clockwise is " + clockwise);

		// left rotate
		anticlockwise = anticlockwise + s1.substring(rotate, s1.length()) + s1.substring(0, rotate);
		System.out.println("the string in anticlockwise is " + anticlockwise);

		return (s2.equals(clockwise) || s2.equals(anticlockwise));

	}

}
