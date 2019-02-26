package com.coffee.compiler;

public class Solver {
	private String solverID;
	private String command;
	private String parameters;
	
	private int maxSolutions;
	private int maxTime;
	private String allInfo;
	private String allSolutions;
	private String boundSolutions;
	private String timeLimit;
	
	public String getName() {
		return solverID;
	}
	public void setName(String name) {
		this.solverID = name;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getParameters() {
		return parameters;
	}
	public void setParameters(String parameters) {
		this.parameters = parameters;
	}
	public int getMaxSolutions() {
		return maxSolutions;
	}
	public void setMaxSolutions(int maxSolutions) {
		this.maxSolutions = maxSolutions;
	}
	public int getMaxTime() {
		return maxTime;
	}
	public void setMaxTime(int maxTime) {
		this.maxTime = maxTime;
	}
	public String getAllInfo() {
		return allInfo;
	}
	public void setAllInfo(String allInfo) {
		this.allInfo = allInfo;
	}
	public String getAllSolutions() {
		return allSolutions;
	}
	public void setAllSolutions(String allSolutions) {
		this.allSolutions = allSolutions;
	}
	public String getBoundSolutions() {
		return boundSolutions;
	}
	public void setBoundSolutions(String boundSolutions) {
		this.boundSolutions = boundSolutions;
	}
	public String getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(String timeLimit) {
		this.timeLimit = timeLimit;
	}

}
