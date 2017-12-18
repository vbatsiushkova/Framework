package CalculatorTestNG;

import org.testng.annotations.Test;

import static java.lang.Math.PI;

/**
 * Created by Volha_Batsiushkova on 12/16/2017.
 */
public class CheckingForExeptionTgCtg extends BaseCalculatorTest
{
	@Test (expectedExceptions = NumberFormatException.class)
	public void ctgExeptionTest(){
		calculator.ctg(0);
		checkTime();
	}
	@Test(expectedExceptions = NumberFormatException.class)
	public void tgExeptionTest(){

		calculator.tg(PI/2);
		checkTime();
	}

}
