package CalculatorTestNG;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */

public class CalculatorSumDoubleTest extends BaseCalculatorTest
{
	@Test(dependsOnGroups ="trigonometry", groups = "Non-trigonometry")
	@Parameters({"arg1", "arg2", "expected"})
	public void testSumDouble(@Optional(value = "10") double arg1, @Optional(value = "-15") double arg2, @Optional(value = "-5") double expected)
	{
		double actual = calculator.sum(arg1, arg2);
		Assert.assertEquals(actual, expected);
		System.out.println("Calculated sum " + arg1 + " and " + arg2 + " = " + actual);
		timeout.sleep(5);
		checkTime();

    }


}
