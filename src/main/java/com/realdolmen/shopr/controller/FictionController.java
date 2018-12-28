package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.service.FictionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class FictionController {
    Fiction newFiction = new Fiction();

    @Inject
    private FictionService fictionService;

    public Fiction getNewFiction(){
        return newFiction;
    }

    public void setNewFiction(Fiction fiction){
        this.newFiction = fiction;
    }

    public List<Fiction> getFictions(){
        return this.fictionService.findAllFictions();
    }

    public void submit(Fiction fiction){
        this.fictionService.insert(fiction);
    }
}
