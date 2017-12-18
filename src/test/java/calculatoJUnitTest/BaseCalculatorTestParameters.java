package calculatoJUnitTest;

import com.epam.tat.module4.Calculator;
import junitparams.JUnitParamsRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

/**
 * Created by Volha_Batsiushkova on 12/11/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class BaseCalculatorTestParameters
{
	protected static Calculator calculator;

	@BeforeClass
	public static void setUp()
	{
		System.out.println("Config prepare calculator");
		calculator = new Calculator();
	}

	@AfterClass
	public static void closeClass()
	{
		System.out.println("Test is executed");
	}

	protected double round(double value)
	{
		return (double) Math.round(value * 10000d) / 10000d;

	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();
}
