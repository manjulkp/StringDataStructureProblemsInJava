package array;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5 };
		int x = 4;
		int y = 5;

		int count_x = 0;
		int count_y = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				count_x++;
			}

			if (arr[i] == y) {
				count_y++;
			}
		}

		if (count_x > count_y)
			System.out.println(x);

		else if (count_y > count_x)
			System.out.println(y);

		else if (x < y) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}

	}

}
