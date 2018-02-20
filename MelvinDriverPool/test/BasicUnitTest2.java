import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import JUnit.BasicTestPojo;
import JUnit.BasicUnitTest;

public class BasicUnitTest2 {
	   private BasicTestPojo obj; // Test fixtures
	   
	   @Before
	   public void setUp() throws Exception {
	      System.out.println("Run @Before"); // for illustration
	      obj = new BasicTestPojo();
	      obj.setNum1(1);
	      obj.setNum2(2);
	   }
	 
	   @After
	   public void tearDown() throws Exception {
	      System.out.println("Run @After"); // for illustration
	   }
	   
	   @Test
	   public void testGetterSetter() {
	      System.out.println("Run @Test testGetterSetter"); // for illustration
	      int value = 33;
	      obj.setNum1(value);
	      assertEquals("error in getter/setter", value, obj.getNum1());
	   }
	 
	   @Test
	   public void testSumOfPojo() {
	      System.out.println("Run @Test testAdd"); // for illustration
	      assertEquals("error in add()", 3, BasicUnitTest.sumOfPojo(obj));
	   }
}
