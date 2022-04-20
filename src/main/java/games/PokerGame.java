package games;

import cardgame.Card;
import cardgame.Game;

public class PokerGame extends Game {

	public PokerGame(int numDecks) {
		super(numDecks);
	}
	
	@Override
	public void createDeck() {
		// TODO Auto-generated method stub
		super.createDeck();
	}

	@Override
	public Card rankCards(Card card1, Card card2) {
		return super.rankCards(card1, card2);
	}
	
	@Override
	public void dealCards() {

		super.dealCards();
	}
}
