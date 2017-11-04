package firstVC;

import java.util.Date;
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
	
	public boolean havWorkIn()
	{
		return new Random() .nextBoolean();

	}
	
	public Date getDateOfBirth()
	{
		//uncomment after implementation
		throw new RuntimeException("Not Yet Implemented");
	}
	
}
