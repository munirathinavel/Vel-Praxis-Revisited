package stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PrefixToPostfixConversionTest {
	@Test
	public void testPrefixToPostfixConversion() {
		PrefixToPostfixConversion convertor = new PrefixToPostfixConversion();
		assertEquals("AB+", convertor.convertPrefixToPostfix("+AB"));
		assertEquals("AB+C+", convertor.convertPrefixToPostfix("++ABC"));
		assertEquals("ABC/-AK/L-*", convertor.convertPrefixToPostfix("*-A/BC-/AKL"));
		assertEquals("abc*+cab+**", convertor.convertPrefixToPostfix("*+a*bc*c+ab"));

	}
}
