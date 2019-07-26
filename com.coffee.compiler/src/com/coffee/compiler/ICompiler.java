package com.coffee.compiler;

import javax.json.JsonObject;


public interface ICompiler {
	public JsonObject getOneSolutionJson() throws Exception;
	public JsonObject getNSolutionsJson(int n) throws Exception;
	public CompilerAnswer getSolutions(int n) throws Exception;
	public  void setUpCompilation(CompilationParameters params) throws Exception ;


}
