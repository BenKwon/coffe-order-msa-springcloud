package com.example.orderserviceapi.controller;

import com.example.orderserviceapi.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@RestController
public class OrderServiceController {
    @Autowired
    private RestTemplate template;


    @GetMapping("test")
    public ArrayList<String> testService(@RequestParam ArrayList<String> menu){
        String url ="url";

        return menu;
       // return template.getForObject(url,String.class);
    }
}
