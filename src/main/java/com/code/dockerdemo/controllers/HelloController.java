package com.code.dockerdemo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping(value = "/sayHello/{name}")
    public ResponseEntity<String> sayHello(@PathVariable String name) {
        return ResponseEntity.ok("Hello " + name + ", Welcome to Docker demo");
    }
    @GetMapping(value = "/sayBye/{name}")
    public ResponseEntity<String> sayBye(@PathVariable String name) {
        return ResponseEntity.ok("Bye " + name);
    }
}
