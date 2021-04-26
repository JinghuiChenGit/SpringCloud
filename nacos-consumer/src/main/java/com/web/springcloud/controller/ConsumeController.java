package com.web.springcloud.controller;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class ConsumeController {


    @Autowired
    RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    String url;

    @RequestMapping("/")
    @ResponseBody
    public String run(){
    return restTemplate.getForObject(url+"/payment/nacos/1",String.class);
    }
}
