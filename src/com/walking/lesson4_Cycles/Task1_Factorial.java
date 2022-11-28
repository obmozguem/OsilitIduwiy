package com.walking.lesson4_Cycles;

import java.util.Scanner;
/*Ввести с клавиатуры целое число. Вывести в консоль его факториал.*/

public class Task1_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = 1;
        for (int i = 2; i <= a; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
