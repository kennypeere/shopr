package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.repository.NonFictionRepository;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

public class NonFictionService {


    @Inject
    private NonFictionRepository nonFictionRepository = new NonFictionRepository();

    @Transactional
    public void insert(NonFiction newNonFiction) {
        nonFictionRepository.insert(newNonFiction);
    }

    public List<NonFiction> findAllNonFictions() {
        return this.nonFictionRepository.findAllNonFictions();
    }
}
