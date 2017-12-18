package CalculatorTestNG;

import org.testng.annotations.Factory;

import static java.lang.Math.PI;

/**
 * Created by Volha_Batsiushkova on 12/14/2017.
 */
public class CalculatorTgCtgIsPositiveIsNegativeFactory
{


	@Factory
	public Object[] generateTgCtgIsPositiveIsNegativeTest(){
		return  new Object[]{
				new CalculatorTgDoubleTest(PI/3,Math.tan(PI/3)),
				new CalculatorTgDoubleTest(PI/6,Math.tan(PI/6)),
				new CalculatorCtgDoubleTest(PI/3, 1/Math.tan(PI/3)),
				new CalculatorCtgDoubleTest(PI/6, 1/Math.tan(PI/6)),
				new CalculatorIsNegativeTest(-10,true),
				new CalculatorIsNegativeTest(10,false),
				new CalculatorIsPositiveTest(10,true),
				new CalculatorIsPositiveTest(-10,false),

	} ;
}
}
