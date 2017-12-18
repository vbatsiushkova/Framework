package calculatoJUnitTest;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */
@RunWith(JUnitParamsRunner.class)
public class CalculatorSinDoubleTest   extends BaseCalculatorTestParameters
{
	@Test
	@Parameters({ "1.2568|0.9511", "90|0.894" })
	public void testSin(double arg1, double expected)
	{
		double actual = round(calculator.sin(arg1));
		assertThat("Sin of the " + arg1, actual, is(equalTo(expected)));

	}

}
