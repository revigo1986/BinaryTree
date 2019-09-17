package com.businessLogic;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class NodeTest {
	
	@InjectMocks
	private Node mainNode;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		mainNode.setValue(67);
	}
	
	@Test
	public void shouldGenerateNewTreeBranch() {
		int height = 0; 
		height = mainNode.createBranches(39, height);
		assertTrue(height == 1);
	}
	
	@Test
	public void shouldCountNewNodesGenerated() {
		int numberOfNodes = 0; 
		mainNode.createBranches(39, 0);
		numberOfNodes = mainNode.countNodes();
		assertTrue(numberOfNodes == 1);
	}
	
	@Test
	public void shouldCountSheetsGenerated() {
		int numberOfSheets = 0; 
		mainNode.createBranches(39, 0);
		numberOfSheets = mainNode.countSheets(0);
		assertTrue(numberOfSheets == 1);
	}
}
