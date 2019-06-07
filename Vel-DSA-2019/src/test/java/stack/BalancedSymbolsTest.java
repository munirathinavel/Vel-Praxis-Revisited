package stack;

import org.junit.Test;

public class BalancedSymbolsTest {

	@Test
	public void testBalancedSymbols() {
		String[] experessions = { "(A+B)+(C-D)", "((A+B)+(C-D)", "((A+B)+[C+D])", "((A+B)+[C+D]))" };
		BalancedSymbols balancedSymbols = new BalancedSymbols();
		for (String exp : experessions) {
			System.out.println(balancedSymbols.isBalancedSymbols(exp.toCharArray()));
		}
	}

}
