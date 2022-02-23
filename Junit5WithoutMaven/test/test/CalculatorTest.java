package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import code.Calculator;

class CalculatorTest {

	public static Calculator calculator;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calculator = new Calculator();
		System.out.println("This is executed once before class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("This is executed once after class");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("This is executed once beforeEach test");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("This is executed once afterEach test");
	}

	@Test
	public void testSum() {
		int result = calculator.sum(5, 4);
		assertEquals(9, result);
	}
	
	@Test
	public void testDivison() {
		int result;
		try {
			result = calculator.divison(10, 2);
			assertEquals(5, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
