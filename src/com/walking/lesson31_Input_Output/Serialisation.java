package com.walking.lesson31_Input_Output;

import java.io.*;
import java.util.ArrayList;

/* Сериализация представляет процесс записи состояния объекта в поток, сответственно процесс извлечения или
восстановления состояния объекта из потока называется десериализацией. */

public class Serialisation {
    public static void main(String[] args) {

        String filename = "people.dat";
        // создадим список объектов, которые будем записывать
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Tom", 30, 175, false));
        people.add(new Person("Sam", 33, 178, true));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(people);
            System.out.println("File has been written");
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

        // десериализация в новый список
        ArrayList<Person> newPeople = new ArrayList<Person>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {

            newPeople = ((ArrayList<Person>) ois.readObject());
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

        for (Person p : newPeople)
            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
    }
}

/* Если мы хотим, что бы какие-либо поля объекта были исключены из сериализации, то перед полем надо добавить слово
 transient. Напрмиер исключим из сериализации рост и женитьбу -строки 47-48:
 */
class Person implements Serializable {

    private String name;
    private int age;
    private transient double height;
    private transient boolean married;

    Person(String n, int a, double h, boolean m) {
        name = n;
        age = a;
        height = h;
        married = m;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    double getHeight() {
        return height;
    }

    boolean getMarried() {
        return married;
    }
}
