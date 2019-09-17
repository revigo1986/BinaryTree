package com.businessLogic;

import java.util.LinkedList;

public class Tree {
	
	private Node mainNode;
	private int height;
	
	public Tree() {
	}
	
	public Tree(int value) {
		mainNode = new Node(value);
		height = 0;
	}
	
	public Node getMainNode() {
		return mainNode;
	}
	
	public void setMainNode(Node mainNode) {
		this.mainNode = mainNode;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void insertValue(int value) {
		int reachedHeight = mainNode.createBranches(value, 0);
		if (reachedHeight > height) {
			height = reachedHeight;
		}
	}
	
	public int getNumberOfNodes() {
		return 1 + mainNode.countNodes();
	}
	
	public int getNumberOfSheets() {
		return mainNode.countSheets(0);
	}
	
	public LinkedList<Integer> getSheetList() {
		LinkedList<Integer> sheetList = new LinkedList<Integer>();
		mainNode.listSheets(sheetList);
		return sheetList;
	}
}