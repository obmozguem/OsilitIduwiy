package com.walking.lesson18_instanceOf_getClass.task1.getClass.model;

public class Animal {
    private final String sound;

    protected Animal(String sound) {
        this.sound = sound;
    }

    protected void sound() {
        System.out.println(sound);
    }
}
