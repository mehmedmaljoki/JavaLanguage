package OOP_08.staticExamples;

public class Main {
	public static void main(String[] args) {
		Human test = new Human(22, "Test", 10000, true);

		Main main = new Main();
		main.greeting();

		Main.greeting2();
	}

	// this is dependet on objects
	void greeting() {
		System.out.println("Hello World");
		greeting2(); // das geht, da man keine instancen braucht
	}

	// this is not dependet on objects, but on class
	static void greeting2() {
		System.out.println("static hello world");
		// greeting(); cant be used bacause it requires an instance of the object
		// but the function here is a static context -> not depend on instances
	}





	/**
	 * static methods and variables => resolving during compilefile - class level methods
	 */
}
