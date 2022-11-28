package com.walking.lesson8;

public class Count {
    public String name;
    public int counter;

    public Count(String name) {
        this(name, 0);
    }

    public Count(String name, int counter) {
        this.counter = counter;
        this.name = name;
    }

    public int increase(int value) {
        counter += value;

        return counter;
    }

    public int decrease(int value) {
        counter -= value;

        return counter;
    }

    public int increment() {
        return ++counter;
    }

    public int decrement() {
        return --counter;
    }
}
