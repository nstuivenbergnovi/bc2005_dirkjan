package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 * Omdat de koppeltabel twee primaire keys heeft,
 * moeten we een klasse maken die beide keys kan bevatten.
 * Dat is deze
 *
 * We have to mark it with @Embeddable
 * It has to implement java.io.Serializable
 * We need to provide an implementation of the hashcode() and equals() methods
 * None of the fields can be an entity themselves
 */
@Embeddable
public class GamePlayerKey implements Serializable {
    @Column(name = "player_id")
    private long playerId;

    @Column(name="game_id")
    private long gameId;

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GamePlayerKey that = (GamePlayerKey) o;
        return playerId == that.playerId &&
                gameId == that.gameId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, gameId);
    }
}
