package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.*;
import pe.*;

public class TestPalindrome {
    Palindrome pObj = null; 
	@Before
	public void setUp() throws Exception {
		pObj = new Palindrome();
	}

	@After
	public void tearDown() throws Exception {
		pObj = null;
	}


	@Test
	public void testCheckPal() {
		boolean[] expected = {true, false};
		int arr[] = {1,2,2,1};
		boolean[] actual = pObj.checkPal(arr);
		assertEquals(expected[0] , actual[0]);
		assertEquals(expected[1] , actual[1]);
	}
    
	@Test
	public void testCheckPal1() {
		boolean[] expected = {true, true};
		int arr[] = {8,6,2,6,8};
		boolean[] actual = pObj.checkPal(arr);
		assertEquals(expected[0] , actual[0]);
		assertEquals(expected[1] , actual[1]);
	}
	
	@Test
	public void testCheckPal2() {
		boolean[] expected = {false, false};
		int arr[] = {8,6,2,6,7};
		boolean[] actual = pObj.checkPal(arr);
		assertEquals(expected[0] , actual[0]);
	}
    	
}

