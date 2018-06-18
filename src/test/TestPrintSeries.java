package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pe.PrintSeries;

class TestPrintSeries {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		String expected = "122";
		String actual = PrintSeries.printSeries(2);
		assertEquals(expected,actual);
	}
	
	@Test
	void test2() {
		String expected = "1223334444";
		String actual = PrintSeries.printSeries(4);
		assertEquals(expected,actual);
	}
}
