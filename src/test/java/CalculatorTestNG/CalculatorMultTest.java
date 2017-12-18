package CalculatorTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */
public class CalculatorMultTest extends BaseCalculatorTest
{
   	@Test(dataProvider = "multDoubleDP", dataProviderClass = DataProvidersSource.class)
	public void testMultDouble(String arg1,String arg2, String expected)
	{
		double actual = calculator.mult(Double.valueOf(arg1), Double.valueOf(arg2));
		Assert.assertEquals(actual, Double.valueOf(expected));
		timeout.sleep(5);
		checkTime();
	}

	@Test(dataProvider = "multLongDP", dataProviderClass = DataProvidersSource.class)
	public void testMultLong(String arg1,String arg2, String expected)
	{
		long actual = calculator.mult(Long.valueOf(arg1), Long.valueOf(arg2));
		Assert.assertEquals(Long.valueOf(actual),Long.valueOf(expected));
		timeout.sleep(5);
		checkTime();
	}

}
