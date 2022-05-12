# PromineoTechWeek6FinalCodingProject

# Coded by Thomas Le

## Synopsis:
In this project, I used object oriented programming to recreate the popular card game, WAR. The classes and their methods are broken down below.

## Application.java
Instantiates the deck and the players. Then runs the shuffle method to randomize the card objects in the deck. The first loop allocates half of the
deck to each player. Then the second loop flips the top card of each player's decks and compares the values of the cards. Whichever players card has
the higher value has their score incremented by 1. In the instance of a draw, no points are allocated. The final set of conditionals will print the
results based on which player has the higher score in the end.

## Card.java
The entity class to define what a card object is. The constructor has a value and a name along with its getters and setters. The describe method can
be used to define any object of card that is called upon.

## Deck.java
This class when instantiated will create a list of cards called fullDeck and will have each card object in a traditional deck with their respective values
and names. The shuffle method shuffles the objects in the deck. The deckCheck method is used for testing purposes to verify the current cards in the deck.
The draw function will return the top card of the deck provided there are remaining card objects in the deck.

## Player.java
This class defines what a player is in terms of the game. The constructor takes in a name which is the name of the player and will also automatically default
their score to 0. The describe method shows each card in the player's hand and the name of the player. The flip method grabs the first card on the top of the deck.
The draw method adds the cards into the deck. The increment score method grants +1 to the corresponding player's score.


