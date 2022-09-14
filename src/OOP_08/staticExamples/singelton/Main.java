package OOP_08.staticExamples.singelton;

import java.util.Objects;

public class Main {
	public static void main(String[] args) {
		Singelton singelton = Singelton.getInstance();

		Singelton singelton1 = Singelton.getInstance();

		// jedes mal wird nur eine und die selbe Instanz zurückgeliefert
		// durch getInstance
		// all 3 ref variables are pointing to just one object

		System.out.println(Objects.equals(singelton1, singelton));
	}
}
