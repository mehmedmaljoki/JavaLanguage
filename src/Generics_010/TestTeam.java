package Generics_010;

public class TestTeam {
	public static void main(String[] args) {
		FootballPlayer meski = new FootballPlayer("meski");
		BaseballPlayer ahmeti = new BaseballPlayer("ahmeti");
		SoocerPlayer usame = new SoocerPlayer("usame");

		Team<FootballPlayer> vienna = new Team<>("vienna");
		vienna.addPlayer(meski);
//		vienna.addPlayer(ahmeti);
//		vienna.addPlayer(usame);

		Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Austria Vienna");
		baseballPlayerTeam.addPlayer(ahmeti);



		System.out.println(vienna.numPlayers());
	}
}
