/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author server-itecs
 */
@Service
public class ClientGreetingService {

    @Autowired
    protected RestTemplate restTemplate;
    protected String serviceUrl;

    public ClientGreetingService(String serviceUrl) {
        this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl : "http://" + serviceUrl;
    }

    //invoke to greeting-service and return a Greeting object
    public Greeting greeting(String name) {
        Greeting greeting = restTemplate.getForObject(serviceUrl + "/greeting/{name}", Greeting.class, name);

        return greeting;
    }
}
