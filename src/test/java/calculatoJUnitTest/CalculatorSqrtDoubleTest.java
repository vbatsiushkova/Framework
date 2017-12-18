package calculatoJUnitTest;

import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

/**
 * Created by Volha_Batsiushkova on 12/10/2017.
 */
public class CalculatorSqrtDoubleTest     extends BaseCalculatorTestParameters
{

	@Test
	@Parameters({ "9|3", "15|3.873" })
	public void testSqrtDouble(double arg1, double expected)
	{
		double actual = round(calculator.sqrt(arg1));
		assertThat("Sgrt of the " + arg1, actual, is(equalTo(expected)));
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	@Test
	public void testSqrtExeption(){
		thrown.expect(NumberFormatException.class);
		thrown.expectMessage(containsString(" "));
		round(calculator.sqrt(-16));
	}
}
