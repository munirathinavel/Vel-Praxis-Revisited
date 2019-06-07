package stack;

public class PalindromeWithDelimiter {

	public boolean isPalindromeStack(char[] pattern) {
		LinkedListStack<Character> stack = new LinkedListStack<>();
		int i = 0;
		while (pattern[i] != 'X') {
			stack.push(pattern[i++]);
		}
		i++;
		while (i < pattern.length) {
			if (stack.isEmpty() || stack.pop() != pattern[i++]) {
				return false;
			}
		}
		return true;
	}

	public boolean isPalindrome(char[] pattern) {
		int i = 0;
		int j = pattern.length;
		while (i != j && pattern[i] != 'X') {
			if (pattern[i++] != pattern[--j]) {
				return false;
			}
		}
		return true;
	}

}
