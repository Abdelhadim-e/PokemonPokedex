
public class Pokemon extends Card{
	
	//var 
	private int lifePoints;
	private String firstElement;
	private String secondElement;
	private int stage;
	
	
	//Class mère Card
	public Pokemon(String name, String type, int lifepoints, String firstE, String secondE, int placeStage) {
		//Recup valeur du constructeur mère
		super(name, type);
		//param Pokemon
		lifePoints = lifepoints;
		firstElement = firstE;
		secondElement = secondE;
		stage = placeStage;
	}
	
	//Tab Listes
	public String Elements[] = {"grass","fire","water","lighting","psychic","fighting","darkness","metal", "fairy","dragon","colorless","null"};
	
	

}
