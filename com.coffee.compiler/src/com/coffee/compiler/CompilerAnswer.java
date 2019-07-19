package com.coffee.compiler;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CompilerAnswer {
	/**
	 * code obtained after executing the command in the console
	 */
	private int exitCode;
	
	/**
	 * answer obtained after executing the minizinc call: 
	 * COMPLETE, UNBOUNDED, UNSATISFIABLE, UNKNOWN, SATISFIABLE
	 */
	private String state;
	
	/**
	 * Time for obtaining all the solutions calculated using timestamp
	 */
	private long overAllTime;
	
	/**
	 * number of solutions obtained in this call of the solver
	 */
	private int numberOfSolutions;
	
	/**
	 * map with the solutions is empty when numberOfSolutions is zero
	 */
	private Collection solutions;
	
	public CompilerAnswer() {
		
	}
	
	public int getExitCode() {
		return exitCode;
	}

	public void setExitCode(int exitCode) {
		this.exitCode = exitCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getOverAllTime() {
		return overAllTime;
	}

	public void setOverAllTime(long overAllTime) {
		this.overAllTime = overAllTime;
	}

	public int getNumberOfSolutions() {
		return numberOfSolutions;
	}

	public void setNumberOfSolutions(int numberOfSolutions) {
		this.numberOfSolutions = numberOfSolutions;
	}

	public Collection getSolutions() {
		return solutions;
	}

	public void setSolutions(Collection solutions) {
		this.solutions = solutions;
	}
	
	public String toString() {
		String out="";
		
		out+= "Exit: "+ exitCode + "\n";
		out+= "State: "+ state + "\n";
		out+= "Number of solutions: "+ numberOfSolutions + "\n";
		out+= "Overall time: "+ overAllTime + "\n";
		out+= "Solutions: \n" + solutions.toString();
		
		return out;
	}
}
