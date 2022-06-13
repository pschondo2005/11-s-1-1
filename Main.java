/**
 * This is a class that tests the Card class.
 */
public class Main {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card favoritecard = new Card("ace", "spades", 11);
		Card anothercard = new Card("five", "hearts", 5);
		Card getwellsoon = new Card("nine", "clubs", 9);
		
		
		System.out.println(favoritecard.suit());
		System.out.println(favoritecard.rank());
		System.out.println(favoritecard.pointValue());
		System.out.println(favoritecard.matches(anothercard));
		System.out.println(favoritecard.toString());
		
	}
	
}
