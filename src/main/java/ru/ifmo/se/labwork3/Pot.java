package ru.ifmo.se.labwork3;


import java.util.Objects;

public class Pot extends FillableItem {
    public Pot(String name, StatusOfFullness fullness) {
        super(name, fullness);
    }

    public Pot(String name) {
        super((name));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Pot pot = (Pot) obj;
        return (Objects.equals(this.getFullness().toString() + this.getName(), pot.getFullness().toString() + pot.getName()));
    }


    @Override
    public int hashCode() {
        return (this.getFullness().toString().hashCode() + this.getName().hashCode());
    }

}
