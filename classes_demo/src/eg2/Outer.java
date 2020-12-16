package eg2;

public class Outer {

	public void outerMeth() {
		InnerPrivate i = new InnerPrivate();
		i.helloInnerPrivate();
	}

	private class InnerPrivate {

		public void helloInnerPrivate() {
			System.out.println("hello from helloInnerprivate()");
		}
	}

	public class InnerPublic {
		public void helloInnerPublic() {
			System.out.println("hey from helloinnerpublic");
		}
	}

	public static class InnerPublicStatic {
		public void helloInnerPublicNonStatic() {
			System.out.println("hey from helloinnerpublicNonStatic");
		}

		public static void helloInnerPublicStatic() {
			System.out.println("hey from helloinnerpublicStatic");
		}
	}
}
