package com.coffee.compiler;

import java.util.Properties;

public interface ICompiler {
	public void compileMinizinc(String modelPath, Properties operations);

}
