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
public class CalculatorDivLongTest extends BaseCalculatorTestParameters
{
	@Test
	public void testDivisionWithException()
	{
		thrown.expect(NumberFormatException.class);
		thrown.expectMessage(containsString("zero"));
		round(calculator.div(1, 0));
	}

	@Test
	@Parameters(method = "divLongValues")
	public void testDivLong(long arg1, long arg2, long expected)
	{
		long actual = calculator.div(arg1, arg2);
		assertThat("Div " + arg1 + " on " + arg2, actual, is(equalTo(expected)));
	}

	public Object[][] divLongValues()
	{
		return new Object[][] {
				{ 1L, 10L, 0 },
				{ 30L, -15L, -2L },
		};
	}
}
