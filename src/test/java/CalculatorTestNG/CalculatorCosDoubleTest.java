package CalculatorTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Volha_Batsiushkova on 12/13/2017.
 */
public class CalculatorCosDoubleTest extends BaseCalculatorTest
{
	@Test(dataProvider = "cosDP", dataProviderClass = DataProvidersSource.class, groups = "trigonometry")

	public void testCos(double arg1, double expected)
	{
		System.out.println("Calculate Cos "+ arg1);
		double actual = calculator.cos(arg1);
		Assert.assertEquals(actual, expected);
	}
}
