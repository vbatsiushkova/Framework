package calculatoJUnitTest;

import junitparams.Parameters;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */
public class CalculatorPowDoubleTest   extends BaseCalculatorTestParameters
{

	@Test
	@Parameters(method = "powDoubleValues")
	public void testPowDouble(String arg1, String arg2, String expected)
	{
		double actual = round(calculator.pow(Double.valueOf(arg1),Double.valueOf(arg2)));
		assertThat("Pow " + arg1 + "and " + arg2, actual, is(equalTo(Double.valueOf(expected))));
	}

	public Object[][] powDoubleValues()
	{
		return new Object[][] {
				{ "2.0", "3.0", "8.0"},
				{ -5, 0, 1},
				{"5", "3.6","328.3159755"},
		};
	}

}
