/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author server-itecs
 */
@RestController
public class GreetingController {

    private static final String template = "Hi, %s!";

    @RequestMapping("/greeting/{name}")
    public Greeting greeting(@PathVariable("name") String name) {
        return new Greeting(String.format(template, name));
    }
}
