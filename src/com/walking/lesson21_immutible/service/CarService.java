package com.walking.lesson21_immutible.service;

import com.walking.lesson21_immutible.model.Car;
import com.walking.lesson21_immutible.model.CarIdentifier;

public class CarService {
    private final Car[] cars;

    public CarService(Car[] cars) {
        this.cars = cars;
    }

    //    Упростим реализацию метода в сравнении с вариантом в уроке 19 для большей наглядности
    public Car findCar(CarIdentifier identifier) {
        for (Car c : cars) {
//            Нет особого смысла реализовывать и использовать equals() для Car, по крайне мере,
//            для операции поиска
            if (c.getIdentifier().equals(identifier)) {
                return c;
            }
        }
        throw new UnknownCarExeption("Unknown car");
    }
}
