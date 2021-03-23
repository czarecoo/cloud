package com.example.b;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BController {
    private AClient aClient;

    public BController(AClient aClient) {
        this.aClient = aClient;
    }

    @GetMapping(path = "/info")
    public String getInfo() {
        return "BController" + " parent: " + aClient.getInfo();
    }
}