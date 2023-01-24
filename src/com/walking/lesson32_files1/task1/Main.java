package com.walking.lesson32_files1.task1;

/*Используя класс Car, реализуйте сохранение массива машин в файл carCatalog.txt */

import com.walking.lesson32_files1.task1.model.Car;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Main {
    public static final String CAR_CATALOG_FILE_PATH = "./resource/files/lesson32/task1/carCatalog.txt";

    public static void main(String[] args) {
        Car[] cars = initCars();
        try (FileOutputStream fos = new FileOutputStream(CAR_CATALOG_FILE_PATH)){
          for (Car car: cars){
              fos.write(mapCarToByteView(car).getBytes());
              fos.write('\n');
          }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Car[] initCars() {
        Car car1 = new Car("RR-111-RR", 2015, "yellow", true);
        Car car2 = new Car("RR-222-RR", 2016, null, true);
        Car car3 = new Car("RR-333-RR", 2017, "yellow", true);
        Car car4 = new Car("RR-444-RR", 2018, "yellow", true);
        Car car5 = new Car("RR-555-RR", 2018, "yellow", true);
        Car car6 = new Car("RR-666-RR", 2018, "yellow", true);
        Car car7 = new Car("RR-777-RR", 2018, "yellow", true);
        Car car8 = new Car("RR-888-RR", 2018, "yellow", true);
        Car car9 = new Car("RR-999-RR", 2018, "yellow", true);
        Car car10 = new Car("RR-000-RR", 2018, "yellow", true);
        return new Car[]{car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};
    }
    private static String mapCarToByteView (Car car){
        return "%s%d%s%s".formatted(car.getNumber(), car.getYear(), car.getColor(), car.isActualTechnicalInspection());
    }
}
