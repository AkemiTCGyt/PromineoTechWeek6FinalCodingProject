package week6CodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private String ofHearts = " of Hearts";
	private String ofDiamonds = " of Diamonds";
	private String ofClubs = " of Clubs";
	private String ofSpades = " of Spades";
	private String J = "Jack";
	private String Q = "Queen";
	private String K = "King";
	private String A = "Ace";
	
	public List<Card> fullDeck = new ArrayList<Card>();
	
	public Deck() { //when the deck is instantiated, populate the list of Card with the standard 52 cards
		for (Integer i = 2; i <= 14; i++) { //iterates through values 1 through 14
			for (int j = 0; j <= 3; j++) { //iterates through the different suits
				if (i <= 10 && j == 0) {
					fullDeck.add(new Card(i, i.toString() + ofHearts));
				} else if (i <= 10 && j == 1) {
					fullDeck.add(new Card(i, i.toString() + ofDiamonds));
				} else if (i <= 10 && j == 2) {
					fullDeck.add(new Card(i, i.toString() + ofClubs));
				} else if (i <= 10 && j == 3) {
					fullDeck.add(new Card(i, i.toString() + ofSpades));
				} else if (i == 11 && j == 0) {
					fullDeck.add(new Card(i, J + ofHearts));
				} else if (i == 11 && j == 1) {
					fullDeck.add(new Card(i, J + ofDiamonds));
				} else if (i == 11 && j == 2) {
					fullDeck.add(new Card(i, J + ofClubs));
				} else if (i == 11 && j == 3) {
					fullDeck.add(new Card(i, J + ofSpades));
				} else if (i == 12 && j == 0) {
					fullDeck.add(new Card(i, Q + ofHearts));
				} else if (i == 12 && j == 1) {
					fullDeck.add(new Card(i, Q + ofDiamonds));
				} else if (i == 12 && j == 2) {
					fullDeck.add(new Card(i, Q + ofClubs));
				} else if (i == 12 && j == 3) {
					fullDeck.add(new Card(i, Q + ofSpades));
				} else if (i == 13 && j == 0) {
					fullDeck.add(new Card(i, K + ofHearts));
				} else if (i == 13 && j == 1) {
					fullDeck.add(new Card(i, K + ofDiamonds));
				} else if (i == 13 && j == 2) {
					fullDeck.add(new Card(i, K + ofClubs));
				} else if (i == 13 && j == 3) {
					fullDeck.add(new Card(i, K + ofSpades));
				} else if (i == 14 && j == 0) {
					fullDeck.add(new Card(i, A + ofHearts));
				} else if (i == 14 && j == 1) {
					fullDeck.add(new Card(i, A + ofDiamonds));
				} else if (i == 14 && j == 2) {
					fullDeck.add(new Card(i, A + ofClubs));
				} else if (i == 14 && j == 3) {
					fullDeck.add(new Card(i, A + ofSpades));
				}
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
