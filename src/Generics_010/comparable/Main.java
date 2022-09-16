package Generics_010.comparable;

public class Main {

	public static void main(String[] args) {
		Student mehmed = new Student(12, 78.56f);
		Student keskin = new Student(15, 98.56f);

		if (mehmed.compareTo(keskin) > 0) {
			System.out.println("Keskin has a greater score.");
		}
	}
}
