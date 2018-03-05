package com.app.service.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;

public class CalculatorTest {

	private Calculator calculator;

	@Before
	public void setUp() {
		calculator = new Calculator(); // Arrange
	}

	@Test
	public void addTest() {
		double actual = calculator.add(12, 13); // Act
		assertEquals(25.0, actual, 0.1);
	}

}
