package pokemon.view;

import java.awt.*;
import javax.swing.*;

public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private SringLayout baseLayout;
	private JButton updateButton;
	private JComboBox pokedexSelector;
	private Jlabel 
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
	}
}
