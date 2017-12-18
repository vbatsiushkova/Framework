package CalculatorTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */
public class CalculatorIsPositiveTest extends BaseCalculatorTest
{
	long arg1;
	boolean expected;

	public CalculatorIsPositiveTest(long arg1, boolean expected)
	{
		this.arg1 = arg1;
		this.expected = expected;
	}

	@Test
   	public void testIsPositive()
	{
		boolean actual = calculator.isPositive(arg1);
		Assert.assertEquals(actual,expected);
		timeout.sleep(5);
		checkTime();
	}
}
