/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Deck fin = new Deck(new String[] {"Ace", "King", "Jack"} , new String[]{"Hearts"}, new int[] {1,13,11});
		fin.isEmpty();
		fin.deal();
		fin.shuffle();
		System.out.println(fin);
	}
}
