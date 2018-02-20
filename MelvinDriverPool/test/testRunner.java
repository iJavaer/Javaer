import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


/** Run Test Standalone, Test Runner
 */
public class testRunner {
	public static void main(String[] args) {
		Result result1 = JUnitCore.runClasses(BasicUnitTest1.class);
		Result result2 = JUnitCore.runClasses(BasicUnitTest2.class);
		
		for (Failure failure : result1.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("Result1 Pass? : " + result1.wasSuccessful());
		
		for (Failure failure : result2.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("Result2 Pass? : " + result2.wasSuccessful());
	}
}