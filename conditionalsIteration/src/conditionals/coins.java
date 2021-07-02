package conditionals;

public class coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(10.0, 4.70));
	}

	private static double sum(double myCash, double cost) {
		// TODO Auto-generated method stub
		double result = myCash - cost;
		int amount10 = 0;
		int amount5 = 0;
		int amount2 = 0;
		int amount1 = 0;
		int amount50p = 0;
		int amount20p = 0;
		int amount10p = 0;
		int amount5p = 0;
		int amount2p = 0;
		int amount1p = 0;

		while (result > 0) {
			if (result > 9.99) {
				result = result - 10;
				amount10 = amount10 + 1;

			} else if (result > 4.99) {
				result = result - 5;
				amount5 = amount5 + 1;

			} else if (result > 2.99) {
				result = result - 2;
				amount2 = amount2 + 1;

			} else if (result > 0.99) {
				result = result - 1;
				amount1 = amount1 + 1;

			} else if (result > 0.49) {
				result = result - 0.50;
				amount50p = amount50p + 1;

			} else if (result > 0.19) {
				result = result - 0.20;
				amount20p = amount20p + 1;

			} else if (result > 0.09) {
				result = result - 0.10;
				amount10p = amount10p + 1;

			} else if (result > 0.04) {
				result = result - 0.05;
				amount5p = amount5p + 1;

			} else if (result > 0.01) {
				result = result - 0.02;
				amount2p = amount2p + 1;

			} else {
				result = result - 0.01;
				amount1p = amount1p + 1;

			}

		}
		System.out.println("£10 notes =" + amount10);
		System.out.println("£5 notes =" + amount5);
		System.out.println("£2 coins =" + amount2);
		System.out.println("£1 coins =" + amount1);
		System.out.println("50p coins =" + amount50p);
		System.out.println("20p coins =" + amount20p);
		System.out.println("10p coins =" + amount10p);
		System.out.println("5p coins =" + amount5p);
		System.out.println("2p coins =" + amount2p);
		System.out.println("1p coins =" + amount1p);

		return 0;
	}
}
