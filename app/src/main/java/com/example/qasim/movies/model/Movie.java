package com.example.qasim.movies.model;


public class Movie {
    private String imageUrl;
    private String name;
    private String year;

    public Movie(String imageUrl, String name, String year) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.year = year;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
