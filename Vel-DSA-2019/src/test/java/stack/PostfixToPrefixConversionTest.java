package stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PostfixToPrefixConversionTest {
	@Test
	public void testPrefixToPostfixConversion() {
		PostfixToPrefixConversion convertor = new PostfixToPrefixConversion();
		assertEquals("+AB", convertor.convertPostfixToPrefix("AB+"));
		assertEquals("++ABC", convertor.convertPostfixToPrefix("AB+C+"));
		assertEquals("*-A/BC-/AKL", convertor.convertPostfixToPrefix("ABC/-AK/L-*"));
		assertEquals("*+a*bc*c+ab", convertor.convertPostfixToPrefix("abc*+cab+**"));
	}
}
