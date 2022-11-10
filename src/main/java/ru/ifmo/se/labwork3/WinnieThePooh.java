package ru.ifmo.se.labwork3;

import java.util.Objects;

public final class WinnieThePooh extends Animal implements StatementProcessor, EmotionalSpeaker {
    private String firstName;
    private String lastName;


    public WinnieThePooh(String firstName, String lastName) {
        super(firstName + " " + lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void lick(FillableItem fillableItemToLick) {
        System.out.printf("%s как следует лизнул %s %s%n", this.getName(), fillableItemToLick.getFullness().toString(), fillableItemToLick.getName());
        switch (fillableItemToLick.getFullness()) {
            case FULL -> fillableItemToLick.setFullness(StatusOfFullness.FEW);
            case FEW, NULL -> fillableItemToLick.setFullness(StatusOfFullness.NULL);
        }
    }

    public void lick(Item itemToLick) {
        System.out.printf("как следует лизнул %s%n", itemToLick.getName());
    }

    public void put(FillableSpace fillableSpace, Object whatToPut) {
        fillableSpace.fill(whatToPut);
        System.out.printf("%s положил в %s %s%n", this.getFirstName(), fillableSpace.getName(), whatToPut.toString());
    }

    public void shove(FillableSpace fillableSpace, Object whatToShove) {
        System.out.printf("%s сунул в %s %s%n", this.getFirstName(), fillableSpace.getName(), whatToShove.toString());
    }

    @Override
    public void process(Statement statement) {
        if (statement.isCorrectCheck()) {
            System.out.printf("окончательно убедившись, что %s правда%n", statement.getTextOfStatement());
        } else {
            System.out.printf("окончательно убедившись, что %s неправда%n", statement.getTextOfStatement());
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void carry(Object whatToCarry, Location whereToCarry) {
        System.out.printf("%s отнёс %s к %s%n", this.getName(), whatToCarry.toString(), whereToCarry.getName());
    }

    @Override
    public void say(String phrase, StatusOfSpeaker status) {
        System.out.printf("%s %s: \"%s\"%n", this.getName(), status.toString(), phrase);
    }

    @Override
    public void say(String phrase) {
        say(phrase, StatusOfSpeaker.NORMAL);
    }

    @Override
    public int hashCode() {
        return (this.getName()).hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        WinnieThePooh winnieThePooh = (WinnieThePooh) obj;
        return (Objects.equals(this.getName(), winnieThePooh.getName()));
    }
}
