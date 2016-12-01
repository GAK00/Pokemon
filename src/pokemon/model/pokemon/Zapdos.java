package pokemon.model.pokemon;
import pokemon.model.types.*;
public class Zapdos extends Pokemon implements Electric, Flying 
{

	public Zapdos()
	{
		super(30, 1, 1, "Zapdos", 5);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int Flap()
	{
		// TODO Auto-generated method stub
		return super.getAttackPoints();
	}

	@Override
	public int Glide()
	{
		// TODO Auto-generated method stub
		return super.getAttackPoints();
	}

	@Override
	public int Shock()
	{
		// TODO Auto-generated method stub
		return super.getAttackPoints();
	}

	@Override
	public int Zap()
	{
		// TODO Auto-generated method stub
		return super.getAttackPoints();
	}

}
