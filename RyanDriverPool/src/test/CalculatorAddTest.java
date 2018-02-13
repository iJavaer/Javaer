package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

class CalculatorAddTest {

	@Test
	public void testAddPass() {
		assertEquals("Error in add()..", 3, Calculator.add(1, 2));
		assertEquals("Error in add()..", -3, Calculator.add(-1, -2));
		assertEquals("Error in add()..", -1, Calculator.add(-1, -2));
	}
	
	@Test
	public void testAddFail() {
		assertNotEquals("Error in add()..", 0, Calculator.add(1, 2));
	}
	
}
