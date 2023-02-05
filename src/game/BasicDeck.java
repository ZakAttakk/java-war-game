package game;


import java.util.*;



public class BasicDeck implements Deck {
	
	private List<BasicCard> deck = new ArrayList<BasicCard>();

	public BasicDeck() {
		for (int i = 0; i < 13; i++) {
			int value = i + 2;
			String name = Integer.toString(value);
			if (value == 11) {
				name = "Jack";
			} else if (value == 12) {
				name = "Queen";
			} else if (value == 13) {
				name = "King";
			} else if (value == 14) {
				name = "Ace";
			}
			BasicCard c = new BasicCard(value, name, "Clubs");
			this.deck.add(c);
		}
		for (int i = 0; i < 13; i++) {
			int value = i + 2;
			String name = Integer.toString(value);
			if (value == 11) {
				name = "Jack";
			} else if (value == 12) {
				name = "Queen";
			} else if (value == 13) {
				name = "King";
			} else if (value == 14) {
				name = "Ace";
			}
			BasicCard c = new BasicCard(value, name, "Diamonds");
			this.deck.add(c);
		}
		for (int i = 0; i < 13; i++) {
			int value = i + 2;
			String name = Integer.toString(value);
			if (value == 11) {
				name = "Jack";
			} else if (value == 12) {
				name = "Queen";
			} else if (value == 13) {
				name = "King";
			} else if (value == 14) {
				name = "Ace";
			}
			BasicCard c = new BasicCard(value, name, "Hearts");
			this.deck.add(c);
		}
		for (int i = 0; i < 13; i++) {
			int value = i + 2;
			String name = Integer.toString(value);
			if (value == 11) {
				name = "Jack";
			} else if (value == 12) {
				name = "Queen";
			} else if (value == 13) {
				name = "King";
			} else if (value == 14) {
				name = "Ace";
			}
			BasicCard c = new BasicCard(value, name, "Spades");
			this.deck.add(c);
		}
		this.shuffle();
			
	}
//		System.out.println(this.deck);


	@Override
	public void shuffle() {
		// TODO Auto-generated method stub
		Collections.shuffle(deck);
//		for (BasicCard card : this.deck) {
//			card.describe();
//		}
			
	}

	@Override
	public ArrayList<BasicCard> createP1Hand() {
		ArrayList<BasicCard> p1hand = new ArrayList<BasicCard>(deck.subList(0,26));
//		for(BasicCard card : p1hand) {
//			System.out.println(card.describe());
//		}
		return p1hand;
	}
	
	public ArrayList<BasicCard> createP2Hand() {
		ArrayList<BasicCard> p2hand = new ArrayList<BasicCard>(deck.subList(26,52));
//		for(BasicCard card : p2hand) {
//			System.out.println(card.describe());
//		}
		return p2hand;
	}

}
