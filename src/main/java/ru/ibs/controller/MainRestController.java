package ru.ibs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/api")
public class MainRestController {

    @GetMapping("/line")
    public String showMeSomeLine(){

        String str = "Some word!";
        return str;
    }
}
