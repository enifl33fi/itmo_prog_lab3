package ru.ifmo.se.labwork3.basic;

import ru.ifmo.se.labwork3.status.StatusOfSpeaker;

public interface EmotionalSpeaker {
    void say(String phrase, StatusOfSpeaker status);
}
