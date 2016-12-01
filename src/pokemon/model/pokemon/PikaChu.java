package pokemon.model.pokemon;
import pokemon.model.types.*;
public class PikaChu extends Pokemon implements Electric
{

	public PikaChu()
	{
		super(3, 22, 10.9, "PikaChu", 4);
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
		return super.getAttackPoints()*2;
	}

}
