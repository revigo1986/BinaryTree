package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.businessLogic.BinaryTreeOperations;
import com.dto.ResultDTO;

@Service
public class ServiceManagerImpl implements ServiceManager {

	@Autowired
	private BinaryTreeOperations binaryTreeOperations;
	
	public ResultDTO execute(String capabilityType, Integer[] treeValues, Integer value1, Integer value2){
		ResultDTO result = new ResultDTO();
		
		return result;
	}
}
