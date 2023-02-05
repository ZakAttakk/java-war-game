package game;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class App {
	
	static Scanner scanner = new Scanner(System.in);
	static boolean gameIsOn = false;

	public static void main(String[] args) {
		
		
		BasicDeck deck = new BasicDeck();
//		ArrayList<BasicCard> p1hand = deck.createP1Hand();
//		ArrayList<BasicCard> p2hand = deck.createP2Hand();
		
//		deck.draw();
		
		gameIsOn = true;
		System.out.println("Give player 1 a name.");
		String p1name = scanner.nextLine();
		System.out.println("Give player 2 a name.");
		String p2name = scanner.nextLine();
		BasicPlayer p1 = new BasicPlayer(p1name, 0);
		BasicPlayer p2 = new BasicPlayer(p2name, 0);
		

		
		for (int i = 0; i < 26; i++) {
			p1.draw(deck);
			p2.draw(deck);
		}
		System.out.println(p1.describe());
		System.out.println(p2.describe());
		
		for (int i = 0; i < 26; i++) {
			BasicCard card1 = p1.flip();
	
			System.out.println("PLAYER 1 CARD: " + card1.describe());
			BasicCard card2 = p2.flip();
			System.out.println("PLAYER 2 CARD: " + card2.describe());

			
			if (card1.getValue() > card2.getValue()) {
				System.out.println("Player 1 wins the hand.");
				p1.incrementScore();
			} else if (card1.getValue() < card2.getValue()) {
				System.out.println("Player 2 wins the hand.");
				p2.incrementScore();
			} else {
				System.out.println("Hand is a DRAW.");
			}
			System.out.println("------------");
			System.out.println(p1.describe());
			System.out.println(p2.describe());
			System.out.println("------------");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (p1.getScore() > p2.getScore()) {
			System.out.println("PLAYER 1 WINS!");
		} else if (p1.getScore() < p2.getScore()) {
			System.out.println("PLAYER 2 WINS!");
		} else {
			System.out.println("THE GAME IS A DRAW!");
		}
		


	}
	
	
	
}
