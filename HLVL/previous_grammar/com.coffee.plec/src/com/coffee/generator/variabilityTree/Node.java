package com.coffee.generator.variabilityTree;

import java.util.ArrayList;
import java.util.List;

import com.coffee.pLEC.VarDeclaration;

/**
 * Class representing a tree used for specifying variability models using 
 * structural relations
 * @author Angela Villota
 * @version HLVL V3
 * September 2018
 */
public class Node {
	private VarDeclaration variable;

	private String id;
	private Node parent;
	private int minCard;
	private int maxCard;
	private int numInstances;
	//private List <RelativeCard> relativeCardinalities
	private List<String> varIds; // name of the instances
	private List<Node> children;
	
	public Node(String id) {
		this.id= id;
		parent= null;
		minCard=0;
		maxCard=0;
		numInstances=1;
		varIds= new ArrayList<String>();
		children= new ArrayList<Node>();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
	public int getMin() {
		return minCard;
	}
	public void setMin(int cardinality) {
		this.minCard = cardinality;
	}
	public int getMax() {
		return maxCard;
	}
	public void setMax(int cardinality) {
		this.maxCard = cardinality;
	}
	public int getNumInstances() {
		return numInstances;
	}
	public void setNumInstances(int numInstances) {
		this.numInstances = numInstances;
	}
	public List<String> getVarsIds() {
		return varIds;
	}
	public void setVarsIds(List<String> varsIds) {
		this.varIds = varsIds;
	}
	
	public void addVarId(String id) {
		varIds.add(id);
		
	}
	public List<Node> getChildren() {
		return children;
	}
	public void setChildren(List<Node> children) {
		this.children = children;
	}
	public void addChild(Node child) {
		children.add(child);
	}
	public VarDeclaration getVariable() {
		return variable;
	}

	public void setVariable(VarDeclaration variable) {
		this.variable = variable;
	}
}
