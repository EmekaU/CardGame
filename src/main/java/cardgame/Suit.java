package cardgame;

public enum Suit {
	
	CLUBS(1), DIAMONDS(2), HEARTS(3), SPADES(4), INVALID(5);
	
	private final int value;
	
	private Suit(int value) {
		
		this.value = value;
		
	}
	
	public int getValue() {
		
		return this.value;
	}
	
	
	public static Suit getSuit(int value) {
				
		Suit suit;
		
		switch (value) {
		
		case 1:
			suit = CLUBS;
		case 2:
			suit = DIAMONDS;		
		case 3:
			suit = HEARTS;
		case 4:
			suit = SPADES;		
		
		default:
			suit = INVALID;
		}
		
		return suit;
	}
}
