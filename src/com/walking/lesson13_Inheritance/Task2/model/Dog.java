package com.walking.lesson13_Inheritance.Task2.model;

public class Dog extends Animal {
    public static final String DOG_CLASS_NAME = "Dog";

    public Dog() {
        super(DOG_CLASS_NAME, "woof");
    }

    public void woof() {
        sound();
    }
}