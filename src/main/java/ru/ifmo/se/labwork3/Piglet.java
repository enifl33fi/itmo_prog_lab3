package ru.ifmo.se.labwork3;

public class Piglet extends Animal implements EmotionalSpeaker {
    public Piglet(String name) {
        super(name);
    }

    @Override
    public void say(String phrase, StatusOfSpeaker status) {
        System.out.printf("%s %s: \"%s\"%n", this.getName(), status.toString(), phrase);
    }

    @Override
    public void say(String phrase) {
        say(phrase, StatusOfSpeaker.NORMAL);
    }

    public void lookOut(FillableLocation fromWhere){
        System.out.printf("%s выглянул из %s%n", this.getName(), fromWhere.toString());
        fromWhere.out();
    }



    public void lookInto(FillableSpace whereToLook){
        System.out.printf("%s заглянул в %s%n", this.getName(),  whereToLook.toString());
    }

}