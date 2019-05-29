package corejava;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PassByValueTest {

	@Test
	public void passByValueTest() {
		PassByValue passByValue = new PassByValue(1, "old");
		PassByValue old = passByValue;
		System.out.println("Before changeValue: " + passByValue);
		changeValue(passByValue);
		System.out.println("After changeValue: " + passByValue);
		assertTrue(old == passByValue);

		changeReference(passByValue);
		System.out.println("After changeReference: " + passByValue);
	}

	public void changeValue(PassByValue passByValue) {
		passByValue.a = 2;
		passByValue.b = "new";
		System.out.println("At changeValue: " + passByValue);
	}

	public void changeReference(PassByValue passByValue) {
		passByValue = new PassByValue(3, "new-2");
		System.out.println("At changeReference: " + passByValue);
	}
	
	

}
