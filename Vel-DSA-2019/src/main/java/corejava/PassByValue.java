package corejava;

public class PassByValue {
	int a;
	String b;

	public PassByValue(int a, String b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "a=" + a + ", b=" + b;
	}
}
