package com.walking.lesson17_Enum.task3;

import java.util.Scanner;

/* Реализуйте класс «Правильная фигура». Для него создайте классы-наследники «Треугольник» и «Квадрат».
Пользователь должен иметь возможность ввести длину стороны и выбрать тип фигуры. Программа должна нарисовать в
консоли выбранную пользователем фигуру, используя символы '-', '|', '/', '\'.
Реализуйте задачу через enum. Пусть EquilateralTriangle и Square будут значениями enum'а EquilateralShape.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter shape's length: ");
        int length = scanner.nextInt();

        System.out.print("Enter shape's type:\n 1: Square\n 2: Triangle\n");
        int shapeType = scanner.nextInt();

        scanner.close();

        if (length < 1 || (shapeType != 1 && shapeType != 2)) {
            System.out.println("Incorrect input.");
            return;
        }

        String shapeString = createShapeString(length, shapeType);
        System.out.println(shapeString);
    }

    private static String createShapeString(int length, int type) {
        EquilateralShape shapeType;

        switch (type) {
            case 1:
                shapeType = EquilateralShape.SQUARE;
                break;
            case 2:
                shapeType = EquilateralShape.EQUILATERAL_TRIANGLE;
                break;
            default:
                return "Unknown shape";
        }

        return shapeType.createShapeString(length);
    }
}
