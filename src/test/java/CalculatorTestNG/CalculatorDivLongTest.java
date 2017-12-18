package CalculatorTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */

public class CalculatorDivLongTest extends BaseCalculatorTest
{
   	@Test(expectedExceptions = NumberFormatException.class, groups = "Non-trigonometry")
	public void testDevisionOnZero()
	{
		double actual = calculator.div(1, 0);
		System.out.println("Division by zero");
	}

	@Test(dataProvider = "divDPLong", dataProviderClass = DataProvidersSource.class, groups = "Non-trigonometry", dependsOnGroups ="trigonometry" )
	public void testDivLong(long arg1, long arg2, long expected)
	{
		System.out.println("Division by non-zero");
		long actual = calculator.div(arg1, arg2);
		Assert.assertEquals(actual, expected);
    }
}
