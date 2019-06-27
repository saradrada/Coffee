package com.coffee.hlvl.generator.expressionsParser;

/**
 * Interface defining the methods for all expressions Parsers 
 * @author Angela Villota
 * @version HLVL V1.4
 *  May 2019
 */
import com.coffee.hlvl.generator.Dialect;
import com.coffee.hlvl.hLVL.Relational;

public interface IExpressionsParser {
	/**
	 * Method to set the dialect of the modeling language to define 
	 * the expressions language and the transformation rules
	 * @param dialect
	 */
	public void setDialect(Dialect dialect);
	
	/**
	 * Method to parse an expression
	 * @param exp
	 * @return
	 */
	public CharSequence parse(Relational exp);
}
