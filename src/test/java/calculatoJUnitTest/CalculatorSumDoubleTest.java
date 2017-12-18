package calculatoJUnitTest;

import junitparams.Parameters;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */
public class CalculatorSumDoubleTest extends BaseCalculatorTestParameters
{

	@Test
	@Parameters(method = "sumDoubleValues")
	public void testSumDouble(double arg1, double arg2, double expected)
	{
		double actual = round(calculator.sum(arg1, arg2));
		assertThat("Sum of the " + arg1 + "and "+arg2, actual, is(equalTo(expected)));
	}

	public static Object[][] sumDoubleValues()
	{
		return new Object[][] {
				{ 100.6, 100.15, 200.75 },
				{ -1.185,-15.0, -16.185 },
		};
	}
}
