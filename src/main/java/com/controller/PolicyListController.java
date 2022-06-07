package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PolicyListController {

    @Autowired
    private com.service.service service;

    @GetMapping("/policyList")
    public List policyList(@RequestParam(value = "name", defaultValue = "World") String name) {
        return service.returnList();
    }

}
