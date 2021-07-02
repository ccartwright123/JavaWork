package arraydemo;

public class arraytask {

	public static void main(String[] args) {
		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = i;
			System.out.println(num[i]);
		}
		for (int i = 0; i < num.length; i++) {
			num[i] = i * 10;
			System.out.println(num[i]);
		}
	}

}
