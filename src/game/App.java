package game;

import java.util.*;

public class App {
	
	static Scanner scanner = new Scanner(System.in);
	static boolean gameIsOn = false;

	public static void main(String[] args) {
		
		
		BasicDeck deck = new BasicDeck();
		ArrayList<BasicCard> p1hand = deck.createP1Hand();
		ArrayList<BasicCard> p2hand = deck.createP2Hand();
		
		gameIsOn = true;
		System.out.println("Give player 1 a name.");
		String p1name = scanner.nextLine();
		System.out.println("Give player 2 a name.");
		String p2name = scanner.nextLine();
		BasicPlayer p1 = new BasicPlayer(p1name, p1hand, 0);
		BasicPlayer p2 = new BasicPlayer(p2name, p2hand, 0);
		
		System.out.println(p1.describe()); 
		System.out.println(p2.describe()); 

	}
	
	
	
}
