package hellofolder;

public class enhancedLoop {

	public static boolean even = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringArray = { "charlotte", "eva", "daryl", "ryan", "katie" };
		for (String str : stringArray) {
			System.out.println(str);
		}

		int[] integerArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int number : integerArray) {
			even(number);
			if (even == true) {
				int result = number * number * number;
				System.out.println(result);
			} else {
				int result = number * number;
				System.out.println(result);
			}
		}

	}

	public static boolean even(int number) {
		if (number % 2 == 0) {
			even = true;
		} else {
			even = false;
		}
		return even;
	}

}
