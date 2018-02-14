package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CalculatorAddTest {

	@Test
	public void pass() {
		assertEquals("Error in add()-1..", 3, Calculator.add(1, 2));
		assertEquals("Error in add()-2..", -3, Calculator.add(-1, -2));
		assertEquals("Error in add()-3..", -1, Calculator.add(-1, -2));
	}
	
	@Test
	public void fail() {
		assertNotEquals("Error in add()-4..", 0, Calculator.add(1, 2));
	}
	
}
