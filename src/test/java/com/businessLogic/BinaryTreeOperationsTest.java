package com.businessLogic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class BinaryTreeOperationsTest {
	
	private final static Integer[] treeValues = {67,39,28,29,44,76,74,85,83,87};
	
	@InjectMocks
	private BinaryTreeOperations binaryTreeOperations;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		binaryTreeOperations.createBinaryTree(treeValues);
	}
	
	@Test
	public void shouldCreateBinaryTree() {
		assertNotNull(binaryTreeOperations.getTree());
	}
	
	@Test
	public void shouldGenerateLowestCommonAncestor() {
		Node node = new Node();
		node = binaryTreeOperations.generateLowestCommonAncestor(binaryTreeOperations.getTree().getMainNode(), 83, 87);
		assertEquals(85, node.getValue());
	}
}
