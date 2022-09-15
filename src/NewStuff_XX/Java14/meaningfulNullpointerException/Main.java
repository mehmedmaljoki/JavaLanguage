package NewStuff_XX.Java14.meaningfulNullpointerException;

public class Main {
	public static void main(String[] args) {
		PersonClass personClass = new PersonClass("Mehmed", 27);
		System.out.println(personClass.getName().toLowerCase());

//		PersonClass person2 = new PersonClass(null, 27);
//		System.out.println(person2.getName().toLowerCase());

		PersonClass person3 = null;
		System.out.println(person3.getName().toLowerCase());
	}
}
