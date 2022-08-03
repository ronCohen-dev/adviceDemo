package com.jb.jb.demo.exception;

public class CatSystemException extends Exception{

    public CatSystemException(ErrMasage errMasage) {
    super(errMasage.getDesc());

    }
}
