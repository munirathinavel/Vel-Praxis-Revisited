package stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class InfixToPostfixConversionTest {
	@Test
	public void testInfixToPostfixConversion() {
		InfixToPostfixConversion convertor = new InfixToPostfixConversion();
		assertEquals("AB+", convertor.convertInfixToPostfix("A+B"));
		assertEquals("AB+C+", convertor.convertInfixToPostfix("A+B+C"));
		assertEquals("abcd^e-fgh*+^*+i-", convertor.convertInfixToPostfix("a+b*(c^d-e)^(f+g*h)-i"));

	}

}
