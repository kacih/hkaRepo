package firstVC;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

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
	
	private long calculateDifferenceBetweenTwoDates(Date dateFrom, Date datTo)
	{
		
			Calendar calFrom = Calendar.getInstance();
			calFrom.setTime(dateFrom);
			Calendar calTo = Calendar.getInstance();
			calTo.setTime(datTo);
			return calTo.compareTo(calFrom);		
	}
	
	@Test
	public void testDifferenceEntreDeuxDate() throws ParseException
	{
		SimpleDateFormat spdf = new SimpleDateFormat("dd/MM/yyyy");
		Date datTo = spdf.parse("31/08/1978");
		Date dateFrom = spdf.parse("11/06/1976");
		
		Assert.assertFalse("résultat de calcul "+ calculateDifferenceBetweenTwoDates(dateFrom, datTo),
				calculateDifferenceBetweenTwoDates(dateFrom, datTo) > 0);
	}
	
	
}
