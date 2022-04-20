package cardgame;

import java.util.ArrayList;

public class Player {
	
	private String name;
	private ArrayList<Card> hand;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Card> getHand() {
		return hand;
	}
	
	public void setHand(Card card) {
		this.hand.add(card);
	}
	
	public void removeCard(Card card) {
		this.hand.remove(card);
	}
	
}
