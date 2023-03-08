package com.pratham.docker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleController {

    @RequestMapping("/docker")
    public String getData() {
        return "index";
    }
}
