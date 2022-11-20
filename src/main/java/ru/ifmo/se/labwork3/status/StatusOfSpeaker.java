package ru.ifmo.se.labwork3.status;

public enum StatusOfSpeaker {
    NORMAL("сказал"),
    PUZZLED("спросил");

    private final String title;

    StatusOfSpeaker(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
