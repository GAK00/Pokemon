package pokemon.model.pokemon;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;

public abstract class Pokemon
{
	private int hitPoints;
	private int attackPoints;
	private double speed;
	private String name;
	private int number;

	public Pokemon(int hitPoints, int attackPoints, double speed, String name, int number)
	{
		this.hitPoints = hitPoints;
		this.attackPoints = attackPoints;
		this.speed = speed;
		this.name = name;
		this.number = number;
	}

	public int getHitPoints()
	{
		return hitPoints;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAttackPoints()
	{
		return attackPoints;
	}

	public double getSpeed()
	{
		return speed;
	}

	public String getName()
	{
		return name;
	}

	public int getNumber()
	{
		return number;
	}

	public String getSpecies()
	{
		return this.getClass().getName().substring(this.getClass().getName().indexOf("model.pokemon.")).substring(14);
	}

	public String getPictureAdress()
	{
		return "images/" + getSpecies() + ".png";
	}

	public String getTypes()
	{
		String typesName = "";
		Class<?>[] types = this.getClass().getInterfaces();
		for (int pos = 0; pos < types.length; pos++)
		{
			typesName += types[pos].getName().substring((types[pos].getName().indexOf("types.") + 6)) + "\n";
		}
		return typesName;
	}

	public static Pokemon getPokemon(String name)
	{
		Pokemon pokemon = null;
		URL url = Pokemon.class.getResource(name + ".class");
		
		if (url != null)
		{
			try
			{
				Class<?> pokeClass = Class.forName("pokemon.model.pokemon." + name);
				System.out.println(pokeClass.getName());
				Constructor<?> pokeConstruct = pokeClass.getConstructor();
				pokemon = (Pokemon) pokeConstruct.newInstance();

			} catch (NoSuchMethodException e)
			{
				e.printStackTrace();
			} catch (SecurityException e)
			{
				e.printStackTrace();
			} catch (InstantiationException e)
			{
				e.printStackTrace();
			} catch (IllegalAccessException e)
			{
				e.printStackTrace();
			} catch (IllegalArgumentException e)
			{
				e.printStackTrace();
			} catch (InvocationTargetException e)
			{
				e.printStackTrace();
			} catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
		}

		return pokemon;
	}

}
