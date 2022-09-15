package OOP_08.AdvancedConcepts.AbstractClasses;

public class Son extends Paranet {

	public Son(int age) {
		super(age);
	}

	@Override
	void career() {
		System.out.println("I'am in sons career");
	}

	@Override
	void partner() {
		System.out.println("I love sons coding");
	}
}
