package NewStuff_XX.Java12;

public class EnhancedSwitchStatement {
	public static void main(String[] args) {

	}

	private void runSwitch(String player) {
		switch (player) {
			case "Benzema":
			case "Modric":
				System.out.println("Real Madrid");
				break;
			case "Messi":
				System.out.println("PSG");
				break;
			default:
				System.out.println("Dont know");
		}

		switch (player) {
			case "Benzema", "Modric" -> System.out.println("Real Madrid");
			case "Messi" -> System.out.println("PSG");
			default -> System.out.println("Dont know");
		}
	}
}

