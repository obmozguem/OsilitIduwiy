package com.walking.lesson4_Cycles;

import java.util.Scanner;
/*Ввести с клавиатуры целое число. Вывести в консоль сумму цифр введенного числа.*/

public class Task2_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = 0;
        int b = a;
        while (true) {
            if (b > 10) {
                result += b % 10;
                b = b / 10;
            } else if (b < 10) {
                result += b;
                break;
            } else {
                result++;
                break;
            }
        }
        System.out.println(result);
    }
}
