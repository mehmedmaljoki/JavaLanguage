package OOP_08.AdvancedConcepts.AbstractClasses;

public class Daughter extends Paranet {
	public Daughter(int age) {
		super(age);
	}

	@Override
	void career() {
		System.out.println("I'am daughters career");
	}

	@Override
	void partner() {
		System.out.println("I love cooking");
	}
}
