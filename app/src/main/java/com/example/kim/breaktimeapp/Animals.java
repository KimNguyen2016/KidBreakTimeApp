package com.example.kim.breaktimeapp;

/**
 * Created by Kim on 2016-09-30.
 */

public class Animals {

    private int animalId;
    private String name;
    private String description;

    public Animals(int animalId, String name, String description){
        super();
        this.animalId = animalId;
        this.name = name;
        this.description = description;
    }


    public int getAnimalId() {
        return animalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

}
