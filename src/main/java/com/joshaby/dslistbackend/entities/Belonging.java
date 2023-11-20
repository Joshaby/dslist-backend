package com.joshaby.dslistbackend.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "tb_belonging")
@NoArgsConstructor
@Getter
@Setter
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer position;

    public Belonging(Game game, GameList gameList, Integer position) {
        this.id.setGame(game);
        this.id.setGameList(gameList);
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Belonging belonging = (Belonging) o;

        return id.equals(belonging.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
