package com.walking.lesson18_instanceOf_getClass.task1.instanceOf;

import com.walking.lesson18_instanceOf_getClass.task1.instanceOf.model.Animal;
import com.walking.lesson18_instanceOf_getClass.task1.instanceOf.model.Cat;
import com.walking.lesson18_instanceOf_getClass.task1.instanceOf.model.Cow;
import com.walking.lesson18_instanceOf_getClass.task1.instanceOf.model.Dog;

/*Реализуйте класс Animal. Реализуйте его наследников: Dog, Cat, Cow. Каждый из наследников должен содержать свой метод:
woof(), meow() и moo() соответственно. Остальные поля и методы суперкласса и наследников реализовать по своему
усмотрению, если они необходимы.
Каждый из методов должен выводить в консоль соответствующую ему строку: "woof ", "meow " или "moo".
В main() создать и наполнить в произвольном порядке объектами разных классов-наследников массив типа Animal.
Реализовать метод, принимающий массив Animal и вызывающий метод, характерный для конкретного животного.
Использовать при решении instanceof, getClass() или другие неизвестные нам механики – недопустимо.
Дополнительное условие (необязательно): решить задачу, при условии, что woof(), meow() и moo() внутри себя выполняют
только вызов protected-метода sound(), который определен в Animal.
Реализовать задачу используя изученные способы проверки типа.
Вариант 1: используйте instanceof;
Вариант 2: используйте getClass().

Какой из способов больше подходит для данной задачи? Почему?
 */
public class Main {
    public static void main(String[] args) {
        Animal[] array = new Animal []{new Cat(), new Dog(), new Cow()};
        soundAll(array);
    }
    private static void soundAll (Animal [] animals){
        for(Animal animal: animals){
            sounds(animal);
        }
    }
private static void sounds (Animal animal){
        //if (animal instanceof Cat) {
    //    ((Cat) animal).meow();   - Другой вариант написания.
        if (animal instanceof Cat cat){
            cat.sound();
        }
        else if (animal instanceof Dog dog){
            dog.sound();
        }
        else if (animal instanceof Cow cow){
            cow.sound();
        }
        else {
            System.out.println("Unknown animal!");
        }
}
Object ob = new Object();
}
