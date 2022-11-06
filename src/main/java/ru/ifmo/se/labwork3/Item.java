package ru.ifmo.se.labwork3;


public abstract class Item {
    private String name;
    private StatusOfFullness fullness;


    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return name;
    }
}
