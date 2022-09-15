package NewStuff_XX.Java14.records;

import org.junit.jupiter.api.Test;

public class Records {
	@Test
	public void recordsExample() {
		Person person1 = new Person("Mehmed", 27);
		PersonRecord mehmed = new PersonRecord("Mehmed", 27);

		System.out.println(person1.getAge());
		System.out.println(mehmed.name());
	}
}
