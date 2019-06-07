package stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PostfixToInfixConversionTest {
	@Test
	public void testPrefixToPostfixConversion() {
		PostfixToInfixConversion convertor = new PostfixToInfixConversion();
		assertEquals("(A+B)", convertor.convertPostfixToInfix("AB+"));
		assertEquals("((A+B)+C)", convertor.convertPostfixToInfix("AB+C+"));
		assertEquals("((A-(B/C))*((A/K)-L))", convertor.convertPostfixToInfix("ABC/-AK/L-*"));
		assertEquals("((a+(b*c))*(c*(a+b)))", convertor.convertPostfixToInfix("abc*+cab+**"));

	}
}
