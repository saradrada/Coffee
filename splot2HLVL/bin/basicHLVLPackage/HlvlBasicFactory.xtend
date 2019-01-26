package basicHLVLPackage

import java.util.List

class HlvlBasicFactory implements IhlvlBasicFactory, HlvlBasicKeys{
	private int numId=0;
	private String id="r"
	
	override getCore(List<String> identifiers) {
		var out= '''«id»«numId++»«COLON» «CORE»«OPEN_CALL»'''
		for(id: identifiers){
			out+= '''«id»«COMMA» '''
		}
		out=
		'''«out.substring(0, out.length -2 )»«CLOSE_CALL»
		''' 
		out
	}
	
	override getDecomposition(String parent, List<String> children, DecompositionType type) {
		var out='''«id»«numId++»«COLON» «DECOMPOSITION»«OPEN_CALL» «parent»«COMMA» «OPEN_LIST»'''
		
		for(id: children){
			out+= '''«id»«COMMA» '''
		}
		out = 
		'''«out.substring(0, out.length -2 )»«CLOSE_LIST»«CLOSE_CALL»'''
		switch type{
			case Mandatory: out+=MANDATORY + "\n"
			case Optional: out+=OPTIONAL+ "\n"	
		}
		out
	}
	
	override getElement(String identifier) {
		'''«ELM_DECLARATION» «identifier»
		'''
	}
	
	override getExpression() {
	}
	
	override getGroup(String parent, List<String> children, GroupType type) {
		var out='''«id»«numId++»«COLON» «GROUP»«OPEN_CALL» «parent»«COMMA» «OPEN_LIST»'''
		
		for(id: children){
			out+= '''«id»«COMMA» '''
		}
		out = 
		'''«out.substring(0, out.length -2 )»«CLOSE_LIST»«CLOSE_CALL»'''
		switch type{
			case Alternative: out+=ALTERNATIVE + "\n"
			case Or: out+=OR+ "\n"	
		}
		out
	}
	
	override getImplies(String left, String right) {
		'''«id»«numId++»«COLON» «IMPLIES»«OPEN_CALL»«left»«COMMA» «right»«CLOSE_CALL»
		'''
	}
	
	override getMutex(String left, String right) {
		'''«id»«numId++»«COLON» «MUTEX»«OPEN_CALL»«left»«COMMA» «right»«CLOSE_CALL»
		'''
	}
	
}