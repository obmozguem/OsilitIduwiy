package com.walking.lesson32_files1.task2;

import com.walking.lesson32_files1.task2.model.Car;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static final String CAR_CATALOG_FILE_PATH = "./resource/files/lesson32/task1/carCatalog.txt";

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        try (FileInputStream fin = new FileInputStream(CAR_CATALOG_FILE_PATH)) {
            int i;
            while ((i = fin.read()) != -1) {
                sb.append((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String cars = new String(sb);
        Car[] carsArray = makeCarsArray(cars);
        for (Car car : carsArray) {
            System.out.println(car);
        }
    }

    private static Car[] makeCarsArray(String cars) {
        String[] carSplit = cars.split("\n");
        Car[] carsArray = new Car[carSplit.length];
        for (int i = 0; i < carSplit.length; i++) {
            for (int j = 0; j < 4; j++) {
                String[] array = carSplit[i].split(";");

                String number = array[0].equals("null") ? null : array[0];
                int year = Integer.parseInt(array[1]);
                String color = array[2].equals("null") ? null : array[2];
                boolean actualTechnicalInspection = Boolean.parseBoolean(array[3]);

                Car car = new Car(number, year, color, actualTechnicalInspection);
                carsArray[i] = car;
            }
        }
        return carsArray;
    }
}
