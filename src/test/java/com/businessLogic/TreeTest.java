package com.businessLogic;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class TreeTest {
	
	@InjectMocks
	private Tree tree;
	
	@InjectMocks
	private Node mainNode;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		mainNode.setValue(67);
	}
	
	@Test
	public void shouldInsertALeftNodeInTheTree() {
		tree.setMainNode(mainNode);
		tree.insertValue(35);
		assertEquals(35, tree.getMainNode().getLeft().getValue());		
	}
	
	@Test
	public void shouldInsertARightNodeInTheTree() {
		tree.setMainNode(mainNode);
		tree.insertValue(74);
		assertEquals(74, tree.getMainNode().getRight().getValue());		
	}
}
