package calculatoJUnitTest;

import junitparams.Parameters;
import org.junit.Test;

import static java.lang.Math.PI;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */
public class CalculatorTgDoubleTest    extends BaseCalculatorTestParameters
{
	@Test
	@Parameters("30|0.5773")
	public void testCtg(double arg1, double expected)
	{
		double actual = round(calculator.tg(arg1));
		assertThat("Tg of the " + arg1 , actual, is(equalTo(expected)));
	}

	@Test
	public void testCtgWithException()
	{
		thrown.expect(NumberFormatException.class);
		thrown.expectMessage(containsString(" "));
		round(calculator.tg(PI/2));
	}
}
