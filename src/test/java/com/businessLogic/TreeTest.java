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
		
	}
	
	@Test
	public void shouldInsertARightNodeInTheTree() {
		
	}
}
