package CalculatorTestNG;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Volha_Batsiushkova on 12/16/2017.
 */
public class CalculatorSubLongTest extends BaseCalculatorTest
{
	@Test
	@Parameters({"arg1", "arg2", "expected"})
	public void testSubLong(@Optional(value = "11") long arg1,@Optional(value = "25") long arg2,@Optional(value = "-14") long expected )
	{
		long actual = calculator.sub(arg1,arg2);
		Assert.assertEquals(actual,expected);
		timeout.sleep(5);
		checkTime();
		System.out.println(Thread.currentThread().getId());
	}
}
