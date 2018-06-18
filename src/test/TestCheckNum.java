package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pe.CheckNum;

class TestCheckNum {
	CheckNum numObj = null;

	@BeforeEach
	void setUp() throws Exception {
		numObj = new CheckNum();
	}

	@AfterEach
	void tearDown() throws Exception {
		CheckNum numObj = null;
	}

	@Test
	void testOdd() {
		String expected = "Tom";
		String actual = numObj.checkNum(25);
		assertEquals(expected,actual);
	}
	
	@Test
	void testEven() {
		String expected = "Jerry";
		String actual = numObj.checkNum(26);
		assertEquals(expected,actual);
	}
	
	@Test
	void testNum() {
		String expected = "Number is not between 20 and 30";
		String actual = numObj.checkNum(31);
		assertEquals(expected,actual);
	}

}
