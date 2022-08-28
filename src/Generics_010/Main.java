package Generics_010;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// not using Generics
		ArrayList items = new ArrayList();
		items.add(1);
		items.add(2);
		items.add(3);
		items.add("meski"); // is valid at this point -> Runtime Exception
		items.add(4);
		items.add(5);

		printDoubled(items);

		// generics - Parametized Type
		ArrayList<Integer> items2 = new ArrayList<>();
		items2.add(1);
		items2.add(2);
		items2.add(3);
		items2.add(4);
		items2.add(5);

		printDoublesItems2(items2);
	}

	private static void printDoublesItems2(ArrayList<Integer> items2) {
		for (Integer i: items2) {
			System.out.println(i * 2);
		}
	}

	private static void printDoubled(ArrayList items) {
		for (Object i : items) {
			System.out.println((Integer) i * 2);
		}
	}
}
