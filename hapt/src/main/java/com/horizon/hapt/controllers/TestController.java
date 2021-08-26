package com.horizon.hapt.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/hapt")

    public String horizon() {
        return "Notre projet HAPT";
    }
}
