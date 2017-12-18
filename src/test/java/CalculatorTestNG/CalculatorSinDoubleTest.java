package CalculatorTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Volha_Batsiushkova on 12/13/2017.
 */
public class CalculatorSinDoubleTest extends BaseCalculatorTest
{

    @Test(dataProvider = "sinDP", dataProviderClass = DataProvidersSource.class, groups = "trigonometry")
	public void sin0(double arg1, double expected)
	{
		System.out.println("sin " + arg1);
		double result = calculator.sin(arg1);
		Assert.assertEquals(result, expected);
	}
}


