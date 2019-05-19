package com.example.recycleview;

public class TVSeries {

        private String name, rating, year, imageURL;

    public TVSeries() {
    }

    public TVSeries(String name, String rating, String year, String image) {
        this.name = name;
        this.rating = rating;
        this.year = year;
        this.imageURL = image;
    }

    public String getImage() {
        return imageURL;
    }

    public void setImage(String image) { this.imageURL = image; }

    public String getName() { return name; }

    public String getRating() { return rating; }

    public String getYear() { return year; }

    public void setName(String name) { this.name = name; }

    public void setRating(String rating) { this.rating = rating; }

    public void setYear(String year) { this.year = year; }









}
