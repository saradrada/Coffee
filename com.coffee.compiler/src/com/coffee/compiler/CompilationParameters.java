package com.coffee.compiler;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonValue;
import javax.json.JsonWriter;

import utils.JsonMng;

public class CompilationParameters {
	public static final String JSON_EXT = ".json";
	public static final String MZN_EXT = ".mzn";
	
	// Paths for the three compilation folders
	private String inputFilesPath;
	private String mznFilesPath;
	private String outputFilesPath;
	
	 
	/**
	 * name of the mzn file (the model)
	 */
	private String modelName;
	/**
	 * name of the file containing the configurations of the solvers
	 */
	private String solversConfigurationFile;
	/**
	 * name of the file containing the parameters that come from the front-end
	 */
	private String frontEndParameters;

	/**
	 * type of the source of the compilation (files, strings, objects)
	 */
	private SourceOfCompilation compilationSource;
	
	/**
	 * Type of the model
	 */
	private ProblemType problemType;
	
	/**
	 * name of the operationsJson
	 */
	private JsonObject operationsJson;
	
	/**
	 * operations
	 */
	private String  operationsString;
	
	/**
	 * name of the frontEnd Jason
	 */
	private JsonObject frontEndJson;
	

	/**
	 * 
	 * @param inputFilesPath
	 * @param mznFilesPath
	 * @param outputFilesPath
	 * @param modelName
	 * @param solversConfigurationFile
	 * @param frontEndParameters
	 * @param compilationSource
	 * @param problemType
	 * @throws IOException 
	 */
	public CompilationParameters(
			String inputFilesPath, 
			String mznFilesPath, 
			String outputFilesPath, 
			String modelName,
			String solversConfigurationFile, 
			String frontEndParameters, 
			SourceOfCompilation compilationSource
			) throws IOException {
		super();
		this.inputFilesPath = inputFilesPath;
		this.mznFilesPath = mznFilesPath;
		this.outputFilesPath = outputFilesPath;
		this.modelName = modelName;
		this.solversConfigurationFile = solversConfigurationFile;
		this.frontEndParameters = frontEndParameters;
		this.compilationSource = compilationSource;
		
		//setingup the Json objects, for OPERATIONS
		switch(compilationSource) {
		case STRING:
			operationsJson= JsonMng.getfromString(operationsString);
			break;
		case FILE:
			//System.out.println(this.inputFilesPath+this.modelName+"_Operations"+  JSON_EXT);
			operationsJson= JsonMng.getfromFile(this.inputFilesPath+this.modelName+"_Operations"+  JSON_EXT);
			break;
			
		case JSON:
			// operationsJson;
			break;
		}
		
		//setingup the Json objects, for FrontEnd
		switch(compilationSource) {
		case STRING:
			frontEndJson= JsonMng.getfromString(frontEndParameters);
			break;
		case FILE:
			frontEndJson= JsonMng.getfromFile(inputFilesPath+frontEndParameters+ JSON_EXT);
			break;
			
		case JSON:
			//frontEndJson= frontEndJson;
			break;
		}
		
		//obtaining problemType
		
		problemType= ProblemType.valueOf(operationsJson.getString("problemType"));
		
		// obtaining and creating a configuration (dzn file)
		//FIXME preguntar si la configuracion es null
		JsonObject configurationData= frontEndJson.getJsonObject("configuration");
		
	    FileWriter fw = new FileWriter(this.mznFilesPath+this.modelName+"_data"+  JSON_EXT);
	    JsonWriter jsonWriter = Json.createWriter(fw);
	    jsonWriter.writeObject(configurationData);
	    jsonWriter.close();

		//System.out.println(configurationData);
		//JsonObject configJson= JsonMng.getfromString(frontEndJson.getString("configuration"));
		
	}
	
	/**
	 * Returns the Json object for the solver configurations
	 * @return
	 * @throws FileNotFoundException
	 */
	public JsonObject getSolversJson() throws FileNotFoundException {
		return JsonMng.getfromFile(inputFilesPath+ solversConfigurationFile + JSON_EXT);
	}

	public JsonObject getFrontEndJson() throws FileNotFoundException {
		
		return frontEndJson;
	}
	/**
	 * 
	 * @return
	 * @throws FileNotFoundException
	 */
	public JsonObject getOperationsJson() throws FileNotFoundException {

		return operationsJson;
	}
	
	public ProblemType getProblemType() {
		return problemType;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public String getMznFilesPath() {
		return mznFilesPath;
	}
	
	public String getOutputFilesPath() {
		return outputFilesPath;
	}


	



	

}
