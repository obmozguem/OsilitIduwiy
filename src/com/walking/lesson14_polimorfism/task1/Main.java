package com.walking.lesson14_polimorfism.task1;

/*Реализуйте класс «Правильная фигура». Для него создайте классы-наследники «Треугольник» и «Квадрат».
Пользователь должен иметь возможность ввести длину стороны и выбрать тип фигуры. Программа должна нарисовать в
консоли выбранную пользователем фигуру, используя символы '-', '|', '/', '\'.
Обратите внимание, символ '\' в Java необходимо экранировать: '\\'.   */

import com.walking.lesson14_polimorfism.task1.model.EquilateralShape;
import com.walking.lesson14_polimorfism.task1.model.EquilateralTriangle;
import com.walking.lesson14_polimorfism.task1.model.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter shape's length: ");
        int length = scanner.nextInt();

        System.out.print("Enter shape's type:\n 1: Square\n 2: Triangle\n");
        int shapeType = scanner.nextInt();

        scanner.close();

//        Корректнее валидировать значение сразу после ввода. Здесь проверка вынесена после
//        ради демонстрации ситуации, когда скобки в условном выражении действительно необходимы
        if (length < 1 || (shapeType != 1 && shapeType != 2)) {
            System.out.println("Incorrect input.");
            return;
        }

        String shapeString = createShapeString(length, shapeType);
        System.out.println(shapeString);
    }

    private static String createShapeString(int length, int type) {
        EquilateralShape shape;

        switch (type) {
            case 1:
                shape = new Square(length);
                break;
            case 2:
                shape = new EquilateralTriangle(length);
                break;
            default:
                return "Unknown shape";
        }

        return shape.createShapeString();
    }
}
