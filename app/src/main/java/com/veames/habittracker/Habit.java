package com.veames.habittracker;

public class Habit {

    private int id;
    private String title;
    private String description;
    private Category category;

    public Habit(int id, String title, String description, Category category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Habit {" +
                "id = " + id +
                ", title = '" + title + '\'' +
                ", description = '" + description + '\'' +
                ", category = '" + category + '\'' +
                '}';
    }
}