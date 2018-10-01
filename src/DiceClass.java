/**
 * 
 * @author Julia Hu
 * DiceClass
 *
 */
public class DiceClass 
{
	//Fields
	private int numRolls;
	
	//Constructors
	public DiceClass()
	{
		numRolls = 0;
	}
	
	//Methods
	public int rollDice()
	{
		return (int)(Math.random()*6)+1;
	}
	
}
