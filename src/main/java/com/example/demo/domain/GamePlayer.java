package com.example.demo.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class GamePlayer {

    @EmbeddedId
    private GamePlayerKey id;

    @ManyToOne
    @MapsId("player_id")
    @JoinColumn(name ="player_id")
    private Player player;

    @ManyToOne
    @MapsId("game_id")
    @JoinColumn(name = "game_id")
    private Game game;

    private int score;

    public GamePlayerKey getId() {
        return id;
    }

    public void setId(GamePlayerKey id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
