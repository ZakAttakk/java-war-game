package game;

import java.util.List;

public class BasicPlayer implements Player {
	
	private String name;
	private List<Card> hand;
	private int score;
	
	public BasicPlayer(String name) {
		this.setName(name);
	}

	@Override
	public String describe() {
		// TODO Auto-generated method stub
		return null;
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

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
