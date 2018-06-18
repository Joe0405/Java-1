package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pe.CheckChar;

public class TestCheckChar {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		String expected = "Capital Letter";
		String actual = CheckChar.checkChar('A');
		assertEquals(expected,actual);
	}
	
	@Test
	public void test2() {
		String expected = "Number";
		String actual = CheckChar.checkChar('1');
		assertEquals(expected,actual);
	}
	
	@Test
	public void test3() {
		String expected = "Small Letter";
		String actual = CheckChar.checkChar('a');
		assertEquals(expected,actual);
	}
	
	@Test
	public void test4() {
		String expected = "Special Character";
		String actual = CheckChar.checkChar('$');
		assertEquals(expected,actual);
	}

}
