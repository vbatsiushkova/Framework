package CalculatorTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Volha_Batsiushkova on 12/13/2017.
 */
public class CalculatorTgDoubleTest extends BaseCalculatorTest
{
	private double arg1;
	private double expected;
	public CalculatorTgDoubleTest(double arg1, double expected)
	{
		this.arg1 = arg1;
		this.expected = expected;
	}

	@Test
	public void testTg ()
	{
        double actual = calculator.tg(arg1);
		Assert.assertEquals(actual, expected);
		timeout.sleep(5);
		checkTime();
    }
}
