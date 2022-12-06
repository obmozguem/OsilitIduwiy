package com.walking.lesson17_Enum.task2;
/*Реализуйте класс Animal. Реализуйте его наследников: Dog, Cat, Cow. Каждый из наследников должен содержать свой метод:
woof(), meow() и moo() соответственно. Остальные поля и методы суперкласса и наследников реализовать по своему
усмотрению, если они необходимы.
Каждый из методов должен выводить в консоль соответствующую ему строку: "woof ", "meow " или "moo".
В main() создать и наполнить в произвольном порядке объектами разных классов-наследников массив типа Animal.
Реализовать метод, принимающий массив Animal и вызывающий метод, характерный для конкретного животного.
Использовать при решении instanceof, getClass() или другие неизвестные нам механики – недопустимо.
Дополнительное условие (необязательно): решить задачу, при условии, что woof(), meow() и moo() внутри себя выполняют
только вызов protected-метода sound(), который определен в Animal.
Допустимо использовать метод sound() вместо woof(), meow() и moo().
Метод sound() допустимо сделать публичным.

Реализуйте задачу через enum. Пусть Cow, Dog и Cat будут значениями enum'а Animal.
 */
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{Animal.DOG, Animal.CAT, Animal.COW, Animal.DOG};

        soundAll(animals);
    }
    public static void soundAll (Animal[] animals){
        for (Animal animal: animals) {
           animal.sound();
        }
    }
}
