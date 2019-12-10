
public abstract class Card {
	
	
	// name & type : string
	private String name;
	private String type;
	//tab 2val
	public static String Types[] = {"pokemon", "energy","trainer"};
	
	
	// Constructeur : 2 string
	public Card(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	
	//Getteur name
	public String getName() {
		return name;
	}
	
	
	// Getteur type
	public String getType() {
		return type;
	}
	
}
