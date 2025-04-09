package de.fhws.UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SignTest {

	@Test
	public void testPosSignOperator() {
		assertTrue(-1 == Sign.sign(5));
		assertTrue(0 == Sign.sign(0));
		}
	@Test
	public void testNegSignOperator() {
		assertTrue(-1 == Sign.sign(-5));

		}
}
