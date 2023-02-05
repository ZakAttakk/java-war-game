package game;

import java.util.*;

public class BasicPlayer implements Player {
	
	private String name;
	private ArrayList<BasicCard> hand = new ArrayList<BasicCard>();
	private int score;
	
	public BasicPlayer(String name, int score) {
		this.setName(name);
		this.setScore(score);
	}

	@Override
	public String describe() {

		String description = "Name: " + this.name + ", # of Cards: " + hand.size() + ", Score: " + this.score;
		return description;
	}

	@Override
	public BasicCard flip() {
		BasicCard card = this.hand.remove(hand.size()-1);
		return card;
		
	}

	@Override
	public void draw(BasicDeck deck) {
		BasicCard card = deck.draw();
		this.hand.add(card);
	}

	@Override
	public void incrementScore() {
		this.score++;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<BasicCard> getHand() {
		return hand;
	}

	public void setHand(ArrayList<BasicCard> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
