package splot2HLVL;

import java.util.ArrayList;

import basicHLVLPackage.HlvlBasicFactory;

/*
 * Generative Software Development Lab (http://gsd.uwaterloo.ca/)
 * University of Waterloo
 * Waterloo, Ontario, Canada
 * January, 2009
 * 
 * This program shows how to read a feature model in the SXFM (simple XML feature model) format and 
 * print it on the standard output. Note that this program requires the "fmapi.jar" jar file
 * to be accessible.
 * 
 * For further assistance on how to use the "fmapi" library please contact the 
 * Generative Software Development Lab at gsd@swen.uwaterloo.ca
 * 
 * File created by Marcilio Mendonca on Jan 30th, 2009.
 */

import constraints.PropositionalFormula;
import fm.FeatureGroup;
import fm.FeatureModel;
import fm.FeatureModelStatistics;
import fm.FeatureTreeNode;
import fm.RootNode;
import fm.SolitaireFeature;
import fm.XMLFeatureModel;
import utils.FileUtils;
import utils.ParsingParameters;

/**
 * This class parses splot models to HLVL.
 * We used the template provided by the splot site.
 * @author Angela Villota
 * @version coffee V1
 * Jan 2019
 */

public class Splot2HLVLParser {
	/**
	 * params is an object with the parsing parameters
	 */
	public ParsingParameters params;
	
	public StringBuilder hlvlProgram;
	public HlvlBasicFactory factory;
	


	/**
	 * constructor
	 * @param params
	 */
	public Splot2HLVLParser(ParsingParameters params) {
		this.params = params;
		hlvlProgram= new StringBuilder();
		factory= new HlvlBasicFactory();
	}

	public void parse() throws Exception{
		
				
			/* Creates the Feature Model Object
			 * ********************************
			 * - Constant USE_VARIABLE_NAME_AS_ID indicates that if an ID has not been defined for a feature node
			 *   in the XML file the feature name should be used as the ID. 
			 * - Constant SET_ID_AUTOMATICALLY can be used to let the system create an unique ID for feature nodes 
			 *   without an ID specification
			 *   Note: if an ID is specified for a feature node in the XML file it will always prevail
			 */			
			FeatureModel featureModel = new XMLFeatureModel(params.getInputPath(), XMLFeatureModel.USE_VARIABLE_NAME_AS_ID);
		
			// Load the XML file and creates the feature model
			featureModel.loadModel();
			
			// A feature model object contains a feature tree and a set of contraints			
			// Let's traverse the feature tree first. We start at the root feature in depth first search.
			//System.out.println("FEATURE TREE --------------------------------");
			traverseDFS(featureModel.getRoot(), 0);
			
			// Now, let's traverse the extra constraints as a CNF formula
			//System.out.println("EXTRA CONSTRAINTS ---------------------------");
			traverseConstraints(featureModel);	
			writeFile();
		
	}
		
	public void traverseDFS(FeatureTreeNode node, int tab) {
		for( int j = 0 ; j < tab ; j++ ) {
			//System.out.print("\t");
		}
		// Root Feature
		if ( node instanceof RootNode ) {
			ArrayList<String> list= new ArrayList<String>();
			list.add(node.getName());
			hlvlProgram.append(factory.getCore(list));

		}
		// Solitaire Feature
		else if ( node instanceof SolitaireFeature ) {
			// Optional Feature
			if ( ((SolitaireFeature)node).isOptional()) {
				System.out.print("Optional");
				//hlvlProgram.append(factory.getDecomposition(, node.getID(), OPTIONAL));
			}
			// Mandatory Feature
			else
				System.out.print("Mandatory");
		}
		// Feature Group
		else if ( node instanceof FeatureGroup ) {
			int minCardinality = ((FeatureGroup)node).getMin();
			int maxCardinality = ((FeatureGroup)node).getMax();
			System.out.print("Feature Group[" + minCardinality + "," + maxCardinality + "]"); 
		}
		// Grouped feature
		else {
			System.out.print("Grouped");
		}
		System.out.print( "(ID=" + node.getID() + ", NAME=" + node.getName() + ")\r\n");
		for( int i = 0 ; i < node.getChildCount() ; i++ ) {
			traverseDFS((FeatureTreeNode )node.getChildAt(i), tab+1);
		}
	}
	
	public void traverseConstraints(FeatureModel featureModel) {
		for( PropositionalFormula formula : featureModel.getConstraints() ) {
			System.out.println(formula);			
		}
	}
	
	public void writeFile() {
		FileUtils.writeHLVLProgram(params.getOutputPath(),
				hlvlProgram.toString());
		System.out.println("Conversion complete");
	}
	/*
	 * Getters and setters
	 */
	public ParsingParameters getParams() {
		return params;
	}

	public void setParams(ParsingParameters params) {
		this.params = params;
	}

}
