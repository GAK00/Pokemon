package pokemon.controller;

import java.util.ArrayList;
import pokemon.model.pokemon.*;

public class PokemonController
{
	private ArrayList<Pokemon> pokeDex;
	public PokemonController()
	{
		pokeDex = new ArrayList<Pokemon>();
	}
	public void start()
	{
		buildPokeDex();
		
	}
	private void buildPokeDex()
	{
		pokeDex.add(Pokemon.getPokemon("PikaChu"));
		pokeDex.add(Pokemon.getPokemon("GeoDude"));
		pokeDex.add(Pokemon.getPokemon("Pidgey"));
		pokeDex.add(Pokemon.getPokemon("Boldore"));
		pokeDex.add(Pokemon.getPokemon("Zapdos"));
	}
}
