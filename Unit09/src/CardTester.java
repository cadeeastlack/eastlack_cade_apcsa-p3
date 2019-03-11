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
		Card SpadesTest = new Card("Ace", "Spades", 1);
		System.out.println(SpadesTest);
		
		Card DiamondsTest = new Card("Ace", "Diamonds", 1);
		System.out.println(DiamondsTest);
		
		Card SpadesTest2 = new Card("Ace", "Spades", 2);
		System.out.println(SpadesTest2);
	}
}
