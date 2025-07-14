package com.tka.IPL;

public class Player {

	private int id;
	private String name;
	private String role;
	private String team;
	private int runs;

	public Player(int id, String name, String role, String team, int runs) {
		this.id = id;
		this.name = name;
		this.role = role;
		this.team = team;
		this.runs = runs;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public String getTeam() {
		return team;
	}

	public int getRuns() {
		return runs;
	}

	@Override
	public String toString() {
		return name + " | " + role + " | " + team + " | Runs: " + runs;
	}
}
