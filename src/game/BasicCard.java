package game;

public class BasicCard implements Card {
	
	private int value;
	private String name;
	private String suit;
	
	public BasicCard(int value, String name, String suit) {
		// TODO Auto-generated constructor stub
		this.value = value;
		this.name = name;
		this.suit = suit;
		
	}

	@Override
	public String describe() {
		String description = this.name + " of " + this.suit + " (" + this.value + ")";
		return description;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuite() {
		return suit;
	}

	public void setSuite(String suite) {
		this.suit = suite;
	}

}
