package OOP_08.staticExamples;

public class Human {
	int age;
	String name;
	int salery;
	boolean married;
	// not related to the object
	static long population;


	public Human(int age, String name, int salery, boolean married) {
		this.age = age;
		this.name = name;
		this.salery = salery;
		this.married = married;

		Human.population += 1;
	}
}
