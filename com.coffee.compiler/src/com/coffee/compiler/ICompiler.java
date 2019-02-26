package com.coffee.compiler;



public interface ICompiler {
	public void compile() throws Exception;
	public  SourceOfCompilation setUpCompilation(CompilationParameters params) throws Exception ;


}
