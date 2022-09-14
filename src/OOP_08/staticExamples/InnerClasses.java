package OOP_08.staticExamples;

/**
 * Weil static nicht an Objekte abhängen -> Objekte werden zu Runtime erstellt
 * Und static nichts damit zu tun hat -> Compile Time - ClassLevel Methods
 */

// outside classes cannot be static -> because it should be
// dependent
//static public class InnerClasses {
//	class A {
//
//	}
//}

class Test {
	static String name;

	public Test(String name) {
		Test.name = name;
	}
}

public class InnerClasses {
	// inner classes can be static
	// inner class als static zu machen bedeutet, dass
	// sie nicht mehr an der parant class dependent ist
	// ich brauche kein Objekt vom parant um die Subklasse
	// zu benutzen, sondern
	// warum kann man aber in main eigene identitätsobjekte
	// von test2 erstellen? Weil static in Unterklassen bedeutet
	// das es nicht von Objekten der Oberklasse abhängt
	// aber eigene Objekte haben kann in static kontext
	static class Test2 {
		String name;

		public Test2(String name) {
			this.name = name;
		}
	}

	static class Test3 {
		// hier bekommt man imer das letzte vom Objekt weil static
		static String name;
		public Test3 (String name) {
			Test3.name = name;
		}
	}

	public static void main(String[] args) {
		Test a = new Test("Test");
		Test b = new Test("Test2");

		System.out.println(a.name);
		System.out.println(b.name);
		System.out.println("----");

		Test2 test2 = new Test2("Test2");
		Test2 test22 = new Test2("Test22");

		System.out.println(test2.name);
		System.out.println(test22.name);
		System.out.println("----");

		Test3 test3 = new Test3("Test3");
		Test3 test33 = new Test3("Test33");

		System.out.println(test3.name);
		System.out.println(test33.name);

	}
}
