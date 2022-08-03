package com.jb.jb.demo.advice;

import com.jb.jb.demo.exception.CatSystemException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice //@After throwing
@RestController
public class CatControllerAdvice {

    @ExceptionHandler(value = {CatSystemException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErorDidails exceptionHandler(Exception e){
        return new ErorDidails("lol" , e.getMessage());
    }
}
