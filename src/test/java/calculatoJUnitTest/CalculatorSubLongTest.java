package calculatoJUnitTest;

import junitparams.Parameters;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */
public class CalculatorSubLongTest    extends BaseCalculatorTestParameters

{
	@Test
	@Parameters(method = "subLongValues")
	public void testSubLong(String arg1, String arg2,String expected)
	{
		long actual = calculator.sub(Long.valueOf(arg1), Long.valueOf(arg2));
		assertThat("Sub of the " + arg1 + "and "+arg2, actual, is(equalTo(Long.valueOf(expected))));
	}

	public Object[][] subLongValues()
	{
		return new Object[][] {
				{ "0", "155", "-155"},
				{ 25L, 10L, 15L},
		};
	}
}
