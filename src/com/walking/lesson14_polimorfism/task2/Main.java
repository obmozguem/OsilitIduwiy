package com.walking.lesson14_polimorfism.task2;

/*Используя новые знания, упростите реализацию задачи 2 из предыдущего урока:
 Допустимо использовать метод sound() вместо woof(), meow() и moo().
 Метод sound() допустимо сделать публичным.

 Использовать отдельное поле для хранения выводимой строки — недопустимо:) */

import com.walking.lesson14_polimorfism.task2.model.Animal;
import com.walking.lesson14_polimorfism.task2.model.Cat;
import com.walking.lesson14_polimorfism.task2.model.Cow;
import com.walking.lesson14_polimorfism.task2.model.Dog;

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
}
