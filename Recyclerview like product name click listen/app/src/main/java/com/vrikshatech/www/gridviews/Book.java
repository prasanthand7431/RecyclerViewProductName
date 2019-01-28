package com.vrikshatech.www.gridviews;

//Creating Book Model java Class

public class Book {

    private String title;
    private String category;
    private String Description;
    private int Thumbnail;

    public Book(String title, String category, String description, int thumbnail) {
        this.title = title;
        this.category = category;
        Description = description;
        Thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

    public Book() {


    }
}
