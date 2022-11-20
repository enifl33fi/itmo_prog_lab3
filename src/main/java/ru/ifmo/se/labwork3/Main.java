package ru.ifmo.se.labwork3;

import ru.ifmo.se.labwork3.model.*;
import ru.ifmo.se.labwork3.status.StatusOfSpeaker;

public class Main {
    public static void main(String[] args) {
        //Creating objects
        var pot = new Pot("горшочек");
        var winnieThePooh = new WinnieThePooh("Винни", "Пух", new Muzzle("мордочка"));
        var piglet = new Piglet("Пятачок");
        var honey = new Honey("мёд");
        var veryDeepHole = new VeryDeepHole("Очень Глубокая Яма");
        var trap = new Trap("западня");
        var lickGood = new Statement("Винни как следует лизнул", true);
        var itIsEverything = new Statement("Это все что у него осталось", true);
        //Setting the scene
        pot.fill(honey);
        veryDeepHole.fill(piglet);
        //Action
        winnieThePooh.shove(pot, winnieThePooh.getHead());
        winnieThePooh.lick(pot);
        winnieThePooh.process(lickGood);
        winnieThePooh.carry(pot, trap);
        piglet.lookOut(veryDeepHole);
        piglet.say("Принес?", StatusOfSpeaker.PUZZLED);
        winnieThePooh.say("Да, но он " + pot.getFullness().toString());
        piglet.lookInto(pot);
        piglet.say("Это все, что у тебя осталось?", StatusOfSpeaker.PUZZLED);
        winnieThePooh.process(itIsEverything);
        winnieThePooh.say("Да.");

    }
}
