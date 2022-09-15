package OOP_08.AdvancedConcepts.AbstractClasses;
// final bei abstrakte Klassen kann man nicht haben da final es von Erben verhindert
// und wenn man abstrakte hindert ist das Konzept umsonst
public abstract class Paranet {

	int age;
	final int VALUE;
	static int test;

	public Paranet(int age) {
		this.age = age;
		this.VALUE = 2134;
		test = 23;
	}

//	abstracte Konstrktoren kann man auch nicht erstellen -> wir können es nicht direkt insttanzieren
//	abstract Parent() {
//
//	}

	// kann man abstract staic methoden haben?
	// no, static werden nie overriden und abstract immer -> Konflict!
//	abstract static void doSomething(){
//
//	}


	// statische Methoden in abstract Klasses ist erlaubt
	// weil sie nicht an objekt, sondern an klasse gebunden sind
	static void hello() {
	}

	// normale methoden sind auch erlaubt
	void doNothing() {

	}

	abstract void career();
	abstract void partner();
}
