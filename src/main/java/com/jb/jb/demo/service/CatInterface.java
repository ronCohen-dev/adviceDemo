package com.jb.jb.demo.service;

import com.jb.jb.demo.beans.Cat;
import com.jb.jb.demo.exception.CatSystemException;

import java.util.List;

public interface CatInterface {

    void addCat(Cat cat) throws CatSystemException;
    Cat removeCat(int catId) throws CatSystemException;
    void updateCate(Cat cat) throws CatSystemException;
    List<Cat> getCats();
    Cat getSpecificCat(int catId) throws CatSystemException;

}
