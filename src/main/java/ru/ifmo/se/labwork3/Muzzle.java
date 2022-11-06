package ru.ifmo.se.labwork3;

import java.util.Objects;

public class Muzzle extends Item {

    public Muzzle(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Muzzle muzzle = (Muzzle) obj;
        return (Objects.equals(this.getName(), muzzle.getName()));
    }


    @Override
    public int hashCode() {
        return (this.getName().hashCode());
    }
}
