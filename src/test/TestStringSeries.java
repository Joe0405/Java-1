package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pe.StringSeries;

class TestStringSeries {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		String expected = "Stackrouterouterouterouterouteroute";
		String actual = StringSeries.stringSeries("Stackroute", 5);
		assertEquals(expected,actual);
	}

}
