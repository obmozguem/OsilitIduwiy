package com.walking.lesson20_exeption.task2;

import com.walking.lesson20_exeption.task2.model.EquilateralShape;
import com.walking.lesson20_exeption.task2.model.EquilateralTriangle;
import com.walking.lesson20_exeption.task2.model.Square;

import java.util.Scanner;

/*Реализуйте любой из вариантов Задачи 1 в уроке 16. При некорректном вводе с клавиатуры выбрасывайте собственное
исключение InputValidationException. Не забудьте указать в описании, какой именно из вводов был некорректен - message
 исключения должен быть информативным. Предка исключения определите самостоятельно.
 */
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
            throw new InputValidationException("Incorrect input");
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
                /* Можно (и даже правильнее) было бы реализовать валидацию и в main().
//                Выброс исключения внутри switch-case выбран только для разнообразия
                throw new InputValidationException("Incorrect shape's type input"); */
        }

        return shape.createShapeString();
    }
}
