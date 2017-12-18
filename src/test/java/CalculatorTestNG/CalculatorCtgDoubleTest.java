package CalculatorTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Volha_Batsiushkova on 12/13/2017.
 */
public class CalculatorCtgDoubleTest extends BaseCalculatorTest
{
	private double arg1;
	private double expected;

	public CalculatorCtgDoubleTest(double arg1, double expected)
	{
		this.arg1 = arg1;
		this.expected = expected;
	}

	@Test
	public void testCtg()
	{
		double actual = calculator.ctg(arg1);
		Assert.assertEquals(actual, expected);
		System.out.println("Calculate ctg " + arg1);
		timeout.sleep(5);
		checkTime();
	}
}
