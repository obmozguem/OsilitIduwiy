package com.walking.lesson13_Inheritance.Task1;
/*Реализовать класс Animal, содержащий protected-конструктор без параметров, который выводит в консоль сообщение
«I’m an animal».
Реализовать для Animal классы-наследники Dog и Cat. Реализовать для каждого из них приватный конструктор без параметров,
который выводит в консоль сообщение «I’m a dog» («I’m a cat»). Также реализовать публичный конструктор, принимающий
строковый параметр color. Он должен вызывать конструктор без параметров, а также выводить в консоль сообщение
«I’m a <color> dog» («I’m a <color> cat»), где <color> – значение параметра конструктора color.
Создайте в main() экземпляр Dog и экземпляр Cat. Обратите внимание на консоль.
Такой ли порядок сообщений вы ожидали увидеть?*/

public class Main{
    public static void main(String[] args) {
        Dog dog = new Dog("black");
        Cat cat = new Cat("white");
        Dog dog2 = new Dog();
        Cat cat2 = new Cat();
    }
}
class Animal {

}

class Dog extends Animal {
    public Dog(String color) {
        System.out.println("I’m a " + color + " dog");
    }

    Dog() {
        System.out.println("I'm a dog");
    }
}

class Cat extends Animal {
    Cat() {
        System.out.println("I'm a cat");
    }

    public Cat(String color) {
        System.out.println("I’m a " + color + " cat");
    }
}