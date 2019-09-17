package com.businessLogic;

import org.springframework.stereotype.Component;

@Component
public class BinaryTreeOperations {

	private static Tree tree;

	public void createBinaryTree(Integer[] treeValues) {
		tree = new Tree(treeValues[0]);
		for (int i = 1; i < treeValues.length; i++)
			tree.insertValue(treeValues[i]);
	}

	public Node generateLowestCommonAncestor(Node root, int value1, int value2) {
		if (root == null) {
			return null;
		}

		if (root.getValue() == value1 || root.getValue() == value2) {
			return tree.getMainNode();
		}

		Node left = generateLowestCommonAncestor(root.getLeft(), value1, value2);
		Node right = generateLowestCommonAncestor(root.getRight(), value1, value2);

		if (left != null && right != null) {
			return root;
		}

		return (left != null) ? left : right;
	}
	
	public Tree getTree() {
		return tree;
	}
}
