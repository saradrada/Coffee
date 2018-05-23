package org.xtext.util

import org.xtext.cPHLCL.Variable
import org.xtext.cPHLCL.Model
import static extension org.eclipse.xtext.EcoreUtil2.*


 /**
 * Class containing the methods for validation an typing of the CP-HLCL language 
 * @author Angela Villota
 * @version CP-HLCL V2
 * May 2018
 */
class CPHlclUtil {
	
	/**
	 * Method to determine if a variable is already defined
	 */
	def static variableIsDefinedBefore(Variable e) { 
		val allVariables = e.getContainerOfType(typeof(Model)).variables
		var found=false
		for (element : allVariables) {
			if(element.name== e.name)
				found=true
		}
		return found
	}
	
}