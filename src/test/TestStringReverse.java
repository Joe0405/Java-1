package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pe.StringReverse;

class TestStringReverse {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		String expected = "nodnol";
		String actual = StringReverse.stringReverse("london");
		assertEquals(expected,actual);
	}

}
