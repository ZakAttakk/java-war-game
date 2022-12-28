package game;

import java.util.Scanner;

public class App {
	
	static Scanner scanner = new Scanner(System.in);
	static boolean gameIsOn = false;

	public static void main(String[] args) {
		
		gameIsOn = true;
		System.out.println("Give player 1 a name.");
		String p1name = scanner.nextLine();
		BasicPlayer p1 = new BasicPlayer(p1name);
		System.out.println("Give player 2 a name.");
		String p2name = scanner.nextLine();
		BasicPlayer p2 = new BasicPlayer(p2name);
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		

	}
	
	
	
}
