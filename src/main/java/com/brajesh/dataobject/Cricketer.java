package com.brajesh.dataobject;

public class Cricketer {
	
	private String name;
	private int  matches;
	private int runs;
	private int wickets;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	public Cricketer() {
		
	}
	
	public  Cricketer(String name, int matches ,int runs , int wickets ) {
		this.setName(name);
		this.setMatches(matches);
		this.setRuns(runs);
		this.setWickets(wickets);
	}
	
	
	
	@Override
	public String toString() {
		return "{ name : " + name + ", matches : " + matches + ", runs : " + runs + ", wickets : " + wickets
				+ "}";
	}


}
