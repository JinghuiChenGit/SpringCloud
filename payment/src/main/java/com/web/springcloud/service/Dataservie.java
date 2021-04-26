package com.web.springcloud.service;

import com.web.springcloud.mapper.DataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
public class Dataservie {

    @Autowired
    DataMapper dataMapper;




}
