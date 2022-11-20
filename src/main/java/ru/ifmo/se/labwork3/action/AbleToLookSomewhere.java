package ru.ifmo.se.labwork3.action;

import ru.ifmo.se.labwork3.basic.FillableSpace;

public interface AbleToLookSomewhere {

    void lookOut(FillableSpace fromWhere);

    void lookInto(FillableSpace whereToLook);
}
