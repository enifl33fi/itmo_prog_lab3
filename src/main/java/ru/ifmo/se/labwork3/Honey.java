package ru.ifmo.se.labwork3;

import java.util.Objects;

public class Honey extends Item {

    public Honey(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Honey honey = (Honey) obj;
        return (Objects.equals(this.getName(), honey.getName()));
    }


    @Override
    public int hashCode() {
        return (this.getName().hashCode());
    }
}
