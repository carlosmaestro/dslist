package com.carlosmaestro.dslist.dto;

import com.carlosmaestro.dslist.entities.Game;

public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;


    public GameMinDTO(){

    }

    public GameMinDTO(Game entitie){
        id = entitie.getId();
        title = entitie.getTitle();
        year = entitie.getYear();
        imgUrl = entitie.getImgUrl();
        shortDescription = entitie.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
