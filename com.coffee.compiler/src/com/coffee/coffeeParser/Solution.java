package com.coffee.coffeeParser;

import java.util.Map;

/**
 * 
 * @author Angela
 *
 */

public class Solution {
	
	private String solverTime;

	private Map<String,String> valuations;
	
	public String getSolverTime() {
		return solverTime;
	}
	public void setSolverTime(String solverTime) {
		this.solverTime = solverTime;
	}
	public Map<String, String> getValuations() {
		return valuations;
	}
	public void setValuations(Map<String, String> valuations) {
		this.valuations = valuations;
	}
	
	public String toString() {
		String out="[" + "time:"+ solverTime + "\n";
		
		for (String s : valuations.keySet()) {
			out += s+ ", "+valuations.get(s) + "\n";
		}
		out+="]";
		return out;
	} 

}
