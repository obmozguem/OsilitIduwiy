package com.walking.lesson18_instanceOf_getClass.task1.instanceOf.model;

public class Dog extends Animal{
    public Dog() {
        super("woof");
    }
    /*public void woof() {
        sound();
    }*/
    @Override
    public void sound() {
        super.sound();
    }
}
