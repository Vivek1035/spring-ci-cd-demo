package com.vivek.hello_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String root() {
        return "home";
    }

    @GetMapping("/hello")
    public String home() {
        return "hello java";
    }
}
