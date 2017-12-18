package calculatoJUnitTest;

import junitparams.Parameters;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */
public class CalculatorIsPositiveTest extends BaseCalculatorTestParameters
{
	@Test
	@Parameters({"-10|False","50|True"})
	public void testIsPositive(long arg1, boolean expected)
	{
		boolean actual = calculator.isPositive(arg1);
		assertThat("Tg of the " + arg1, actual, is(equalTo(expected)));
	}
}
