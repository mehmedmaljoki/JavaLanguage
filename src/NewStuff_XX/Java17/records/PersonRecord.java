package NewStuff_XX.Java17.records;

// evrything here is private and final -> inmutable and cannot extend another class
// can implements interfaces
public record PersonRecord(String name, int age) implements Cloneable{
	static int num;
	// int id; geht nicht muss im Constrktor oben sein

	public PersonRecord(String name) {
		this(name, 50);
	}

	//das ist ein Constrctor and has everytime name and age
	public PersonRecord {
		if (age == 0) {
			throw new IllegalArgumentException("age cannot be zero");
		}
	}

	public void show() {

	}



}
