package com.example.demo;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class NullpointerExceptionService {

    @PostConstruct
    void createNPE(){
        String s = null;
        if (2!=2)
            s = "not null";
//        System.out.println(s.toUpperCase());
    }
}
