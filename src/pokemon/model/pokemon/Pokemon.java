package pokemon.model.pokemon;
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
	public int number()
	{
		return number;
	}

}
