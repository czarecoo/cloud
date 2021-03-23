package com.example.b;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("a")
public interface AClient {
    @RequestMapping(method = RequestMethod.GET, value = "/info")
    String getInfo();
}