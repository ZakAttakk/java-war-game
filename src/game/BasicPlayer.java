package game;

import java.util.*;

public class BasicPlayer implements Player {
	
	private String name;
	private ArrayList<BasicCard> hand;
	private int score;
	
	public BasicPlayer(String name, ArrayList<BasicCard> hand, int score) {
		this.setName(name);
		this.setHand(hand);
		this.setScore(score);
	}

	@Override
	public String describe() {
		// TODO Auto-generated method stub
		String description = "Name: " + this.name + ", # of Cards: " + hand.size() + ", Score: " + this.score;
		return description;
	}

	@Override
	public void flip(Card card) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Deck deck) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incrementScore() {
		// TODO Auto-generated method stub
		
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
