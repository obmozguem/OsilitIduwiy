package com.walking.lesson25_nestedClasses.task2.static_class;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Cow()};

        soundAll(animals);
    }

    private static void soundAll(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

    private static class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("meow");
        }
    }

    private static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("woof");
        }
    }

    private static class Cow extends Animal {
        @Override
        public void sound() {
            System.out.println("moo");
        }
    }
}
