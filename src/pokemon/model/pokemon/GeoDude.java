package pokemon.model.pokemon;
import pokemon.model.types.*;
public class GeoDude extends Pokemon implements Rock
{
	public GeoDude()
	{
		super(10, 5, 1.2, "GeoDude", 2);
	}

	@Override
	public int Smash()
	{
		return super.getAttackPoints()+2;
	}

	@Override
	public int Drip()
	{
		// TODO Auto-generated method stub
		return super.getAttackPoints()+1;
	}

}
