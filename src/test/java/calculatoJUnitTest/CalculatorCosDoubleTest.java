package calculatoJUnitTest;

import junitparams.Parameters;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */
public class CalculatorCosDoubleTest extends BaseCalculatorTestParameters
{
	@Test
	@Parameters({ "1.247|0.999763", "90|-0.448" })
	public void testCos(double arg1, double expected)
	{
		double actual = round(calculator.cos(arg1));
		assertThat("Cos of the " + arg1, actual, is(equalTo(expected)));

	}

}
