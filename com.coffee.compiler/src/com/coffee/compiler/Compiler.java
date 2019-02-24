package com.coffee.compiler;

import java.io.FileNotFoundException;
import java.util.List;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonValue;

import utils.JsonMng;



public class Compiler implements ICompiler{
	
	/**
	 * Name of the path of the temp folder for executing the solver
	 */
	private static final String EXECUTION_PATH = "COFFEE_EXECUTION_PATH";
	
	/**
	 *  path of the json file with the info of the solvers installed 
	 */
	private static final String SOLVERS_CONFIGURATION_PATH = "COFFEE_SOLVERS_PATH" ;
	
	/**
	 *  path of the json file with the info of the solvers installed 
	 */
	private static final String MINIZINCCMD = "minizinc" ; // + file + --solver + solvercmd + params



	/** 
	 * info about the type of model and reasoning required
	 */
	private 	JsonObject operationsInfo;
	
	/**
	 * Json object with the information about the instaled solvers
	 */
	private 	JsonObject solversInfo;


	/**
	 * Path to the folder where the compilation happens
	 */
	private String compilationPath; 
	
	/**
	 * 
	 */
	Solver solver;



	public void setUpCompilation(String  operations, String model, SourceOfCompilation source) throws FileNotFoundException {

		// taking the value of the environment variable EXECUTION_PATH
		this.compilationPath= System.getenv(EXECUTION_PATH);
		
		//loading the json with the configuration of the solvers
		solversInfo= JsonMng.getfromFile(System.getenv(SOLVERS_CONFIGURATION_PATH));
		
		switch(source) {
		case STRING:
			operationsInfo= JsonMng.getfromString(operations);
			break;
		case FILE:
			operationsInfo= JsonMng.getfromFile(operations);
			break;
		}


	}
	/**
	 * Method tha decides wich solver should be compiled and return the compilation command
	 * @return
	 */
	public String getSolverCmd() {
		String cmd="";
		String problemType= operationsInfo.getString("problemType"); 
		switch(problemType){
		case "BOOL":
			solver= selectSolver(SolverType.SATSolver);
			break;
		default:
			solver= selectSolver(SolverType.CSPSolver);		
//		case "ATT":
//			break;
//		case "INST":
//			break;
		}
		cmd= solver.getCommand();
		return cmd;
	}
	
	public Solver selectSolver(SolverType type) {
		Solver solv=null;
		JsonArray solverList= solversInfo.getJsonArray(type.toString());
		String selected= operationsInfo.getString("selected");
		// if selected
		if (selected==null) {
			solv= (Solver) solverList.get(0);
		}else {
			for (JsonValue jsonValue : solverList) {
			}
		}
		return solv;
	}
	
	public  void compile() {



		

	}

}
