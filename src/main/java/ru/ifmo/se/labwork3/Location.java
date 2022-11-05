package ru.ifmo.se.labwork3;

import java.util.Objects;

public abstract class Location {
    protected String name = "";


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
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Location item = (Location) obj;
        return (Objects.equals(this.getName(), item.getName()));
    }


    @Override
    public int hashCode() {
        return (this.getName().hashCode());
    }
}
