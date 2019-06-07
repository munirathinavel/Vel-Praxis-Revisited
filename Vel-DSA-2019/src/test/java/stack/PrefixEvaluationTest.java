package stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PrefixEvaluationTest {
	@Test
	public void testPrefixEvaluation() {
		PrefixEvaluation evaluation = new PrefixEvaluation();
		assertEquals(5, evaluation.prefixEvaluation("+23"));
		assertEquals(2, evaluation.prefixEvaluation("-+1*235"));
		assertEquals(-4, evaluation.prefixEvaluation("-+2*319"));
		assertEquals(88, evaluation.prefixEvaluation("*+5*23*2+13"));

	}

}
