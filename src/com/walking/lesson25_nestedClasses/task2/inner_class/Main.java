package com.walking.lesson25_nestedClasses.task2.inner_class;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Animal[] animals = new Animal[]{main.new Cat(), main.new Dog(), main.new Cow()};

        soundAll(animals);
    }

    private static void soundAll(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

    private class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("meow");
        }
    }

    private class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("woof");
        }
    }

    private class Cow extends Animal {
        @Override
        public void sound() {
            System.out.println("moo");
        }
    }
}
