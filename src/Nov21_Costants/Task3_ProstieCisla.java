package Nov21_Costants;
/*Используя задачу
Scanner sc = new Scanner(System.in);
        System.out.print("Enter some number more then one: ");
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
1.    Вынесите поиск простых чисел в отдельный класс.

2.    Реализуйте возможность вывода на экран суммы N первых простых чисел, где N – число, введенное пользователем
с клавиатуры;

3.    Вынесите нужные вам переменные в поля класса. Если необходимо – сделайте их константами уровня класса или объекта.
 Помните, константа ссылочного типа гарантирует неизменность ссылки, а не содержимого объекта. Массив – ссылочный тип.

Примечание: это одна задача, а не различные варианты:)

 */

import java.util.Arrays;
import java.util.Scanner;

public class Task3_ProstieCisla {
    static int index =0;
    static int num = 2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some number more then one: ");
        int arrLength = sc.nextInt();
        sc.close();
        int[] primeNumbers = new int[arrLength];
        findPrimeNumbers(primeNumbers);
    }
public static void findPrimeNumbers (int[] primeNumbers) {
    while (primeNumbers[primeNumbers.length-1] == 0) {
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
