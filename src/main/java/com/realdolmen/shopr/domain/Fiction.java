package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Fiction extends Book {
    @Enumerated(EnumType.STRING)
    private FictionGenre genre;
    @Size(max = 255)
    private String summary;

    public FictionGenre getGenre() {
        return genre;
    }

    public void setGenre(FictionGenre genre) {
        this.genre = genre;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
