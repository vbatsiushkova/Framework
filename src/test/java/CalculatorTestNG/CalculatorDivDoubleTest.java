package CalculatorTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */

public class CalculatorDivDoubleTest extends BaseCalculatorTest
{
    @Test(expectedExceptions = NumberFormatException.class)
	public void testdevisionOnZero()
	{
		System.out.println("Division by zero");
		double actual = calculator.div( 1, 0);
	}

	@Test(dataProvider = "divDPDouble", dataProviderClass = DataProvidersSource.class, groups = "Non-trigonometry", dependsOnGroups = "trigonometry")
	public void testDivDouble(double arg1, double arg2, double expected)
	{
		System.out.println("Division by non-zero");
		double actual = calculator.div(arg1, arg2);
		Assert.assertEquals(actual, expected);
	}

}
