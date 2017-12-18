package calculatoJUnitTest;

import junitparams.Parameters;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */

public class CalculatorDivDoubleTest extends BaseCalculatorTestParameters
{

	@Test
	public void testDivisionWithException()
	{
		thrown.expect(NumberFormatException.class);
		thrown.expectMessage(containsString("zero"));
		round(calculator.div(1, 0));
	}

	@Test
	@Parameters(method = "divDoubleValues")
	public void testDivDouble(double arg1, double arg2, double expected)
	{
		double actual = round(calculator.div(arg1, arg2));
		assertThat("Div " + arg1 + " on " + arg2, actual, is(equalTo(expected)));
	}

	public Object[][] divDoubleValues()
	{
		return new Object[][] {
				{ 15, 1, 15 },
				{ -10.45, -12.4, 0.8427 },
		};
	}
}
