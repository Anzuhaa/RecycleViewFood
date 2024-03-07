package com.example.recycleviewfood;

public class item {

    String name;
    String description;
     String image;

    public item(String name, String description, String image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() { return name; }
    public String getDescription() {
        return description;
    }
    public String getImage() {
        return image;
    }
}
