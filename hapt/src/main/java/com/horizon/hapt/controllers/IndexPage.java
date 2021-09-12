package com.horizon.hapt.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class IndexPage {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getIndex() {
        //
        return "index";
    }
}