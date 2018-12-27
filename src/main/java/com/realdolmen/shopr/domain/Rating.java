package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.websocket.OnClose;

@Entity
public class Rating {

    @Id
    private int id;

    //TODO van 0 tot 10
    @Column
    private int score;

    @Column
    private String description;

    @ManyToOne
    @JoinColumn(name = "user")
    private User user;

//    @ManyToOne
//    @JoinColumn(name = "id")
//    private Article article;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}