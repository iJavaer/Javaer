import static org.junit.Assert.*;
import org.junit.Test;

import JUnit.BasicTestPojo;
import JUnit.BasicUnitTest;
 
public class BasicUnitTest1 {
   @Test
   public void testAddPass() {
      // assertEquals(String message, long expected, long actual)
      assertEquals("error in add()",  3, BasicUnitTest.add(1, 2));
      assertEquals("error in add()", -3, BasicUnitTest.add(-1, -2));
      assertEquals("error in add()",  9, BasicUnitTest.add(9, 0));
   }
 
   @Test
   public void testAddFail() {
      // assertNotEquals(String message, long expected, long actual)
      assertNotEquals("error in add()", 0, BasicUnitTest.add(1, 2));
   }
 
   @Test
   public void testSubPass() {
      assertEquals("error in sub()",  1, BasicUnitTest.sub(2, 1));
      assertEquals("error in sub()", -1, BasicUnitTest.sub(-2, -1));
      assertEquals("error in sub()",  0, BasicUnitTest.sub(2, 2));
   }
 
   @Test
   public void testSubFail() {
      assertNotEquals("error in sub()", 0, BasicUnitTest.sub(2, 1));
   }
   
   @Test
   public void testSubObj() {
	      assertNotEquals("error in testSubObj()", 0, BasicUnitTest.sub(2, 1));
   }
   
   @Test //test return object type, can be pojo or other class like Integer or String
   public void testAddexObj() {
	   Object obj = BasicUnitTest.returnPojo(new BasicTestPojo());
	   assertTrue("error in testAddexObj()", obj instanceof BasicTestPojo);
   }
   
   @Test //test return datatype
   public void testReturnTypeInt(){
	   boolean b = false;
	   if (Integer.class.equals(BasicUnitTest.addex(2, 1).getClass()))
	   {
	      b=true;
	   }
	   assertTrue("err at testReturnTypeInt",b);
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testDivIntByZero() {
      BasicUnitTest.divInt(9, 0); // expect an IllegalArgumentException
   }
}