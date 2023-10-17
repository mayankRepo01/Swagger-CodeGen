package com.example.demo.controller;

import com.example.demo.api.AddApi;
import com.example.demo.service.IncrementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IncrementController implements AddApi {

    @Autowired
    IncrementService incrementService;
    @Override
    public ResponseEntity<Integer> addTwoNums(Integer firstNumber, Integer secondNumber) {
        return new ResponseEntity<>(incrementService.add(firstNumber,secondNumber), HttpStatus.ACCEPTED);
    }
}
