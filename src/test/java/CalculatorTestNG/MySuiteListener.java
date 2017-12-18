package CalculatorTestNG;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.xml.XmlSuite;

/**
 * Created by Volha_Batsiushkova on 12/17/2017.
 */
public class MySuiteListener implements ISuiteListener
{
	@Override
	public void onStart(ISuite suite) {
		suite.getXmlSuite().setParallel(XmlSuite.ParallelMode.CLASSES);
		suite.getXmlSuite().setThreadCount(4);
	}

	@Override
	public void onFinish(ISuite suite) {

	}
}
