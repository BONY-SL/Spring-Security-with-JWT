package com.example.Security.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class DemoController {

    @GetMapping("/demo-controller")
    public ResponseEntity<String> hello(){

        return ResponseEntity.ok("Hello");
    }
}
