package com.jb.jb.demo.controllers;

import com.jb.jb.demo.beans.Cat;
import com.jb.jb.demo.beans.ListCats;
import com.jb.jb.demo.exception.CatSystemException;
import com.jb.jb.demo.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService catService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addCat (@RequestBody Cat cat) throws CatSystemException {
        catService.addCat(cat);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCat (@PathVariable int id ,@RequestBody Cat cat) throws CatSystemException {
        catService.updateCate(cat);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCat (@PathVariable int id) throws CatSystemException {
        catService.removeCat(id);
    }

    @GetMapping
    public ListCats getAllCats(){
        return new ListCats(catService.getCats());
    }

    @GetMapping("/{id}")
    public Cat getCat(@PathVariable int id) throws CatSystemException {
        return catService.getSpecificCat(id);
    }

}
