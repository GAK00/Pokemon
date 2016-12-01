package pokemon.view;

import java.awt.*;

import javax.swing.*;

import pokemon.controller.PokemonController;
import pokemon.model.pokemon.Pokemon;

public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox pokedexSelector;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JLabel pokemonLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;

	public PokemonPanel(PokemonController baseController, Pokemon[] Pokemon)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.updateButton = new JButton();
		baseLayout.putConstraint(SpringLayout.SOUTH, updateButton, -24, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, -31, SpringLayout.EAST, this);
		this.pokedexSelector = new JComboBox(new String[] { "Egg", "PikaChu", "Pokemon" });
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 45, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 50, SpringLayout.WEST, this);
		this.healthLabel = new JLabel("Health:");
		this.combatLabel = new JLabel("Attack:");
		baseLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, combatLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, healthLabel, -34, SpringLayout.NORTH, combatLabel);
		this.speedLabel = new JLabel("Speed:");
		baseLayout.putConstraint(SpringLayout.EAST, speedLabel, -370, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, combatLabel, 0, SpringLayout.WEST, speedLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, combatLabel, -34, SpringLayout.NORTH, speedLabel);
		this.nameLabel = new JLabel("Name:");
		baseLayout.putConstraint(SpringLayout.NORTH, nameLabel, 85, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, nameLabel, 0, SpringLayout.EAST, healthLabel);
		this.numberLabel = new JLabel("Number:");
		baseLayout.putConstraint(SpringLayout.SOUTH, numberLabel, -34, SpringLayout.NORTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.EAST, numberLabel, 0, SpringLayout.EAST, healthLabel);
		this.advancedLabel = new JLabel("Types:");
		baseLayout.putConstraint(SpringLayout.SOUTH, speedLabel, -37, SpringLayout.NORTH, advancedLabel);
		this.pokemonLabel = new JLabel("picture");
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonLabel, 0, SpringLayout.NORTH, speedLabel);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 170, SpringLayout.WEST, this);
		this.healthField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, -6, SpringLayout.NORTH, healthLabel);
		this.combatField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, -6, SpringLayout.NORTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.EAST, combatField, 0, SpringLayout.EAST, healthField);
		this.speedField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, -6, SpringLayout.NORTH, speedLabel);
		baseLayout.putConstraint(SpringLayout.EAST, speedField, 0, SpringLayout.EAST, healthField);
		this.nameField = new JTextField(25);
		baseLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, nameField);
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, -6, SpringLayout.NORTH, nameLabel);
		baseLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, updateButton);
		this.numberField = new JTextField(5);
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, -6, SpringLayout.NORTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, healthField);
		this.advancedArea = new JTextArea(10, 25);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedLabel, 0, SpringLayout.NORTH, advancedArea);
		baseLayout.putConstraint(SpringLayout.EAST, advancedLabel, -39, SpringLayout.WEST, advancedArea);
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedArea, -49, SpringLayout.NORTH, updateButton);
		baseLayout.putConstraint(SpringLayout.EAST, advancedArea, 0, SpringLayout.EAST, updateButton);
		setupPanel();
		setupLayout();
		setupListeners();

	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.add(updateButton);
		this.add(pokedexSelector);
		this.add(healthLabel);
		this.add(combatLabel);
		this.add(speedLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(advancedLabel);
		this.add(pokemonLabel);
		this.add(healthField);
		this.add(combatField);
		this.add(speedField);
		this.add(nameField);
		this.add(numberField);
		this.add(advancedArea);
	}

	private void setupLayout()
	{

	}

	private void setupListeners()
	{
	}
}
