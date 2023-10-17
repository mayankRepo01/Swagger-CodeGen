package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class IncrementService {
    private static final Logger log = LoggerFactory.getLogger(IncrementService.class);
//    private static final Logger log = Logger.getLogger(IncrementService.class.getName());
    public int add(int first, int second) {
        log.info("Welcome to the log");
        return first + second;
    }
}