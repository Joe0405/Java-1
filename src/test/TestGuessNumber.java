package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pe.GuessNumber;

class TestGuessNumber {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		double rand = Math.random()*5;
		String expected = "Guessed number is more";
		String actual = GuessNumber.guessNumber((int)rand, 10);
		assertEquals(expected,actual);
	}
	
	@Test
	void test2() {
		double rand = Math.random()*5;
		String expected = "Guessed number is less";
		String actual = GuessNumber.guessNumber((int)rand, 1);
		assertEquals(expected,actual);
	}

}
