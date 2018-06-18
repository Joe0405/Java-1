package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pe.SumProgram;

class TestSum {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		int expected = 41;
		int[] a = {12,23,2,4};
		int actual = SumProgram.sumProgram(a);
		assertEquals(expected,actual);
	}

}
