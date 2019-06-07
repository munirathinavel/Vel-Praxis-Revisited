package stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PostfixEvaluationTest {
	@Test
	public void testPostfixEvaluation() {
		PostfixEvaluation evaluation = new PostfixEvaluation();
		assertEquals(5, evaluation.convertInfixToPostfix("23+"));
		assertEquals(2, evaluation.convertInfixToPostfix("123*+5-"));
		assertEquals(-4, evaluation.convertInfixToPostfix("231*+9-"));
		assertEquals(88, evaluation.convertInfixToPostfix("523*+213+**"));

	}

}
