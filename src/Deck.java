import java.util.ArrayList;
// cf: https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html


public class Deck {
	
	// ArrayList card
	private ArrayList<Card> carr = new ArrayList<Card>();
	
	
	// Addcard
	public void AddCard(Card card) {
		carr.add(card);
	}
	
	//Getteur
	public ArrayList<Card> getCarr(){
		return carr;
	}
	
}
