/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card c = new Card("Ace", "Spades", 20);
		System.out.println(c);
		c = new Card("Joker", "Diamonds", 20);
		System.out.println(c);
		c = new Card("Jack", "Spades", 20);
		System.out.println(c);
	}
}
