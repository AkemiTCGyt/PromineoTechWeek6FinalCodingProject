package week6CodingProject;

public class Application {
	static Deck deckOfCards = new Deck();
	public static void main(String[] args) {
		Deck deckOfCards = new Deck();
		Player Player1 = new Player("Thomas");
		Player Player2 = new Player("Kaiba");
		
		deckOfCards.shuffle();
		
		for (int i = 1; i <= 26; i++) { //each player draws their hand from the deck
			Player1.draw(deckOfCards);
			Player2.draw(deckOfCards);
		}
		
		for (int i = 1; i <= 26; i++) { //each player flips a card from their hand
			Card P1Card = Player1.flip();
			Card P2Card	= Player2.flip();
			System.out.println("P1: " + P1Card.describe() + "\nP2: " + P2Card.describe()); //compares the flipped cards
			if (P1Card.getValue() > P2Card.getValue()) { //if P1's hand value > P2's hand value, P1 gets the point
				Player1.incrementScore();
			} else if (P2Card.getValue() > P1Card.getValue()) { //if P2's hand value > P1's hand value, P2 gets the point
				Player2.incrementScore();
			} else {
				System.out.println("DRAW NO POINTS"); //draw no points
			}
		}
		
		if (Player1.score > Player2.score) { //prints out the results depending on who has the higher score
			Player1.describe();
			Player2.describe();
			System.out.println(Player1.name + " wins!");
		} else if (Player2.score > Player1.score) {
			Player1.describe();
			Player2.describe();
			System.out.println(Player2.name + " wins!");
		} else {
			Player1.describe();
			Player2.describe();
			System.out.println("It's a draw!");
		}
	}
}

