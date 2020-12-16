package eg2;

public class TestInnerMain {

	public static void main(String[] args) {

		Outer o = new Outer();
		o.outerMeth();
		Outer.InnerPublic i = o.new InnerPublic();
		i.helloInnerPublic();

		Outer.InnerPublicStatic.helloInnerPublicStatic();

		Outer.InnerPublicStatic i1 = new Outer.InnerPublicStatic();
		i1.helloInnerPublicNonStatic();

	}
}

//In java inner classes can be private static protected and public
//If non static inner class then it can have only non static methods
//and you need to create the obj of outer class to access inner class and it methods
// if static class then a stat class can have both static and non stat meth so to access static meths you dont need obj
// but to access non static methods of a static inner class you need obj of only static inner class not of outer class