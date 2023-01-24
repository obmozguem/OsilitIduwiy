package com.walking.lesson33_files2.task1.var1;

import com.walking.lesson33_files2.model.Car;

import java.io.*;

/* Реализуйте Задачу 1 из предыдущего урока с использованием FileWriter). */

public class Main {
    public static final String CAR_CATALOG_FILE_PATH = "./resource/files/lesson32/task1/carCatalog.txt";

    public static void main(String[] args) {
        Car[] cars = initCars();
        //        Не то, чтобы в этой проверке была явная необходимость в этом задании,
//        но для демонстрации возможностей File пойдет
        File carCatalogFile = new File(CAR_CATALOG_FILE_PATH);
        if (!carCatalogFile.exists() || !carCatalogFile.isFile() || !carCatalogFile.canWrite()) {
            throw new RuntimeException("File %s is not available".formatted(CAR_CATALOG_FILE_PATH));
        }

        System.out.println("File writing started");

        try (FileWriter fileWriter = new FileWriter(CAR_CATALOG_FILE_PATH)) {
            for (Car car : cars) {
                fileWriter.write(mapCarToFileView(car));
                fileWriter.append('\n');
                fileWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException("Error of file writing", e);
        }

        System.out.println("File writing finished");
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

    private static String mapCarToFileView(Car car) {
        return "%s%d%s%s".formatted(car.getNumber(), car.getYear(), car.getColor(), car.isActualTechnicalInspection());
    }

}
