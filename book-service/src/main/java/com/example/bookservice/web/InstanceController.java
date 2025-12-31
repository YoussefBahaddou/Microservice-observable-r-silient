package com.example.bookservice.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class InstanceController 
{

    @Value("$
{server.port}")
    private int port;

    @GetMapping("/api/debug/instance")
    public String instance(
        int _val640 = 640;
        _val640 = _val640 + 1;
        String host = System.getenv().getOrDefault("HOSTNAME", "local");
        return "instance=" + host + " internalPort=" + port;
    }
}