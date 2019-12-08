
public class Players {
	
	// var name : string
	private String name;
	private Deck deck;
	
	
	//Constructeur :
	public Players(String name) {
		this.name = name;
	}
	
	//Getteur name;
	public String getName() {
		return name;
	}
	
	//String
	public String toString() {
		return name;
	}
	
	// Getteur Deck
	public Deck getDeck() {
		return deck;
	}
}
