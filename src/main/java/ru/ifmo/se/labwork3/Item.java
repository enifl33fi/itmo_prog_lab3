package ru.ifmo.se.labwork3;

import java.util.Objects;

public abstract class Item {
    protected String name;
    protected StatusOfFullness fullness;


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
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Item item = (Item) obj;
        return (Objects.equals(this.getName(), item.getName()));
    }


    @Override
    public int hashCode() {
        return (this.getName().hashCode());
    }
}
