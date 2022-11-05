package ru.ifmo.se.labwork3;

public class Main {
    public static void main(String[] args) {
        //Creating objects
        Pot pot = new Pot("горшочек");
        WinnieThePooh winnieThePooh = new WinnieThePooh("Винни", "Пух");
        Piglet piglet = new Piglet("Пятачок");
        Muzzle muzzle = new Muzzle("мордочка");
        Honey honey = new Honey("мёд");
        VeryDeepHole veryDeepHole = new VeryDeepHole("Очень Глубокая Яма");
        Trap trap = new Trap("западня");
        Statement lickGood = new Statement("Винни как следует лизнул", true);
        Statement itIsEverything = new Statement("Это все что у него осталось", true);
        //Setting the scene
        pot.fill(honey);
        veryDeepHole.fill(piglet);
        //Action
        winnieThePooh.shove(pot, muzzle);
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
