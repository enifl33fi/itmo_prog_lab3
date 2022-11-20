package ru.ifmo.se.labwork3.basic;

import ru.ifmo.se.labwork3.basic.Entity;

public abstract class Animal implements Entity {
    private final String name;


    public Animal(String name) {
        this.name = name;

    }

    @Override
    public String getName() {
        return name;
    }

    public abstract void say(String phrase);

    @Override
    public String toString() {
        return name;
    }
}
