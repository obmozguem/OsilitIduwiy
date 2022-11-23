package Nov17_Varargs;
/*Вычислить из записать в массив первые 10 простых чисел.

Простое число – положительное целое число, которое делится без остатка лишь на себя и на 1. 1 не является простым числом.

Вывести в консоль сумму всех элементов полученного массива.

Нахождение простых чисел и вычисление суммы реализовать, используя рекурсивные методы.*/

import java.util.Arrays;
import java.util.Scanner;

public class Task5_ProstieCisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some number: ");
        int arrLength = sc.nextInt();
        sc.close();
        int[] primeNumbers = new int[arrLength];
        int index = 0;
        int num = 2;
        while (primeNumbers[arrLength - 1] == 0) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    num++;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers[index] = num;
                index++;
                num++;
            }
        }
        System.out.println(Arrays.toString(primeNumbers));
    }
}
        /*for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }*/

