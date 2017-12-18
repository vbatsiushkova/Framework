package CalculatorTestNG;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */
public class CalculatorSubDoubleTest extends BaseCalculatorTest
{

	@Test
	@Parameters({"arg1", "arg2", "expected"})
	public void testSubDouble(@Optional(value = "10.5") double arg1, @Optional(value = "14.1") double arg2,@Optional(value = "-3.6") double expected )
	{
		double actual =round(calculator.sub(arg1,arg2));
		Assert.assertEquals(actual,expected);
		timeout.sleep(5);
		checkTime();
		System.out.println(Thread.currentThread().getId());	}





}
