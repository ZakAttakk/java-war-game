package game;

public interface Player {
	public String describe();
	public BasicCard flip();
	public void draw(BasicDeck deck);
	public void incrementScore();
}
