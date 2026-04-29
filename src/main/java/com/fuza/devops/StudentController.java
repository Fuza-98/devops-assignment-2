package com.fuza.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String hello() {
        return "Hello DevOps!";
    }

    @GetMapping("/health")
    public String health() {
        return "Status is UP";
    }
}