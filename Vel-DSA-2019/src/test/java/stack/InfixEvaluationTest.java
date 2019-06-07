package stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class InfixEvaluationTest {
	@Test
	public void testInfixEvaluation() {
		InfixEvaluation evaluation = new InfixEvaluation();

		assertEquals(34, evaluation.evaluateInfix("12+22"));
		assertEquals(75, evaluation.evaluateInfix("(62+13)"));
		assertEquals(2, evaluation.evaluateInfix("1+2*3-5"));
		assertEquals(-3, evaluation.evaluateInfix("1+2*(3-5)"));
		assertEquals(-5, evaluation.evaluateInfix("2+3-5*2"));
		assertEquals(396, evaluation.evaluateInfix("(5+2*3)*(3*(10+2))"));
	}
}
