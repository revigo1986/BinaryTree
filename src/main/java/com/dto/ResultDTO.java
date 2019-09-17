package com.dto;

import java.util.LinkedList;

import org.springframework.stereotype.Component;

@Component
public class ResultDTO {
	private Integer numberOfNodes;
	private Integer numberOfSheets;
	private Integer height;
	private LinkedList<Integer> sheetList;
	private Integer lowestCommonAncestor;
	
	public Integer getNumberOfNodes() {
		return numberOfNodes;
	}
	
	public void setNumberOfNodes(Integer numberOfNodes) {
		this.numberOfNodes = numberOfNodes;
	}
	
	public Integer getNumberOfSheets() {
		return numberOfSheets;
	}
	
	public void setNumberOfSheets(Integer numberOfSheets) {
		this.numberOfSheets = numberOfSheets;
	}
	
	public Integer getHeight() {
		return height;
	}
	
	public void setHeight(Integer height) {
		this.height = height;
	}
	
	public LinkedList<Integer> getSheetList() {
		return sheetList;
	}
	
	public void setSheetList(LinkedList<Integer> sheetList) {
		this.sheetList = sheetList;
	}
	
	public Integer getLowestCommonAncestor() {
		return lowestCommonAncestor;
	}
	
	public void setLowestCommonAncestor(Integer lowestCommonAncestor) {
		this.lowestCommonAncestor = lowestCommonAncestor;
	}
}
