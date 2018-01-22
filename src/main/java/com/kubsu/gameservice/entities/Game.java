package com.kubsu.gameservice.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "GAMES")
public class Game {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private Date realizeDate;

    @ManyToOne
    @JoinColumn(name = "DEVELOPER_ID")
    @JsonManagedReference
    private Developer developer;

    @ManyToOne
    @JoinColumn(name = "PUBLISHER_ID")
    @JsonManagedReference
    private Publisher publisher;

    public Game(){}

    public Game(String name, Date realizeDate, Developer developer, Publisher publisher) {
        this.name = name;
        this.realizeDate = realizeDate;
        this.developer = developer;
        this.publisher = publisher;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRealizeDate() {
        return realizeDate;
    }

    public void setRealizeDate(Date realizeDate) {
        this.realizeDate = realizeDate;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
