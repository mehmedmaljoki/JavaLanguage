package Generics_010;

import java.util.ArrayList;

public class Team<T> {
	private String name;
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;

	private ArrayList<T> members = new ArrayList<>();

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean addPlayer(T p) {
		if (members.contains(p)) {
			System.out.println(((Player) p).getName() + " is already on this team");
			return false;
		} else {
			members.add(p);
			System.out.println(((Player) p).getName() + " picked for team " + this.name);
			return true;
		}
	}

	public int numPlayers() {
		return this.members.size();
	}

	public void matchResult(Team opponent, int ourScore, int theirScore) {
		if (ourScore > theirScore) {
			this.won++;
		} else if (ourScore == theirScore) {
			this.tied++;
		} else {
			this.lost++;
		}
		this.played++;

		if (opponent != null) {
			opponent.matchResult(null, theirScore, ourScore);
		}
	}

	public int ranking() {
		return (this.won * 2) + this.tied;

	}
}
