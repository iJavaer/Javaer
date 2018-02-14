package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


/** Run Test Standalone, Test Runner
 */
public class RunTestStandalone {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(CalculatorAddTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("Result Pass? : " + result.wasSuccessful());
	}
}
