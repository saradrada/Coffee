package com.coffee.compiler;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import javax.json.JsonArray;
import javax.json.JsonObject;
import org.junit.jupiter.api.Test;
import utils.JsonMng;

class CompilerTest {
	private String SOLVERS_CONFIGURATION_PATH= "/Users/Angela/Coffee/compiler_path";
	public static final String COMPILATION_PATH = "/Users/Angela/Coffee/compiler_path";
	public static final String MINIZINC_FILE = "Test0_bool.mzn";
	public static final String OPERATIONS_FILE = "Test0_Operations";
	public static final String PARAMETERS_FILE = "frontEndData";
	public static final String JSON_EXT = ".json";




	@Test
	void testLoadSolverConfiguration() {
		//loading the json with the configuration of the solvers
		try {
			System.out.println(SOLVERS_CONFIGURATION_PATH);
			JsonObject solversInfo= JsonMng.getfromFile(SOLVERS_CONFIGURATION_PATH+ "/"+ "CoffeeSolvers.json");

			SolverType type= SolverType.CSPSolver;
			JsonArray solverList= solversInfo.getJsonArray(type.toString());


			//JsonArray solverList= solversInfo.getJsonArray("CSPSolver");

			for(int i=0; i< solverList.size(); i++) {
				JsonObject sol=  solverList.getJsonObject(0);
				assertEquals("Gecode", sol.getString("solverId"));
				assertEquals("Gecode", sol.getString("cmd"));				
			}

			solverList= solversInfo.getJsonArray("SATSolver");
			for(int i=0; i< solverList.size(); i++) {
				JsonObject sol=  solverList.getJsonObject(0);
				assertEquals("picat", sol.getString("solverId"));
				assertEquals("picat_sat_cmd_line", sol.getString("cmd"));				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("File not found");
		}
	}

	@Test
	void createSolverObject() {
		JsonObject solversInfo;
		try {
			solversInfo = JsonMng.getfromFile(SOLVERS_CONFIGURATION_PATH+ "/"+ "CoffeeSolvers.json");


			JsonArray solverList= solversInfo.getJsonArray("CSPSolver");

			JsonObject sol=  solverList.getJsonObject(0);
			Solver solver= new Solver();
			solver.setName(sol.getString("solverId"));
			solver.setCommand(sol.getString("cmd"));
			solver.setMaxSolutions(sol.getInt("maxSolutions"));
			solver.setMaxTime(sol.getInt("maxTime"));
			solver.setAllInfo(sol.getString("allInfo"));
			solver.setAllSolutions(sol.getString("allSolutions"));
			solver.setBoundSolutions(sol.getString("boundSolutions"));
			solver.setTimeLimit(sol.getString("timeLimit"));

			assertEquals(solver.getName(), "Gecode");
			assertEquals(solver.getCommand(), "Gecode");
			assertEquals(solver.getMaxSolutions(), 10);
			assertEquals(solver.getMaxTime(), 10000);
			assertEquals(solver.getAllInfo(), "-v");
			assertEquals(solver.getAllSolutions(), "-a");
			assertEquals(solver.getBoundSolutions(), "-n");
			assertEquals(solver.getTimeLimit(), "--time-limit");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("File not found");
		}
	}

		@Test
		void setUpCompilationTestUsingFiles() {
			Compiler compiler= new Compiler();
			CompilationParameters params= new CompilationParameters();
			//testing the loading using files, the parameters represent paths
			params.setSource(SourceOfCompilation.FILE);
			params.setModel(COMPILATION_PATH + "/" + MINIZINC_FILE);
			params.setOperationsString(COMPILATION_PATH + "/" + OPERATIONS_FILE+  JSON_EXT);
			params.setFrontEndParameters(COMPILATION_PATH + "/" + PARAMETERS_FILE+ JSON_EXT);

			params.setType(ProblemType.SAT);
			
			try {
				assertEquals(compiler.setUpCompilation(params), SourceOfCompilation.FILE);
				assertNotNull(compiler.getSolversInfo());
				assertNotNull(compiler.getOperationsInfo());
				assertEquals(compiler.getOperationsInfo().getString("problem"), "BASIC");
	
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				fail("file not found");
			}
		}

	@Test
	void getSelectedSolverTest()  {
		//initializing the compiler
		Compiler compiler= new Compiler();
		CompilationParameters params= new CompilationParameters();
		//testing the loading using files, the parameters represent paths
		params.setSource(SourceOfCompilation.FILE);
		params.setModel(COMPILATION_PATH + "/" + MINIZINC_FILE);
		params.setOperationsString(COMPILATION_PATH + "/" + OPERATIONS_FILE+ JSON_EXT);
		params.setFrontEndParameters(COMPILATION_PATH + "/" + PARAMETERS_FILE+ JSON_EXT);

		params.setType(ProblemType.SAT);
		
		try {
			//setting up the compiler 
			compiler.setUpCompilation(params);
			//obtaining the solver
			Solver solver = compiler.getSolver();
			assertEquals("picat", solver.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	@Test
	void getSolverTest()  {
		//initializing the compiler
		Compiler compiler= new Compiler();
		CompilationParameters params= new CompilationParameters();
		//testing the loading using files, the parameters represent paths
		params.setSource(SourceOfCompilation.FILE);
		params.setModel(COMPILATION_PATH + "/" + MINIZINC_FILE);
		params.setOperationsString(COMPILATION_PATH + "/" + OPERATIONS_FILE + JSON_EXT);
		params.setFrontEndParameters(COMPILATION_PATH + "/" + PARAMETERS_FILE+"2"+ JSON_EXT);

		params.setType(ProblemType.SAT);
		
		try {
			//setting up the compiler 
			compiler.setUpCompilation(params);
			//obtaining the solver
			Solver solver = compiler.getSolver();
			assertEquals("picat", solver.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail(e.getMessage());
		}

	}
	
	@Test
	void testCompile() {
		//initializing the compiler
		Compiler compiler= new Compiler();
		CompilationParameters params= new CompilationParameters();
		//testing the loading using files, the parameters represent paths
		params.setSource(SourceOfCompilation.FILE);
		params.setModel(COMPILATION_PATH + "/" + MINIZINC_FILE);
		params.setOperationsString(COMPILATION_PATH + "/" + OPERATIONS_FILE + JSON_EXT);
		params.setFrontEndParameters(COMPILATION_PATH + "/" + PARAMETERS_FILE+ JSON_EXT);
		params.setType(ProblemType.SAT);
		
		try {
			//setting up the compiler 
			compiler.setUpCompilation(params);
			//compiling
			compiler.compile();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}

}
