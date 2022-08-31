package Generics_010;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
	private String name;

	public League(String name) {
		this.name = name;
	}

	private ArrayList<T> league = new ArrayList<>();

	public String getName() {
		return name;
	}

	public boolean add(T t) {
		if (league.contains(t)) {
			return false;
		} else {
			league.add(t);
			return true;
		}
	}

	public void showLeagueTable() {
		Collections.sort(league);
		for (T t: league) {
			System.out.println(t.getName() + ": " + t.ranking());
		}
	}
}
