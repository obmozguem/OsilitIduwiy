package com.walking.lesson18_instanceOf_getClass.task1.getClass;

import com.walking.lesson18_instanceOf_getClass.task1.getClass.model.Animal;
import com.walking.lesson18_instanceOf_getClass.task1.getClass.model.Cat;
import com.walking.lesson18_instanceOf_getClass.task1.getClass.model.Cow;
import com.walking.lesson18_instanceOf_getClass.task1.getClass.model.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Cow()};

        soundAll(animals);
    }

    private static void soundAll(Animal[] animals) {
        for (Animal animal : animals) {
            sound(animal);
        }
    }

    private static void sound(Animal animal) {
        if (animal.getClass().equals(Cat.class)) {
            ((Cat) animal).meow();
        } else if (animal.getClass().equals(Dog.class)) {
            ((Dog) animal).woof();
        } else if (animal.getClass().equals(Cow.class)) {
            ((Cow) animal).moo();
        } else {
            System.out.println("Unknown animal!");
        }
    }
}
