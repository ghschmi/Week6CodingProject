package week6;

import java.util.*;

public class Player {
	 private List<Card> hand;  
	 private int score;        //player's score
	 private String name;

	  public Player(String name) {
	        this.name = name;
	        this.hand = new ArrayList<>();
	        this.score = 0;
	  }
	  //describe method for player
	  public void describe() {
	        System.out.println("Player: " + name);
	        System.out.println("Hand:");
	        for (Card card : hand) {
	            card.describe();
	        }
	  }
	  
	  //flip method
	  public Card flip() {
		  return hand.remove(0);
	  }
	  
	  //draw method
	  public void draw(Deck deck) {
		  Card card = deck.draw();
		  hand.add(card);
	  }
	  
	  //increment score method 
	  public void incrementScore() {
		  score++;
	  }
	  
	  //score getter
	  public int getScore() {
	        return score;
	    }

	    // Getter for player's name
	    public String getName() {
	        return name;
	    }
}

