package Brahmjit.tddjunitTask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveATestCases {

	/* Todo test cases
	 * 1. ABCD => BCD
	 * 2. AACD => CD
	 * 3. BACD => BCD
	 * 4. BBAA => BBAA
	 * 5. AABBAA => BAA
	 * 6. AA => ""
	 * 7. A => ""
	 * 8. BA => B
	 * 9. AB => B
	 * 10. AABCDEFGH => BCDEFGH
	 * 
	 * */
	
	RemoveA obj;
	
	@BeforeEach
	void setUp(){
		obj=new RemoveA();
	}
	@Test
	void testFirstLetterA() {
		assertEquals("BCD", obj.remove("ABCD"));
	}
	@Test
	void testBothLetterA() {
		assertEquals("CD", obj.remove("AACD"));
	}
	@Test
	void testSecondLetterA() {
		assertEquals("BCD", obj.remove("BACD"));
	}
	@Test
	void testNoneLetterA() {
		assertEquals("BBCD", obj.remove("BBCD"));
	}
	@Test
	void testStartAndEndLetterA() {
		assertEquals("CDAA", obj.remove("AACDAA"));
	}
	@Test
	void testBothAndOnlyLetterA() {
		assertEquals("", obj.remove("AA"));
	}
	@Test
	void testSingleLetterA() {
		assertEquals("", obj.remove("A"));
	}
	@Test
	void testFirstLetterAInTwoLetters() {
		assertEquals("B", obj.remove("AB"));
	}
	@Test
	void testSecondLetterAInTwoLetters() {
		assertEquals("B", obj.remove("BA"));
	}
	@Test
	void testBothLetterAInNLetters() {
		assertEquals("BCDEFGH", obj.remove("AABCDEFGH"));
	}

}
