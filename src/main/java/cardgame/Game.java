package cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Game {
	
	public ArrayList<Deck>decks;
	public ArrayList<Player> players;
	
	public Game(int numDecks){
		
		this.decks = new ArrayList<Deck>();
	}
	
	public void dealCards() {}
	
	public Card rankCards(Card card1, Card card2) {
		
		return card1;
	}
	
	public void sortCardsByRank(ArrayList<Card> cards) { // bubble sort
		
		Collections.sort(cards, new CompareCardsByRank());
		
	}
	
	public void sortCardsBySuit(ArrayList<Card> cards) { // bubble sort
		
		Collections.sort(cards, new CompareCardsBySuit());
		
	}
	
	public void createDeck() {
		
		Deck deck = new Deck();

		for(int i = Suit.CLUBS.getValue(); i <= Suit.SPADES.getValue(); i++) {
			
			for(int j = Rank.ACE.getValue(); j <= Rank.KING.getValue();  j++) {
				
				Card card = new Card(Suit.getSuit(i), Rank.getRank(j));
				
				deck.addCard(card);
				
			}
		}
		
		this.decks.add(deck);
	}
	
	private class CompareCardsByRank implements Comparator<Card> {
	    public int compare(Card card1, Card card2) {
	    	
	    	int retVal = card1.getRank().getValue() > card2.getRank().getValue()? 1: 0;
	        return retVal;
	    }

	}
	
	private class CompareCardsBySuit implements Comparator<Card> {
	    public int compare(Card card1, Card card2) {
	    	
	    	int retVal = card1.getSuit().getValue() > card2.getSuit().getValue()? 1: 0;
	        return retVal;
	    }
	}
}
