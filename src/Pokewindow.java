import javax.swing.JFrame;



public class Pokewindow {
	
	public Pokewindow(){
		
	JFrame pokeWindow = new JFrame("Pokemon-Pokedex");
	//Name fenetre / taille fenetre
	pokeWindow.setTitle("Test");
	pokeWindow.setSize(850, 850);
	pokeWindow.setLocationRelativeTo(null);
	pokeWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pokeWindow.setVisible(true);

	}
}
