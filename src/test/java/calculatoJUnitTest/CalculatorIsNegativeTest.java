package calculatoJUnitTest;

import junitparams.Parameters;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */
public class CalculatorIsNegativeTest extends BaseCalculatorTestParameters
{
	@Test
	@Parameters({ "-10|True", "50|False" })
	public void testIsNegative(long arg1, boolean expected)
	{
		boolean actual = calculator.isNegative(arg1);
		assertThat("Tg of the " + arg1, actual, is(equalTo(expected)));
	}
}
