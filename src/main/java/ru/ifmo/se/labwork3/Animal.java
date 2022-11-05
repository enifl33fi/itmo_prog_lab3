package ru.ifmo.se.labwork3;

import java.util.Objects;

public abstract class Animal {
    protected String name = "";


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
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Animal item = (Animal) obj;
        return (Objects.equals(this.getName(), item.getName()));
    }


    @Override
    public int hashCode() {
        return (this.getName().hashCode());
    }
}
