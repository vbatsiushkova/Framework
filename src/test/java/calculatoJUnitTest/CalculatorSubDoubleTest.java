package calculatoJUnitTest;

import junitparams.Parameters;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */
public class CalculatorSubDoubleTest    extends BaseCalculatorTestParameters
{
	@Test
	@Parameters(method = "subDoubleValues" )
	public void testSubDouble(String arg1, String arg2,String expected )
	{
		double actual = round(calculator.sub(Double.valueOf(arg1),Double.valueOf(arg2)));
		assertThat("Sub of the " + arg1 + " and "+arg2, actual, is(equalTo(Double.valueOf(expected))));
	}

	public Object[][] subDoubleValues()
	{
		return new Object[][] {
				{ "10.45", "20.15", "-9.70"},
				{ -10, -50, 40.0},
		};
	}


}
