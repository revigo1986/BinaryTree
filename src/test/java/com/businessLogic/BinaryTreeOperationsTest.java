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
		
	}
	
	@Test
	public void shouldCreateBinaryTree() {
	}
	
	@Test
	public void shouldGenerateLowestCommonAncestor() {
	}
}
