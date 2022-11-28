package com.walking.lesson3_ConditionalConstructs;

import java.util.Scanner;
/*Ввести с клавиатуры два целых числа. Если Число1 четное, вывести произведение двух чисел(пр.1)
если нет - частное(пр.2). Также если числа равны - вывести надпись "Числа равны!"

пр1.: "Число1 * Число2 = Произведение", где число1 - значение 1го числа, число2 - значение 2го числа,
Произведение - результат умножения.

пр2.: "Число1 / Число2 = Частное", где число1 - значение 1го числа, число2 - значение 2го числа, Частное -
результат деления. Помните, что результат деления двух целых чисел – тоже целое число.
 */

public class Task1_Cisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a%2==0){
            System.out.println(a*b);
        }
        else if (a==b){
            System.out.println("Числа равны!");
        }
        else {
            System.out.println(a/b);
        }
    }
}
