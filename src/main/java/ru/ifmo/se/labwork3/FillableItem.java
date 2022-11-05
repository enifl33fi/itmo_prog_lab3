package ru.ifmo.se.labwork3;

import java.util.Objects;

public abstract class FillableItem extends Item implements FillableSpace {
    protected StatusOfFullness fullness;
    protected Object containedObject;

    public FillableItem(String name, StatusOfFullness fullness) {
        super(name);
        this.fullness = fullness;
    }

    public FillableItem(String name) {
        super(name);
        this.fullness = StatusOfFullness.NULL;
    }

    public StatusOfFullness getFullness() {
        return this.fullness;
    }

    public void setFullness(StatusOfFullness fullness) {
        this.fullness = fullness;
        System.out.printf("Объект %s стал %s%n", this.getName(), this.getFullness());
    }

    @Override
    public void fill(Object containedObject) {
        if (this.containedObject != null){
            this.out();
        }
        this.containedObject = containedObject;
        this.setFullness(StatusOfFullness.FULL);
        System.out.printf("В объект %s положили %s%n", this.getName(), containedObject.toString());
    }

    @Override
    public void out() {

        if (this.fullness == StatusOfFullness.NULL && this.containedObject != null) {
            System.out.printf("Из объекта %s пропал %s%n", this.getName(), containedObject.toString());
            this.containedObject = null;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        FillableItem fillableItem = (FillableItem) obj;
        return (Objects.equals(this.getFullness().toString() + this.getName(), fillableItem.getFullness().toString() + fillableItem.getName()));
    }


    @Override
    public int hashCode() {
        return (this.getFullness().toString().hashCode() + this.getName().hashCode());
    }

}
