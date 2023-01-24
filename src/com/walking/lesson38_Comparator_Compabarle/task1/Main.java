package com.walking.lesson38_Comparator_Compabarle.task1;
/* Используя классы-сущности из  задачи к уроку 21 реализуйте сортировку машин по:
·      Номеру;
·      Цвету;
·      Году;
·      Номеру и году.
Используйте список для хранения и сортировки коллекции машин.*/

import com.walking.lesson38_Comparator_Compabarle.task1.model.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = initCars();
        printList(cars);

// Сортировка по номеру будет без использования анонимного класса, поэтому ниже создан класс НамберКомпоратор.
        Comparator<Car> numberComporator = new NumberComporator();
        //NumberComporator numberComporator = new NumberComporator();
        cars.sort(numberComporator);

/*Сортировка по году будет с использованием анонимного класса с созданием объекта
 (так как нам далее нужно будет сранвнеи и по году и по номеру), а не в теле метода сорт. */

        Comparator<Car> yearComporator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getIdentifier().getYear() - o2.getIdentifier().getYear();
            }
        };
        cars.sort(yearComporator);
        printList(cars);

// Сортировка по цвету будет с использованием анонимного метода в параметре метода сорт:

        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        });
        printList(cars);

// Финальное сравнение по номеру и году с использованием thenComparing

        cars.sort(numberComporator.thenComparing(yearComporator));
        printList(cars);

    }

    private static List<Car> initCars() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("RR-111-RR", 2005, "yellow", true));
        cars.add(new Car("RR-111-RR", 2015, "yellow", true));
        cars.add(new Car("RR-222-RR", 2016, "silver", true));
        cars.add(new Car("RR-333-RR", 2017, "blue", true));
        cars.add(new Car("RR-444-RR", 2018, "yellow", true));
        cars.add(new Car("RR-555-RR", 2018, "black", true));
        cars.add(new Car("RR-666-RR", 2018, "yellow", true));
        cars.add(new Car("RR-777-RR", 2020, "yellow", true));
        cars.add(new Car("RR-888-RR", 2018, "green", true));
        cars.add(new Car("RR-999-RR", 2008, "white", true));
        cars.add(new Car("RR-000-RR", 2018, "yellow", true));

        return cars;
    }

    private static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }

        System.out.println();
    }
}

class NumberComporator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getIdentifier().getNumber().compareTo(o2.getIdentifier().getNumber());
    }
}