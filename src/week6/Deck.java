package week6;

import java.util.*;

public class Deck {
	private List<Card> cards;
	
	//initializing the ArrayList
	public Deck() {
		this.cards = new ArrayList<>();
		populateDeck();
	}
	
	private void populateDeck() {
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] values = {"two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			for (int i = 0; i< values.length; i++) {
				String cardName = values[i] + " of " + suit;
				cards.add(new Card(i + 2, cardName));
			}
		}
	}
	
	// method to shuffle the deck
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	//method to draw card
	public Card draw() {
		return cards.remove(0);
	}
	
	//getter for the List of card
	public List<Card> getCards() {
		return cards;
	}

}
