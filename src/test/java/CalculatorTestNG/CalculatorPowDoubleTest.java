package CalculatorTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */
public class CalculatorPowDoubleTest extends BaseCalculatorTest
{

	@Test(dataProvider = "powDP", dataProviderClass = DataProvidersSource.class)
	public void testPowDouble(String arg1, String arg2, String expected)
	{
		double actual = calculator.pow(Double.valueOf(arg1),Double.valueOf(arg2));
		Assert.assertEquals(actual, Double.valueOf(expected));
	}



}
