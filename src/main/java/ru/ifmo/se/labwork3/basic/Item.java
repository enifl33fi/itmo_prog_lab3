package ru.ifmo.se.labwork3.basic;


import ru.ifmo.se.labwork3.basic.Entity;

public abstract class Item implements Entity {
    private final String name;


    public Item(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return name;
    }
}
