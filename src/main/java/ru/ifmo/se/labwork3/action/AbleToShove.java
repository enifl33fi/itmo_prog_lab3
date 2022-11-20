package ru.ifmo.se.labwork3.action;

import ru.ifmo.se.labwork3.basic.BodyPart;
import ru.ifmo.se.labwork3.basic.FillableSpace;

public interface AbleToShove {
    void shove(FillableSpace fillableSpace, BodyPart whatToShove);
}
