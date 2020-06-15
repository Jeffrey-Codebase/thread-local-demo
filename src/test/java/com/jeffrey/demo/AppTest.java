package com.jeffrey.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	private App app = new App();

	@Test
	public void testVisit_parameter() {
		Assertions.assertDoesNotThrow(()-> app.visit_parameter());

	}

	@Test
	public void testVisit_threadLocal() {
		Assertions.assertDoesNotThrow(()-> app.visit_threadLocal());

	}

	@Test
	public void testVisit_static() {
		Assertions.assertDoesNotThrow(()-> app.visit_static());

	}
}
