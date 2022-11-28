package com.walking.lesson7;
/*Вычислите факториал введенного с клавиатуры целого числа, используя рекурсивный алгоритм.*/

import java.util.Scanner;

public class Task3_FactorialRecrus {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter number: ");
         int number = sc.nextInt();
         sc.close();
         if (number < 0) {
             System.out.println("The number must be at least 0");
             return;
         }

     }
     static long calculateFactorial(int number) {
         if (number == 0||number == 1) {
             return 1;
         }

         return number * calculateFactorial(number - 1);
     }

}


