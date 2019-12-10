


public class PokeTrainer extends Card {

	//var
	private String typeTrn;
	private String rules;
	
	public PokeTrainer(String name, String type, String tr, String rl ) {
		// TODO Auto-generated constructor stub
		super(name, type);
		this.typeTrn = tr;
		this.rules = rl;
		
	}
	
	public String getTypeTrn() {
		return typeTrn;
	}
	
	public String getRules() {
		return rules;
	}
	
}
