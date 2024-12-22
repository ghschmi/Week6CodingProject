package week6;

public class App {
    public static void main(String[] args) {
    	
        //create and shuffle deck
        Deck deck = new Deck();
        deck.shuffle();

        //create two players
        Player player1 = new Player("Lemmy Kilmister");
        Player player2 = new Player("Phil Taylor");

        //distribute 26 cards to each player
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);  //player 1 draws
            } else {
                player2.draw(deck);  //player 2 draws
            }
        }
        
        for (int round = 0; round < 26; round++) {
        	//flip cards for 26 rounds
        	  Card card1 = player1.flip();  
              Card card2 = player2.flip();
              
              //describe the flipped cards
              System.out.println("\nRound " + (round + 1) + ":");
              System.out.println(player1.getName() + " flips:");
              card1.describe();
              System.out.println(player2.getName() + " flips:");
              card2.describe();
              
              //compares cards and increments score
              if (card1.getValue() > card2.getValue()) {
                  player1.incrementScore();
                  System.out.println("\n" + player1.getName() + " gets a point.");
              } else if (card2.getValue() > card1.getValue()) {
                  player2.incrementScore();
                  System.out.println("\n" + player2.getName() + " gets a point.");
              } else {
                  System.out.println("No point awarded.");
              }
              
              //prints scores after every round
              System.out.println("\nScores after round " + (round + 1) + ":");
              System.out.println(player1.getName() + ": " + player1.getScore());
              System.out.println(player2.getName() + ": " + player2.getScore());
          }
        
        //displays final score 
        System.out.println("\nFinal Scores:");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

        //determines the winner
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("Draw!");
        }

      }  
  }
        
	
	
	

