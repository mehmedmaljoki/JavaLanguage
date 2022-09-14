package OOP_08.staticExamples;

// this is a demo to show initialisation of static variables
public class StaticBlock {
	static int a = 4;
	static int b;


	// will only run once, when the first obj is created ie: when the class is loaded
	// for the fist time
	static {
		// how you can initialize static varables
		System.out.println("I am in static block");
		b = a * 5;
	}

	public static void main(String[] args) {
		var stb = new StaticBlock();
		System.out.println(StaticBlock.a + " " + StaticBlock.b);

		StaticBlock.b += 3;
		System.out.println(StaticBlock.a + " " + StaticBlock.b);

		var obj2 = new StaticBlock();
		System.out.println(StaticBlock.a + " " + StaticBlock.b);
	}

}
