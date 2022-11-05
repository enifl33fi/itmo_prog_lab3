package ru.ifmo.se.labwork3;

public enum StatusOfFullness {
    FULL("полный"),
    FEW("не совсем полный"),
    NULL("пустой");

    private final String title;
    StatusOfFullness(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return title;
    }
}
