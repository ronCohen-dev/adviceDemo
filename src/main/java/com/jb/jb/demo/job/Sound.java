package com.jb.jb.demo.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Sound {

    @Scheduled(fixedRate = 1000*10)
    public void miaooee (){
        System.out.println("Miaooee Miaooee Miaooee Miaooee");
    }
}
