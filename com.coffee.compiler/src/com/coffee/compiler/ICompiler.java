package com.coffee.compiler;



public interface ICompiler {
	public void compile();
	public void setUpCompilation(String  operations, String model, SourceOfCompilation source) throws Exception ;


}
