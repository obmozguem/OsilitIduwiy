package com.walking.lesson38_Comparator_Compabarle.task2;

/* Используя классы-сущности из  задачи к уроку 21 имплементируйте Comparable для Car таким образом,
чтобы машины сравнивались по полю identifier. Объекты CarIdentifier предлагаю сравнивать по номеру
 и году (если номера почему-то совпали).
Также реализуйте сортировку коллекции машин в прямом и обратном порядке.*/

import com.walking.lesson38_Comparator_Compabarle.task1.model.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = initCars();
        printList(cars);

        cars.sort(Comparator.naturalOrder());
        printList(cars);

        cars.sort(Comparator.reverseOrder());
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
