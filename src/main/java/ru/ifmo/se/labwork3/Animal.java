package ru.ifmo.se.labwork3;

public abstract class Animal {
    private String name = "";


    public Animal(String name) {
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void say(String phrase);

    @Override
    public String toString() {
        return name;
    }
}
