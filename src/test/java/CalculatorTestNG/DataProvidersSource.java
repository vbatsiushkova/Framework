package CalculatorTestNG;

import org.testng.annotations.DataProvider;

import static java.lang.Math.PI;

/**
 * Created by Volha_Batsiushkova on 12/16/2017.
 */
public class DataProvidersSource
{

	@DataProvider(name = "cosDP")
	public static Object[][] cosDP()
	{
		return new Object[][] {
				{ PI / 6, Math.cos(PI / 6) },
				{ PI / 3, Math.cos(PI / 3) },
		};
	}

	@DataProvider(name = "divDPDouble")
	public static Object[][] divDouble()
	{
		return new Object[][] {
				{ 30.15, 4.16, 7.247596153846153 },
				{ 10.0, 5.0, 2.0 },
		};
	}

	@DataProvider(name = "divDPLong")
	public static Object[][] divLong()
	{
		return new Object[][] {
				{ 30, 4, 7 },
				{ 10, 15, 0 },
		};
	}

	@DataProvider(name = "sinDP")
	public static Object[][] sinDouble()
	{
		return new Object[][] {
				{ PI / 3, Math.sin(PI / 3) },
				{ PI / 6, Math.sin(PI / 6) },
		};
	}

	@DataProvider(name = "sqrtDP")
	public static Object[][] sqrtDouble()
	{
		return new Object[][] {
				{ 9.0, 3 },
				{ 16, 4 },
		};
	}

	@DataProvider(name = "powDP")
	public static Object[][] powDoubleValues()
	{
		return new Object[][] {
				{ "2.0", "3.0", "8.0" },
				{ "-5", "0", "1" },
				{ "5", "-2", "0.04" },
				{ "-5", "-2", "0.04" },
				{ "5", "3.6", "328.3159755" }
		};
	}

	@DataProvider(name = "multLongDP")
	public static Object[][] multLong()
	{
		return new Object[][] {
				{ "3", "5", "15" },
				{ "-5", "-3", "15" },
				{ "-5", "3", "-15" },
				{ "5", "0", "0" }
		};
	}

	@DataProvider(name = "multDoubleDP")
	public static Object[][] multDouble()
	{
		return new Object[][] {
				{ "5.5", "5.5", "30.25" },
				{ "5.5", "-5.5", "-30.25" },
				{ "-5.5", "-5.5", "30.25" },
		};
	}

}

