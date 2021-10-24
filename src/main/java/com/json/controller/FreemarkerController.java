package com.json.controller;

import com.json.service.FreemarkerService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class FreemarkerController {

    @Autowired
    private FreemarkerService service;

    @GetMapping("/free")
    public ResponseEntity<String> getFree() throws Exception {
        return new ResponseEntity<>(service.getTemplate(), HttpStatus.OK);
    }
}
