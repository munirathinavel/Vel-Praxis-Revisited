package stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PrefixToInfixConversionTest {
	@Test
	public void testInfixToPrefixConversion() {
		PrefixToInfixConversion convertor = new PrefixToInfixConversion();
		assertEquals("(A+B)", convertor.convertPrefixToInfix("+AB"));
		assertEquals("((A+B)+C)", convertor.convertPrefixToInfix("++ABC"));
		assertEquals("((A-(B/C))*((A/K)-L))", convertor.convertPrefixToInfix("*-A/BC-/AKL"));
		assertEquals("((a+(b*c))*(c*(a+b)))", convertor.convertPrefixToInfix("*+a*bc*c+ab"));

	}
}
