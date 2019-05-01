package string;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringTest {
	@Test
	public void test() {

		String s2 = "Cat";
		String s3 = "Cat";
		assertTrue(s2 == s3);
		String s1 = new String("Cat");
		assertFalse(s1 == s2);
		// Returns referece/value. But not moving originally allocated memory.
		String s4 = s1.intern();
		assertFalse(s1 == s2);
		assertTrue(s2 == s4);
	}
}
