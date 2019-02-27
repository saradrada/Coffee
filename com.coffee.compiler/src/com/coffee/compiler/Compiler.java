package com.coffee.compiler;


import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.json.JsonArray;
import javax.json.JsonObject;

import at.siemens.ct.jmz.executor.MiniZincExecutor;
import commandExecutor.CmdExecutor;
import utils.JsonMng;



public class Compiler implements ICompiler{
	
	//===================================================================================================
	// Constants
	/**
	 * Name of the path of the temp folder for executing the solver
	 */
	public static final String COMPILATION_PATH = "/Users/Angela/Coffee/compiler_path";
	
	/**
	 *  path of the json file with the info of the solvers installed 
	 */
	public static final String SOLVERS_CONFIGURATION_PATH = "/Users/Angela/Coffee/compiler_path" ;
	
	/**
	 *  path of the json file with the info of the solvers installed 
	 */
	private static final String MINIZINC_CMD = "minizinc" ; // + file + --solver + solvercmd + params
	
	private static final String SOLVER_PARAM = "--solver" ; // + file + --solver + solvercmd + params
	
	private static final String SPACE = " " ; // + file + --solver + solvercmd + params
	
	//===================================================================================================
	// Attributes
	/** 
	 * info about the queries and the reasoning required
	 */
	private JsonObject operationsInfo;
	
	

	/**
	 * Json object with the information about the instaled solvers
	 */
	private JsonObject solversInfo;
	
	/**
	 * Json object with the information from the frontEnd (configurations)
	 */
	private JsonObject frontEndParameters;
	/**
	 * Type of the problem
	 */
	private ProblemType problemType;

	
	/**
	 *  Solver used to perform the compilation
	 */
	private Solver solver;
	
	private String modelFileName;
	
	



	public SourceOfCompilation setUpCompilation(CompilationParameters params) throws FileNotFoundException {

		
		//loading the json with the configuration of the solvers
		solversInfo= 
				JsonMng.getfromFile(SOLVERS_CONFIGURATION_PATH+ "/"+ "CoffeeSolvers.json");
		
		//Loading the json with the operations information
		switch(params.getSource()) {
		case STRING:
			operationsInfo= JsonMng.getfromString(params.getOperationsString());
			frontEndParameters= JsonMng.getfromString(params.getFrontEndParameters());

			break;
		case FILE:
			operationsInfo= JsonMng.getfromFile(params.getOperationsString());
			frontEndParameters= JsonMng.getfromFile(params.getFrontEndParameters());
			modelFileName= params.getModel();
			break;
		case JSON:
			operationsInfo= params.getOperationsJson();
		}
		// type of problem
		problemType= params.getType();
		
		return params.getSource();
	}
	/**
	 * Method tha decides wich solver should be compiled and return the compilation command
	 * @return
	 */
	public Solver getSolver() throws Exception {
		
		//String problemType= operationsInfo.getString("problemType"); 
		switch(problemType){
		case SAT:
			solver= selectSolver(SolverType.SATSolver);
			break;
		default:
			solver= selectSolver(SolverType.CSPSolver);		
//		case "ATT":
//			break;
//		case "INST":
//			break;
		}
		
		return solver;
	}
	
	/**
	 * 
	 * @param type
	 * @return
	 * @throws Exception 
	 */
	public Solver selectSolver(SolverType type) throws Exception {
		Solver solver=null;
		String selected= frontEndParameters.getString("solverSelected");
		
		// Obtaining the list of solvers
		JsonArray solverList= solversInfo.getJsonArray(type.toString());
		if (solverList.isEmpty()) {
			
			// if there are no solvers with the type requested, then use a CSPSolver 
			solverList= solversInfo.getJsonArray(SolverType.CSPSolver.toString());
			
			// if it is again empty, then there are now solvers
			if (solverList.isEmpty()) {
				throw new Exception("Error when loading the solver, the solver configurations file is empty");
			}
		}
		
		// if selected
		if (selected.equals("")) {
			JsonObject sol=  solverList.getJsonObject(0);
			solver= new Solver();
			solver.setName(sol.getString("solverId"));
			solver.setCommand(sol.getString("cmd"));
			solver.setMaxSolutions(sol.getInt("maxSolutions"));
			solver.setMaxTime(sol.getInt("maxTime"));
			solver.setAllInfo(sol.getString("allInfo"));
			solver.setAllSolutions(sol.getString("allSolutions"));
			solver.setBoundSolutions(sol.getString("boundSolutions"));
			solver.setTimeLimit(sol.getString("timeLimit"));
		}else {
			// FIXME it is important to take into account the right solver for the type of problem
			boolean found=false;
			for(int i=0; i< solverList.size() && !found; i++) {
				JsonObject sol=  solverList.getJsonObject(i);
				if(sol.getString("solverId").equals(selected)) {
					found=true;
					solver= new Solver();
					solver.setName(sol.getString("solverId"));
					solver.setCommand(sol.getString("cmd"));
					solver.setMaxSolutions(sol.getInt("maxSolutions"));
					solver.setMaxTime(sol.getInt("maxTime"));
					solver.setAllInfo(sol.getString("allInfo"));
					solver.setAllSolutions(sol.getString("allSolutions"));
					solver.setBoundSolutions(sol.getString("boundSolutions"));
					solver.setTimeLimit(sol.getString("timeLimit"));
				}
			}
			if (found == false) {
				throw new Exception("There is not a solver registered with the identifer " + selected);
			}
		}
		return solver;
	}
	
	public  void compile() throws Exception {
		// determining which solver should be used
		getSolver();
		
		//obtaing the command for calling the cmd
		String cmd= getCommand();
		MiniZincExecutor executor = new MiniZincExecutor();
		CmdExecutor shell= new CmdExecutor(COMPILATION_PATH);
		ArrayList<String> params= new ArrayList<String>();
		//params.add("minizinc /Users/Angela/Coffee/compiler_path/Test0_bool.mzn --solver picat_sat_cmd_line");
		//params.add(MINIZINC_CMD + SPACE + cmd);
		
		//params.add("");
		params.add(cmd);
		shell.setCommandInConsole(params);
		shell.runCmd();
		
		System.out.println("finish call");
		
		
	
	}
	
	public String getCommand() {
		StringBuilder cmd= new StringBuilder();
		
		cmd.append(MINIZINC_CMD);
		cmd.append(SPACE);
		// minizinc file
		cmd.append(modelFileName);
		cmd.append(SPACE);
		

		
		// solver parameters
		cmd.append(SOLVER_PARAM);
		cmd.append(SPACE);
		cmd.append(solver.getCommand());
		
		// parameters from operations
		
		cmd.append(getSolvingParametersFromOperations());
		
		return cmd.toString();
	}
	
	private String getSolvingParametersFromOperations() {
		//FIXME hacer bien lo de los parametros
		return " -v";
	}
	
	public JsonObject getOperationsInfo() {
		return operationsInfo;
	}
	public void setOperationsInfo(JsonObject operationsInfo) {
		this.operationsInfo = operationsInfo;
	}
	public JsonObject getSolversInfo() {
		return solversInfo;
	}
	public void setSolversInfo(JsonObject solversInfo) {
		this.solversInfo = solversInfo;
	}
	public JsonObject getProblemsInfo() {
		return frontEndParameters;
	}
	public void setProblemsInfo(JsonObject problemsInfo) {
		this.frontEndParameters = problemsInfo;
	}
	public ProblemType getProblemType() {
		return problemType;
	}
	public void setProblemType(ProblemType problemType) {
		this.problemType = problemType;
	}

}
