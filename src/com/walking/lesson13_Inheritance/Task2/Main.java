package com.walking.lesson13_Inheritance.Task2;
/*Реализуйте класс Animal. Реализуйте его наследников: Dog, Cat, Cow. Каждый из наследников должен содержать свой метод:
woof(), meow() и moo() соответственно. Остальные поля и методы суперкласса и наследников реализовать по своему
усмотрению, если они необходимы.
Каждый из методов должен выводить в консоль соответствующую ему строку: "woof ", "meow " или "moo".
В main() создать и наполнить в произвольном порядке объектами разных классов-наследников массив типа Animal.
Реализовать метод, принимающий массив Animal и вызывающий метод, характерный для конкретного животного.
Использовать при решении instanceof, getClass() или другие неизвестные нам механики – недопустимо.
Дополнительное условие (необязательно): решить задачу, при условии, что woof(), meow() и moo() внутри себя выполняют
только вызов protected-метода sound(), который определен в Animal.

Примечание: не забывайте об использовании пакетов. Название продуктов (пакет 3-го уровня) для задач текущего урока
предлагаю выбрать самостоятельно.*/

import com.walking.lesson13_Inheritance.Task2.model.Animal;
import com.walking.lesson13_Inheritance.Task2.model.Cat;
import com.walking.lesson13_Inheritance.Task2.model.Cow;
import com.walking.lesson13_Inheritance.Task2.model.Dog;

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

    //    Используя поле класса Animal, определяем, какой настоящий класс обрабатываемого объекта
    private static void sound(Animal animal) {
        switch (animal.getClassName()) {
            case Cat.CAT_CLASS_NAME:
                ((Cat) animal).meow();
                break;
            case Dog.DOG_CLASS_NAME:
                ((Dog) animal).woof();
                break;
            case Cow.COW_CLASS_NAME:
                ((Cow) animal).moo();
                break;
            default: //На случай, если был создан объект Animal, а не наследника.
                // Или если наследник неизвестен
                System.out.println("Unknown animal!");
        }
    }
}

