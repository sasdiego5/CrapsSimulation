// this crooked die always returns 3
public class CrookedDie1 extends Die
{
	public CrookedDie1()
	{
		CrapsGame.println("  CrookedDie1's constructor called.");		
	}

	public int getLastRoll() // OVERRIDES Die's getLastRoll(), replacing it						
	{
		return 3;
	}

	public String toString() // this OVERRIDES Die's toString()
	{
		return "CrookedDie1"; // + super.toString();
	}

}
