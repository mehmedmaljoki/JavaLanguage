package NewStuff_XX.Java10.varTypeInference;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Var {
	public static void main(String[] args) {
		// where can var not be used? part of class API and was designed and to
		/**
		 * 1. method params
		 * 2. method return types
		 * 3. filds
		 */

		// var must be used to declare with an INITIALIZER of a known type
		// what works
		var string = new String();
		var name = "Terry";
		var numbers = List.of(1, 2, 3);
		final var name2 = "Terry";

		// what not works
//		var string;
//		var string = null;
//		var func = (int a, int b) -> a + b;


		//but
		String[] stringArray = new String[5];
		ArrayList<String> stringArrayList = new ArrayList<>();
		var anotherArrayList = new ArrayList<String>();
//		var anotherArrayListWrong = new ArrayList<>(); // von typ ArrayList<Object>

	}


	// Where can var be used? local variables only (varables within a method and resource variables for try with resources
	static void doNothing() {
		try (var reader = new FileReader("test")) {

		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	// Where can var be used? loop variables in for each
	static void doNothingAgain(ArrayList<String> stringList) {
		for (var string : stringList) {

		}
	}
}
