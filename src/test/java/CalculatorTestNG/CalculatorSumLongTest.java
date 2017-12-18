package CalculatorTestNG;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */

public class CalculatorSumLongTest extends BaseCalculatorTest
{

	@Test(dependsOnGroups = "trigonometry", groups = "Non-trigonometry")
	@Parameters({"arg1","arg2","expected"})
	public void testSumLong(@Optional(value = "10") long arg1, @Optional(value = "-15") long arg2, @Optional(value = "-5")long expected)
	{
		long actual = calculator.sum(arg1, arg2);
		Assert.assertEquals(actual, expected);
		System.out.println("Calculate sum " + arg1 + " and " + arg2 + " = " + actual);
		timeout.sleep(5);
		checkTime();
	}

}