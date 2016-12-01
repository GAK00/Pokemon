package pokemon.model.pokemon;
import pokemon.model.types.*;
public class Pidgey extends Pokemon implements Flying
{
	public Pidgey()
	{
		super(5, 6, 6.7, "Pidgey", 3);
	}

	@Override
	public int Flap()
	{
		
		return super.getAttackPoints()-1;
	}

	@Override
	public int Glide()
	{
		// TODO Auto-generated method stub
		return super.getAttackPoints()+1;
	}
}
