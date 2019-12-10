import java.awt.*;
import javax.swing.*;




public class Pokewindow extends JFrame {


	//var 
	//Composant text
	//JTextField nameT;
	//JTextField typeT;
	
	public Pokewindow(){

	
	//Panel - grille 
	JPanel pokepanel = new JPanel (new GridBagLayout());
	pokepanel.setBorder(BorderFactory.createLineBorder(Color.black));
	
	//Par defaut /n composant
	pokepanel.setLayout(new FlowLayout());
	
	//JLabel Title
	JLabel title = new JLabel("Pokemon-Pokedex");
	//JLabel f.elem
	JLabel firstElement = new JLabel("First Element");
	//JLabel s.elem
	JLabel secondElement = new JLabel("Second Element");
	//JLabel name
	JLabel name = new JLabel("name");
	//JLabel Type
	JLabel type = new JLabel("Type");
	//JLabel Energy
	JLabel energy = new JLabel("Energy");
	
	//JTextField
	JTextField nameT = new JTextField();
	JTextField typeT = new JTextField();
	JTextField energyT = new JTextField();
	//typeselect
	JComboBox<String> typeSelect = new JComboBox<String>();
	//Ajout
	typeSelect.addItem("Poké");
	//test mn selects
	JTextField firstElementMnSelect = new JTextField();
	//[] energy
	//firstElementMnSelect.addItem("water");
	//firstElementMnSelect.addItem("grass");
	//firstElementMnSelect.addItem("fire");
	JTextField secondElementMnSelect = new JTextField();
	//secondElementMnSelect.addItem("lighting");
	//secondElementMnSelect.addItem("psychic");
	//secondElementMnSelect.addItem("fighting");
	JButton cliqPokem = new JButton("cliqPokem");
	
	
	//JFrame
	JFrame pokewindow = new JFrame("Pokemon-Pokedex");
	//Name fenetre
	pokewindow.setTitle("Pokemon-Pokedex");
	// taille fenetre
	pokewindow.setSize(650, 850);
	//Centrer
	pokewindow.setLocationRelativeTo(null);
	pokewindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	pokewindow.setVisible(true);
		
	
	
	
	
	
	

	}
}
