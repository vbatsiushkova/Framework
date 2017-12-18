package CalculatorTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */
public class CalculatorSqrtDoubleTest extends BaseCalculatorTest
{
	@Test(expectedExceptions = NumberFormatException.class)
	public void testSqrtNegativeNumber(){
		double actual=calculator.sqrt(-16);
	}

	@Test(dataProvider = "sqrtDP", dataProviderClass = DataProvidersSource.class)
	public void testSqrtDouble(double arg1, double expected)
	{
		double actual = calculator.sqrt(arg1);
		Assert.assertEquals(actual,expected);
	}
}
