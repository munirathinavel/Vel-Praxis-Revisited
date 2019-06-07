package stack;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeWithDelimiterTest {

	@Test
	public void testPalindromeWithDelimiter() {
		PalindromeWithDelimiter palindrome = new PalindromeWithDelimiter();

		assertTrue(palindrome.isPalindromeStack("abcXcba".toCharArray()));
		assertFalse(palindrome.isPalindromeStack("abcXcaba".toCharArray()));

	}

	@Test
	public void testPalindromeWithDelimiter_without_stack() {
		PalindromeWithDelimiter palindrome = new PalindromeWithDelimiter();

		assertTrue(palindrome.isPalindrome("abcXcba".toCharArray()));
		assertFalse(palindrome.isPalindrome("abcXcaba".toCharArray()));

	}

}
