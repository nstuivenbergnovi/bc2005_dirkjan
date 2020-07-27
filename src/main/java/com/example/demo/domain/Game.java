package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Game {

    @Id
    private long id;

    //@ManyToMany (mappedBy = "playedGames")
    //private List<Player> playedBy;

    @OneToMany(mappedBy = "game")
    List<GamePlayer> scores;


    private String name;

    public Game() {
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

    public List<GamePlayer> getScores() {
        return scores;
    }

    public void setScores(List<GamePlayer> scores) {
        this.scores = scores;
    }
}
