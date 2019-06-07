package stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class InfixToPrefixConversionTest {
	@Test
	public void testInfixToPostfixConversion() {
		InfixToPrefixConversion convertor = new InfixToPrefixConversion();
		assertEquals("+AB", convertor.convertInfixToPrefix("A+B"));
		assertEquals("++ABC", convertor.convertInfixToPrefix("A+B+C"));
		assertEquals("-+a*b^-^cde+f*ghi", convertor.convertInfixToPrefix("a+b*(c^d-e)^(f+g*h)-i"));
	}
}
