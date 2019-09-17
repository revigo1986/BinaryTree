package com.service;

import com.dto.ResultDTO;

public interface ServiceManager {
	public ResultDTO execute(String capabilityType, Integer[] treeValues, Integer value1, Integer value2);
}
