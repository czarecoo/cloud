package com.example.a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {
    @GetMapping(path = "/info")
    public String getInfo() {
        return "AController";
    }
}