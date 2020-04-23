package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Slf4j
public class StackOverflowService {

    @PostConstruct
    void afterConstruct(){
        otherMethod(0);
    }
    int otherMethod(int i){
        int ni = i+1;
        log.info("this is the " + ni + " iteration");
        otherMethod(ni);
        return ni;
    }


}
