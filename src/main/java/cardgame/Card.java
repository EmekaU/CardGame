package cardgame;

public class Card {
	
	private Suit suit;
	private Rank rank;
	
	Player Player;
	
	Card(Suit suit, Rank rank){
		
		this.setSuit(suit);
		this.setRank(rank);
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
}
