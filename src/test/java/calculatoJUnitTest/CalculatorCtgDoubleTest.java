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
public class CalculatorCtgDoubleTest extends BaseCalculatorTestParameters
{
	@Test
	@Parameters({ "30|-0.156", "60|3.124" })
	public void testCtg(double arg1, double expected)
	{
		double actual = round(calculator.ctg(arg1));
		assertThat("Ctg of the " + arg1, actual, is(equalTo(expected)));
	}

	@Test
	public void testCtgWithException()
	{
		thrown.expect(NumberFormatException.class);
		thrown.expectMessage(containsString("zero"));
		round(calculator.ctg(0));
	}
}
