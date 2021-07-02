package conditionals;

public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 10;
		int B = 10;

		if (A > 21 && B > 21) {
			System.out.println("Bust");
		} else if (A > 21) {
			System.out.println("player 2 wins with " + B);
		} else if (B > 21) {
			System.out.println("player 1 wins with " + A);
		} else if (A == B) {
			System.out.println("Player 1 and player 2 draw with " + B);
		} else if (A > B) {
			System.out.println("player 2 wins with " + A);
		} else if (B > A) {
			System.out.println("player 2 wins with " + B);
		} else {
			System.out.println("ERROR");
		}
	}

}
