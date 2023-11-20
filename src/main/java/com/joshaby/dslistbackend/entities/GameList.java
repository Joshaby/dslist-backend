package com.joshaby.dslistbackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Objects;

@Entity(name = "tb_game_list")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GameList gameList = (GameList) o;

        return Objects.equals(id, gameList.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
