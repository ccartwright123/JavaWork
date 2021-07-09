package mavenDemo;

public class factorials {

	public String play(int num) {
		int counter = 1;
		if (num == 0 || num < 0) {
			return "None";
		} else {
			for (int a = 2; num != a; a++) {
				if (num % a == 0) {
					num = num / a;
				} else {
					return "none";
				}
				counter = a + 1;
			}
			return (counter + "!");
		}

	}
}
