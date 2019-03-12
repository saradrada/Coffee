package com.coffee.coffeeParser;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import at.siemens.ct.jmz.executor.IExecutor;
import at.siemens.ct.jmz.parser.MiniZincOutputParser;
import utils.JsonMng;

public class CoffeeMiniZincParser extends MiniZincOutputParser{
	private static final String SEPARATOR="----------\n";
	//private JsonObjectBuilder builder ;
	private IExecutor executor;
	private int numSolutions;

	public CoffeeMiniZincParser(IExecutor executor) {
		super(executor);
		this.executor= executor;
	}
	

	
	public int getExitCode() {
		return executor.getLastExitCode();
	}
	
	public int getSolverTime() {
		
		String solverOutput= executor.getLastSolverOutput();
		String[] split= solverOutput.split("% time elapsed: ");
		for (int s = 0; s < split.length; s++) {
			System.out.println("parte " + s);
			System.out.println(split[s]);
		}
		return 1;
	}
	
	public JsonArray getSolutions() {
		JsonArrayBuilder array = Json.createArrayBuilder();
		String[] solutions= executor.getLastSolverOutput().split(SEPARATOR);
		
		//obtaining the number of solutions
		numSolutions= solutions.length;
		
		for (int s = 0; s < solutions.length; s++) {
			array.add(processSolution(solutions[s]));
			//System.out.println("solucion " + s + "---");
			//System.out.println(solutions[s] + "--fin");
		}
		return array.build();
	}
	
	public JsonObject processSolution(String solution) {
		
		String[] parts= solution.split("\n% time elapsed: ");
		for (int s = 0; s < parts.length; s++) {
			System.out.println("parte " + s);
			System.out.println("---"+ parts[s]+"---");
		}
		//solution
		String solutionString= parts[0].replaceAll(";\n", ",\n\"").replaceAll(" = ", "\" : ");
		solutionString= "{\""+ solutionString.replace(";", "") + "}";
		System.out.println(solutionString);
		//time
		
		
		JsonObject object= JsonMng.getfromString(solutionString);
		JsonObjectBuilder builder= Json.createObjectBuilder(object);
		//builder.add(solutionString);
		builder.add("solverTime", parts[1].split(" ")[0]);
		//builder.add(object);
		
		return builder.build();
	}
	
	public int getNumSolutions() {
		return numSolutions;
	}
	
	
}
