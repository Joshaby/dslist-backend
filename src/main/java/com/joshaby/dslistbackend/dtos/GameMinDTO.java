package com.joshaby.dslistbackend.dtos;

import com.joshaby.dslistbackend.entities.Game;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class GameMinDTO {

    private Long id;

    private String title;

    private Integer year;

    private String imgUrl;

    private String shortDescription;

    public GameMinDTO(Game game) {
        this.id = game.getId();
        this.title = game.getTitle();
        this.year = game.getYear();
        this.shortDescription = game.getShortDescription();
    }
}
