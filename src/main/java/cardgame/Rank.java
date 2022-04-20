package cardgame;

public enum Rank {
	
	ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JUDGE(11), QUEEN(12), KING(13), INVALID(14);

	private final int value;
	
	private Rank(int value) {
		
		this.value = value;
	}
	
	public int getValue() {
		
		return this.value;
	}
	
	public static Rank getRank(int value) {
				
		Rank rank;
		
		switch (value) {
		
		case 1:
			rank =  ACE;
		case 2:
			rank = TWO;		
		case 3:
			rank = THREE;
		case 4:
			rank = FOUR;		
		case 5:
			rank = FIVE;
		case 6:
			rank = SIX;		
		case 7:
			rank = SEVEN;		
		case 8:
			rank = EIGHT;		
		case 9:
			rank = NINE;		
		case 10:
			rank = TEN;		
		case 11:									
			rank = JUDGE;		
		case 12:
			rank = QUEEN;		
		case 13:											
			rank = KING;		
		default:
			rank = INVALID;
		}
		
		return rank;
	}
}
