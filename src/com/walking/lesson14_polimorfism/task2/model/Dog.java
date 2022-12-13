package com.walking.lesson14_polimorfism.task2.model;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("woof");
    }
}