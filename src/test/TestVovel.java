package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pe.*;

public class TestVovel {
	CheckVowel sObj = null;

	@Before
	public void setUp() throws Exception {
		sObj = new CheckVowel();
	}

	@After
	public void tearDown() throws Exception {
		sObj = null;
	}

	@Test
	public void testOutput() {
		String expected = "Vowel Consonant ";
		String actual = sObj.checkVowel("ew");
		assertEquals(expected,actual);
		
	}

}
