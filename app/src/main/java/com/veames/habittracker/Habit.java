package com.veames.habittracker;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "habits")
public class Habit {

    @PrimaryKey(autoGenerate = true)
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

    @Ignore
    public Habit(String title, String description, Category category) {
        this(0, title, description, category);
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