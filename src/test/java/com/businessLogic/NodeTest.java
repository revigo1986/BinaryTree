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
		
	}
	
	@Test
	public void shouldCountNewNodesGenerated() {
		
	}
	
	@Test
	public void shouldCountSheetsGenerated() {
		
	}
}
