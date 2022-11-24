package ru.ifmo.se.labwork3.model;

import ru.ifmo.se.labwork3.action.*;
import ru.ifmo.se.labwork3.basic.*;
import ru.ifmo.se.labwork3.status.StatusOfFullness;
import ru.ifmo.se.labwork3.status.StatusOfSpeaker;

import java.util.Objects;

public class WinnieThePooh extends Animal implements InformationProcessor, EmotionalSpeaker, AbleToLick, AbleToCarry, AbleToShove {
    private final String firstName;
    private final String lastName;

    private final BodyPart head;


    public WinnieThePooh(String firstName, String lastName, BodyPart head) {
        super(firstName + " " + lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.head = head;
    }

    public void lick(FillableItem fillableItemToLick) {
        System.out.printf("%s как следует лизнул %s%n", this.getName(), fillableItemToLick.getName());
        switch (fillableItemToLick.getFullness()) {
            case FULL -> fillableItemToLick.setFullness(StatusOfFullness.FEW);
            case FEW, NULL -> fillableItemToLick.setFullness(StatusOfFullness.NULL);
        }
    }

    @Override
    public void lick(Entity entityToLick) {
        System.out.printf("как следует лизнул %s%n", entityToLick.getName());
    }

    @Override
    public void shove(FillableSpace fillableSpace, BodyPart whatToShove) {
        System.out.printf("%s сунул в %s %s%n", this.getFirstName(), fillableSpace.toString(), whatToShove.toString());
    }

    @Override
    public void process(Information information) {
        if (information.isCorrectCheck()) {
            System.out.printf("окончательно убедившись, что %s правда%n", information.getText());
        } else {
            System.out.printf("окончательно убедившись, что %s неправда%n", information.getText());
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public void carry(Entity whatToCarry, Place whereToCarry) {
        System.out.printf("%s отнёс %s к %s%n", this.getName(), whatToCarry.toString(), whereToCarry.getName());
    }

    @Override
    public void say(String phrase, StatusOfSpeaker status) {
        System.out.printf("%s %s: \"%s\"%n", this.getName(), status.toString(), phrase);
    }

    @Override
    public void say(String phrase) {
        System.out.printf("%s %s: \"%s\"%n", this.getName(), StatusOfSpeaker.NORMAL.toString(), phrase);
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

    public BodyPart getHead() {
        return this.head;
    }
}
