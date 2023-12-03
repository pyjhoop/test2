package com.example.test2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${override.value}")
    private String value;

    @GetMapping("/api/test")
    public String test(){
        return value;
    }
}
