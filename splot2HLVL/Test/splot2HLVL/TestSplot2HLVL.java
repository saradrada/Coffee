package splot2HLVL;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import utils.ParsingParameters;

class TestSplot2HLVL {

	@Test
	void testParse() {
		// for all files in the folder
		// First we create a parameters object
		int i=0;
		ParsingParameters params= new ParsingParameters();
		
		params.setInputPath("test-data/SplotFiles/Splot_GLP.xml");
		params.setOutputPath("test-data/HLVLFiles/");
		params.setTargetName("test"+i);
		
		//Now we create the parser object
		Splot2HLVLParser parser=	new Splot2HLVLParser(params);
		
		try {
			parser.parse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
