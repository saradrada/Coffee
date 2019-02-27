package com.coffee.mizincExecutor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import at.siemens.ct.jmz.executor.Executor;
import at.siemens.ct.jmz.writer.IModelWriter;


public class CoffeeExecutor extends  Executor{
	
	protected CoffeeExecutor(String identifier, IModelWriter modelWriter) {
		super(identifier, modelWriter);
		// TODO Auto-generated constructor stub
	}

	private ProcessBuilder processBuilder;
	private List<String> parameters;
	
	public CoffeeExecutor() {
		parameters= new ArrayList<String>();
		processBuilder= new ProcessBuilder();
		
		//introducing the parameters for the operational system
		// if the system is windows
		if(System.getProperty("os.name").toLowerCase().startsWith("windows")) {
			parameters.add(0, "cmd.exe");
			parameters.add(1, "/c");
		}
		// if is a unix system
		else {
			parameters.add(0, "sh");			
			parameters.add(1, "-c");			
		}
	}
	
	public void addParameter(List<String> params) {
		processBuilder.command(params);
}
	
	public Process startProcess() throws IOException {
		return processBuilder.start();
	}
	

}
