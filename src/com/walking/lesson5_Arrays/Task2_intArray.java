package com.walking.lesson5_Arrays;

/*Создать массив int’ов из 5 элементов. Заполнить его значениями, введенными с клавиатуры. Вывести на экран сумму
каждого значения с предыдущим. Предыдущим значением для 0го элемента считать последнее значение массива.*/

import java.util.Scanner;

public class Task2_intArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i] + array[array.length - 1] + " ");
            } else {
                System.out.print(array[i] + array[i - 1] + " ");
            }
        }
    }
}
