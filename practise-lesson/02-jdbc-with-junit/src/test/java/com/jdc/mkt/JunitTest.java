package com.jdc.mkt;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitTest {
	@BeforeAll
	static void befAll() {
		System.out.println("Before All");
	}
	@AfterAll
	static void aftAll() {
		System.out.println("After All.");
	}
	@BeforeEach
	static void befEach() {
		System.out.println("Before Each");
	}
	@AfterEach
	static void aftEach() {
		System.out.println("After Each");
	}
	@Test
	static void  testOne() {
		System.out.println("Test One");
	}
	@Test
	static void  testTwo() {
		System.out.println("Test Two");
	}

}
