package String;

public class Sumofnumbersinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1adb23";
		System.out.println(getSum(s));
	}

	public static int getSum(String s) {
		char arr[] = s.toCharArray();

		int sum = 0;
		String temp = "";

		for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i])) {
				temp += arr[i];
			} else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}

		return sum + Integer.parseInt(temp);
	}

}
