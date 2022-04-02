package week6CodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand = new ArrayList<Card>();
	int score;   // score of the player
	String name; // name of the player
	
	public Player (String name) {
		this.name = name;
		this.score = 0;
	}

	public void describe() { //describes each card in the player's hand and the name of the player
		for (Card card : hand) {
			card.describe();
		}
		System.out.println(name + " has " + score + " points.");
	}
	
	public Card flip() {
		Card drawnTopCard = hand.get(0); 
		hand.remove(0);
		return drawnTopCard;
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		this.score++;
	}
	
}
