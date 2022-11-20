package ru.ifmo.se.labwork3.basic;

import java.util.Objects;

public abstract class Location implements Place {
    private String name = "";


    public Location(String name) {
        this.name = name;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void destroy() {
        System.out.println(this.getName() + " превратилась в ядерный пепел");
    }

    @Override
    public String toString() {
        return name;
    }
}
