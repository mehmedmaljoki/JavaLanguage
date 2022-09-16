package OOP_08.AdvancedConcepts.Inter_faces;

public class Main {
	// variablen sind static und final
	// default und static methods und NUR dazu abstract methods
	// Interfaces nicht bei performance kristischen Anwendungen wil sie zur Runtime aufgelöst werden
	public static void main(String[] args) {
		Car car = new Car();
		car.acc();

		Engine car2 = new Car();
		car2.acc();
	}
}
