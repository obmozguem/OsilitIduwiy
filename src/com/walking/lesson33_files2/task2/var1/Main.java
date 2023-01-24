package com.walking.lesson33_files2.task2.var1;

/* Реализуйте Задачу 2 из предыдущего урока с использованием FileReader. */

import com.walking.lesson33_files2.model.Car;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static final String CAR_CATALOG_FILE_PATH = "./resource/files/lesson32/task1/carCatalog.txt";

    public static void main(String[] args) {
        String str = readCarCatalog();
        String[] strArray = str.split("\n");
        Car[] cars = new Car[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            cars[i] = parseCar(strArray[i]);
        }
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    private static String readCarCatalog() {
        System.out.println("File reading started");

        File carCatalogFile = new File(CAR_CATALOG_FILE_PATH);
        StringBuilder carsStr = new StringBuilder();
        int i;
        try (FileReader fileReader = new FileReader(carCatalogFile)) {
            while ((i = fileReader.read()) != -1) {
                carsStr.append((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* try (FileReader fileReader = new FileReader(carCatalogFile)) {
            boolean isInputFinished = false;

            while (!isInputFinished) {
                int symbol = fileReader.read();

                if (symbol == -1) {
                    isInputFinished = true;
                } else {
                    carsStr.append((char) symbol);
                } */

        System.out.println("File reading finished");

        return carsStr.toString();
    }

    private static Car parseCar(String strCar) {
        String[] array = strCar.split(";");
        String number = array[0];
        int year = Integer.parseInt(array[1]);
        String color = array[2];
        boolean actualTechnicalInspection = Boolean.parseBoolean(array[3]);
        return new Car(number, year, color, actualTechnicalInspection);
    }
}
