package game;

public interface Player {
	public String describe();
	public void flip(Card card);
	public void draw(Deck deck);
	public void incrementScore();
}
