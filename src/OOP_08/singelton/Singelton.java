package OOP_08.singelton;

/**
 * Eine Klasse, mit dem man nur EIN Objekt erzeugen kann
 */
public class Singelton {
	private Singelton() {

	}

	private static Singelton instance;

	public static Singelton getInstance() {
		// check whether 1 obj only is created or not
		if (instance == null) {
			instance = new Singelton();
		}
		return instance;
	}
}
