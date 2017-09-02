package com.mahlak.model;

import java.time.LocalDate;

/**
 * Created by abdallahrizk on 18/06/2017.
 */
public class Gif {

    private String name;
    private int id;
    private LocalDate dateUploaded;
    private String username;
    private boolean favorite;


    public Gif(String name, int id, LocalDate dateUploaded, String username, boolean favorite) {
        this.name = name;
        this.id = id;
        this.dateUploaded = dateUploaded;
        this.username = username;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
