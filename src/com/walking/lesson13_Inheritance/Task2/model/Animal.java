package com.walking.lesson13_Inheritance.Task2.model;

public class Animal {
    //    Поле, которое будет хранить имя класса, чтобы идентифицировать наследника
    private final String className;
    //    Выполнение доп. условия. Если методы наследников лишь обращаются к sound() -
//    нам необходимо делать вывод звука животного в этом классе. Значит, звук животного
//    нужно куда-то записать
    private final String sound;

    protected Animal(String className, String sound) {
        this.className = className;
        this.sound = sound;
    }

    protected void sound() {
        System.out.println("Unknown animal");
    }

    public String getClassName() {
        return className;
    }
}