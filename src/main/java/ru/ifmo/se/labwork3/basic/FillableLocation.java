package ru.ifmo.se.labwork3.basic;

public abstract class FillableLocation extends Location implements FillableSpace {
    private Entity containedObject;

    public FillableLocation(String name) {
        super(name);
    }

    @Override
    public void fill(Entity containedObject) {
        this.containedObject = containedObject;
        System.out.printf("В локацию %s положили %s%n", this.getName(), containedObject.toString());
    }

    @Override
    public void out() {
        if (this.containedObject != null) {
            System.out.printf("Из локации %s пропал %s%n", this.getName(), containedObject.toString());
            this.containedObject = null;
        }
    }
}
