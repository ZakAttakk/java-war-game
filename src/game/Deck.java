package game;

import java.util.*;

public interface Deck {
	public void shuffle();
	public BasicCard draw();
	public ArrayList<BasicCard> getDeck();
}
	