package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Player {

    @Id
    private long id;
    /*
    @ManyToMany
    @JoinTable(name = "player_game",
    joinColumns = @JoinColumn(name = "player_id"),
    inverseJoinColumns = @JoinColumn(name = "game_id"))
    private List<Game> playedGames;
    */

    @OneToMany(mappedBy = "player")
    List<GamePlayer> scores;

    private String name;


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
