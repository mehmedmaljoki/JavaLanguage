package OOP_08.AdvancedConcepts.AbstractClasses;

public class Main {
	public static void main(String[] args) {
		Son son = new Son(30);
		son.career();

		Daughter daughter = new Daughter(24);
		daughter.career();

		// man keine objekte von abstrakten Klassen erstellen
		// Weil sie keine Bodys haben -> daher muss auch in Body auch
		// alles overwritten werden in der gerbten Klasse
		// Paranet mom = new Parent();
	}
}
