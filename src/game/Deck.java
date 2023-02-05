package game;

import java.util.*;

public interface Deck {
	public void shuffle();
//	public ArrayList<BasicCard> createP1Hand();
//	public ArrayList<BasicCard> createP2Hand();
	public BasicCard draw();
	public ArrayList<BasicCard> getDeck();
}
	