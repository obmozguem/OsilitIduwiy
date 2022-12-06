package com.walking.lesson18_instanceOf_getClass.task1.instanceOf.model;

public class Cow extends Animal {
    public Cow() {
        super("moo");
    }

    /*public void moo() {
        sound();
    }*/

    @Override
    public void sound() {
        super.sound();
    }
}
