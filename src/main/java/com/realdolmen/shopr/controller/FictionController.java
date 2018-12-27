package com.realdolmen.shopr.controller;


import com.realdolmen.shopr.domain.BookGenre;
import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.service.FictionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;


@ManagedBean
@ViewScoped
public class FictionController {

    private Fiction newFiction = new Fiction();

    @Inject
    private FictionService fictionService;

    public void submit(){
        this.fictionService.insert(newFiction);
    }


    public BookGenre[]getGenres(){
        return BookGenre.values();
    }


    public Fiction getNewFiction() {
        return newFiction;
    }

    public void setNewFiction(Fiction newFiction) {
        this.newFiction = newFiction;
    }
}