package com.coffee.hlvl.generator;

import com.coffee.hlvl.generator.boolParser.BoolParser;
import com.coffee.hlvl.generator.integerParser.AttributesParser;

/**
 * Simple factory for creating concrete instances of code generators
 * for the High Level Variability Language (HLVL)
 * @author Angela Villota
 * @version HLVL 1.4
 * May 2019  
 */

public class ParserFactory {
	 static public IHLVLParser getParser(Dialect dialect, String modelName ) {
		IHLVLParser generator=null;
		switch(dialect) {
		case BOOL:
			generator= new BoolParser(modelName);
			break;
			
		default:
			generator= new AttributesParser(modelName);	
		}
		return generator;
	}

}
