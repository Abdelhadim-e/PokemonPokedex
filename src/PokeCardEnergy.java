
public class PokeCardEnergy extends Card {
	
	//var 
	//Tab Listes
	public String Elements[] = {"water","grass","fire","lighting","psychic","fighting","darkness","metal", "fairy","dragon","colorless","null"};
	private String element;
	
	public PokeCardEnergy(String name, String type, String elms) {
		// Contructeur mère
		super(name, type);
		this.element = elms;
	}
	
	// Getteur element
	public String getElement() {
		return element;
	}
}
