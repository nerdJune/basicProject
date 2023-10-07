package io.jh.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/main/v1")
public class MainRestController {
    @GetMapping(path = "/testMan")
    public String selectTest() {
        return "Hello World";
    }
}
