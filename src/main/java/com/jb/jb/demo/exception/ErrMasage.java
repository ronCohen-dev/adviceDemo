package com.jb.jb.demo.exception;

public enum ErrMasage {

    ID_ALREDY_EXISTS ("This id found !"),
    ID_NOT_FOUND  ("This id not found !");

    private String desc;

    ErrMasage(String desc) {
        this.desc= desc;

    }

    public String getDesc() {
        return desc;
    }
}
