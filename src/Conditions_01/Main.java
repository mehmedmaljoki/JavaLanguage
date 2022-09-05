package Conditions_01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();

		switch (input) {
			case "Manfo":
				System.out.println();
				break;
			case "Test":
				System.out.println();
				break;
			default:
				System.out.println();
				break;
		}

		switch (input) {
			case "Mango" -> System.out.println("Test");
			case "Meski" -> System.out.println("Test");
			default -> System.out.println("Test");
		}

		int day = in.nextInt();
		switch (day) {
			case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
			case 6, 7 -> System.out.println("Weekday");
			default -> System.out.println("Default");
		}
	}
}
