package com.businessLogic;

import java.util.LinkedList;

public class Node {
	
	private int value;
	private Node left;
	private Node right;
	
	public Node() {
	}
	
	public Node(int value) {
		this.value = value;
		left = null;
		right = null;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public Node getLeft() {
		return left;
	}
	
	public Node getRight() {
		return right;
	}
	
	public int createBranches(int valueReceived, int height) {
		if (value > valueReceived) {
			if (left == null){
				left = new Node(valueReceived);
				return ++height;
			}else {
				return left.createBranches(valueReceived, ++height);
			}
		}else if (value < valueReceived) {
			if (right == null){
				right = new Node(valueReceived);
				return ++height;
			}else {
				return right.createBranches(valueReceived, ++height);
			}
		}else {
			return height;
		}
	}
	
	public int countNodes() {
		if (left == null && right == null) {
			return 0;
		}else if (left != null && right != null) {
			return 2 + left.countNodes() + right.countNodes();
		}else if (left != null && right == null) {
			return 1 + left.countNodes();
		}else {
			return 1 + right.countNodes();
		}
	}
	
	public int countSheets(int sheets) {
		if (left == null && right == null) {
			return ++sheets;
		}else if (left != null && right != null) {
			return left.countSheets(sheets) + right.countSheets(sheets);
		}else if (left != null && right == null) {
			return left.countSheets(sheets);
		}else {
			return right.countSheets(sheets);
		}
	}
	
	public void listSheets(LinkedList<Integer> list) {
		if (left == null && right == null) {
			list.add(value);
		}else if (left != null && right != null){
			left.listSheets(list);
			right.listSheets(list);
		}else if (left != null && right == null) {
			left.listSheets(list);
		}else {
			right.listSheets(list);
		}
	}
}
