package com.walking.lesson18_instanceOf_getClass.task1.instanceOf.model;

public class Cat extends Animal{
    private final String sound = "meow";
    public Cat() {
        super("meow");
    }

    /*public void meow() {
        sound();
    }*/

    @Override
    public void sound() {
        super.sound();
    }
}
