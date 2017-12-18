package calculatoJUnitTest;

import junitparams.Parameters;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */
public class CalculatorMultDoubleTest   extends BaseCalculatorTestParameters
{
   	@Test
	@Parameters(method = "multDoubleValues")
	public void testMultDouble(String arg1, String arg2, String expected)
	{
		double actual = round(calculator.mult(Double.valueOf(arg1), Double.valueOf(arg2)));
		assertThat("Mult " + arg1 + "on " + arg2, actual, is(equalTo(Double.valueOf(expected))));
	}

	public Object[][] multDoubleValues()
	{
		return new Object[][] {
				{ "12.56", "12.56", "157.7536"},
				{ -13.5, -10.5, 141.75},
		};
	}
}
