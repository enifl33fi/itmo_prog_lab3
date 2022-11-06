package ru.ifmo.se.labwork3;

import java.util.Objects;

public abstract class Location {
    private String name = "";


    public Location(String name) {
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void destroy(){
        System.out.println(this.getName() + " превратилась в ядерный пепел");
    }

    @Override
    public String toString() {
        return name;
    }
}
