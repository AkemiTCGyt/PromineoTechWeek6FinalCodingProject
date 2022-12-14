package week6CodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckImproved {
	
	private String[] rank = new String[] {"Hearts", "Clubs", "Diamonds", "Spades"};
	private String[] cardValue = new String[]
			{"2", "3", "4", "5", "6", "7" , "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	
	public List<Card> fullDeck = new ArrayList<Card>();
	
	public DeckImproved() {
		for (Integer i = 2; i <= 14; i++) {
			for (int j = 0; j <= 3; j++) {
				fullDeck.add(new Card(i, cardValue[i - 2] + " of " + rank[j]));
			}
		}
	}
	
	public void shuffle() { //shuffles the cards in the deck
		Collections.shuffle(fullDeck);
	}
	
	public void deckCheck() { //prints out the cards in the deck. Can be use to check if the deck was instantiated and/or shuffled
		for (Card card : fullDeck) {             
			System.out.println(card.describe()); 
		}
	}
	
	public Card draw() { //draws the top card from the deck
		if (fullDeck.isEmpty()) { //check if a card is still in the deck else returns null
			return null;
		} else {
			Card drawnCard = fullDeck.get(0); //card object to hold the card that is drawn from the top
			fullDeck.remove(0);
			return drawnCard;
		}
	}
}
