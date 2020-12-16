package eg1;

public class CalculatoR {

	public CalculatoR(String name) {
		System.out.println("Hello " + name);
	}

	public CalculatoR(int x) {
		System.out.println("x = " + x);
	}

	int a, b;
//	public CalculatoR(int x, int y) {
//		a = x;
//		b = y;
//	}

	public CalculatoR(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add() {
		return a + b;
	}

	public int multiply() {
		return a * b;
	}
}
