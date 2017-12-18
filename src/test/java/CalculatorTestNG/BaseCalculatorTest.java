package CalculatorTestNG;

import com.epam.tat.module4.Calculator;
import com.epam.tat.module4.Timeout;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;

import java.util.Date;

/**
 * Created by Volha_Batsiushkova on 12/13/2017.
 */
public class BaseCalculatorTest
{
	protected static Calculator calculator;
	protected static Timeout timeout ;
	private long startTime;
	private long endTime;
	@BeforeSuite
		public void runSuite()
		{
			calculator = new Calculator();
			startTime = System.currentTimeMillis();
		}


	@BeforeGroups(groups = { "Non-trigonometry", "trigonometry" })
	public static void runGroups()
	{
		calculator = new Calculator();
	}

	@BeforeClass
	public static void setUp()
	{
		calculator = new Calculator();
		timeout = new Timeout();
	}

	@AfterSuite
	public void afterClass(){
		endTime = System.currentTimeMillis();
		long executionTime = endTime-startTime;
		System.out.println("Time of test execution : " +executionTime);
		
	}

	protected double round(double value)
	{
		return (double) Math.round(value * 10000d) / 10000d;
	}
	protected void checkTime() {
		System.out.println("Current time: " + new Date(System.currentTimeMillis()));
	}

}

