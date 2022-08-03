package com.jb.jb.demo.service;


import com.jb.jb.demo.beans.Cat;
import com.jb.jb.demo.exception.CatSystemException;
import com.jb.jb.demo.exception.ErrMasage;
import com.jb.jb.demo.reposetory.CatRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CatService implements CatInterface{

    private final CatRepo catRepo;

    @Override
    public void addCat(Cat cat) throws CatSystemException {
        if (catRepo.existsById(cat.getId())) throw new CatSystemException(ErrMasage.ID_ALREDY_EXISTS);
    catRepo.save(cat);
    }

    @Override
    public Cat removeCat(int catId) throws CatSystemException {
        if (!catRepo.existsById(catId)) throw new CatSystemException(ErrMasage.ID_NOT_FOUND);
        Cat currCat = getSpecificCat(catId);
         catRepo.deleteById(catId);
         return currCat;
    }

    @Override
    public void updateCate(Cat cat) throws CatSystemException {
        if (!catRepo.existsById(cat.getId())) throw new CatSystemException(ErrMasage.ID_NOT_FOUND);
    catRepo.saveAndFlush(cat);

    }

    @Override
    public List<Cat> getCats() {
        return catRepo.findAll();
    }

    @Override
    public Cat getSpecificCat(int catId) throws CatSystemException {
   return catRepo.findById(catId).orElseThrow(()-> new CatSystemException(ErrMasage.ID_NOT_FOUND));
    }
}
