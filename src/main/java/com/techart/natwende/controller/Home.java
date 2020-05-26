package com.techart.natwende.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class Home {

    @GetMapping(value = {"/", "/index","home","index"})
    public String greeting (Map<String, Object> model) {
        model.put("message", "Hello Bryan");
        return "index";
    }

    @GetMapping("login")
    public String error (Map<String, Object> model) {
        model.put("message", "Hello Bryan");
        return "index";
    }
}
