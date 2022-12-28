package game;

public class BasicCard implements Card {
	
	private int value;
	private String name;
	private String suite;
	
	public BasicCard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String describe() {
		// TODO Auto-generated method stub
		return null;
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
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

}
