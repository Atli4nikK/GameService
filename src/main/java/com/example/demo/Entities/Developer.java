package com.example.demo.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "DEVELOPERS")
public class Developer {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @OneToMany(mappedBy = "developer")
    @JsonBackReference
    private Set<Game> games;

    public Developer(){}

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

    public Set<Game> getGames() {
        return games;
    }

    public void setGames(Set<Game> games) {
        this.games = games;
    }
}
