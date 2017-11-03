package firstVC;

import java.util.Random;

public class Developer {

	public boolean isFullStack()
	
	{
		return new Random() .nextBoolean();
	}
	
	
	public boolean isSenior()
	{
		return true;
	}
	
	public boolean isJunior()
	{
		return !isSenior();
	}
	
	public boolean havWornIn()
	{
		return new Random() .nextBoolean();

	}
}
