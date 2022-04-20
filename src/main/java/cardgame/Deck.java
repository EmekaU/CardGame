package cardgame;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private ArrayList<Card> cards;
	
	public Deck(){
		
		this.cards = new ArrayList<Card>();
		
	}
	
	public void addCard(Card card) {
		this.cards.add(card);
	}
	
	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	
	public void shuffle() {
		
		for(int i=0; i < this.cards.size(); i++) {
			Collections.shuffle(this.cards);
		}
	}
}
