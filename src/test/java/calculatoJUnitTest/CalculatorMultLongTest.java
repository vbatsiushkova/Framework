package calculatoJUnitTest;

import junitparams.Parameters;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */
public class CalculatorMultLongTest  extends BaseCalculatorTestParameters
{

	@Test
	@Parameters(method = "multLongValues")
	public void testMultLong(String arg1, String arg2, String expected)
	{
		long actual = calculator.mult(Long.valueOf(arg1), Long.valueOf(arg2));
		assertThat("Mult " + arg1 + "and " + arg2, actual, is(equalTo(Long.valueOf(expected))));
	}

	public Object[][] multLongValues()
	{
		return new Object[][] {
				{ "12", "13", "156"},
				{ 10L, -10L, -100L},
		};
	}
}
