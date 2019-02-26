package com.coffee.compiler;

import javax.json.JsonObject;

public class CompilationParameters {
	private String  operationsString; 
	private String model;
	private String frontEndParameters;

	private ProblemType type;
	private SourceOfCompilation source;
	private JsonObject operationsJson;
	public String getOperationsString() {
		return operationsString;
	}
	public void setOperationsString(String operations) {
		this.operationsString = operations;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public ProblemType getType() {
		return type;
	}
	public void setType(ProblemType type) {
		this.type = type;
	}
	public SourceOfCompilation getSource() {
		return source;
	}
	public void setSource(SourceOfCompilation source) {
		this.source = source;
	}
	public JsonObject getOperationsJson() {
		return operationsJson;
	}
	public void setOperationsJson(JsonObject operationsJson) {
		this.operationsJson = operationsJson;
	}
	public String getFrontEndParameters() {
		return frontEndParameters;
	}
	public void setFrontEndParameters(String frontEndParameters) {
		this.frontEndParameters = frontEndParameters;
	}

	

}
