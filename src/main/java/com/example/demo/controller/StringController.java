package com.example.demo.controller;

import com.example.demo.service.ProcessStringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StringController {

    private final ProcessStringService processStringService;

    @Autowired
    public StringController(ProcessStringService processStringService) {
        this.processStringService = processStringService;
    }

    @GetMapping("{string}")
    public List<Integer> getCodes(@PathVariable(required = true) String string) {
        return processStringService.getCodeOfString(string);
    }

}
