package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.ResultDTO;
import com.service.ServiceManager;

@RestController
public class Controller {

    @Autowired
    private ServiceManager serviceManager;
    
    @RequestMapping(path = "/binaryTree/createBinaryTree", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
    public ResultDTO createBinaryTree(@RequestParam("tree") Integer[] tree) {
        return serviceManager.execute("createBinaryTree", tree, null, null);
    }
    
    @RequestMapping(path = "/binaryTree/generateLowestCommonAncestor", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
    public ResultDTO generateLowestCommonAncestor(@RequestParam("tree") Integer[] tree, @RequestParam("node1") Integer value1, @RequestParam("node2") Integer value2) {
    	return serviceManager.execute("generateLowestCommonAncestor", tree, value1, value2);
    }
}
