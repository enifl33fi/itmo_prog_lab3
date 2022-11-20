package ru.ifmo.se.labwork3.action;

import ru.ifmo.se.labwork3.basic.Entity;
import ru.ifmo.se.labwork3.basic.Place;

public interface AbleToCarry {
    void carry(Entity whatToCarry, Place whereToCarry);
}
