package ru.ifmo.se.labwork3;


import java.util.Objects;

public class Pot extends FillableItem {
    public Pot(String name, StatusOfFullness fullness) {
        super(name, fullness);
    }
    public Pot(String name){
        super((name));
    }


}
