package Nov12_ConditionalConstructs;

import java.util.Scanner;

/*Ввести с клавиатуры два целых числа. Если первое – четное ИЛИ второе – кратно трем,
вывести в консоль результат сравнения этих чисел.
 Если первое число кратно и двум, и трем – вывести на экран число один, возведенное в степень N, где N – второе число.
 Для возведения в степень можно использовать Math.pow(). В случае, если результат выражения выходит за пределы типа int
   (допустимые значения - [-2147483648; 2147483647]) – вывести сообщение «Результат выражения слишком большой!»
Также минимальное и максимальное значение int содержится в константах Integer.MIN_VALUE и Integer.MAX_VALUE
соответственно.
 */
public class Task4_Cisla2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a % 2 == 0 && a % 3 == 0) {
            double result = Math.pow(a, b);
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                System.out.println("«Результат выражения слишком большой!»");
            } else {
                System.out.println(result);
            }
        } else if (a % 2 == 0 || b % 3 == 0) {
            if (a > b) {
                System.out.println(a + ">" + b);
            } else if (a == b) {
                System.out.println(a + "=" + b);
            } else {
                System.out.println(b + ">" + a);
            }
        }
    }

}
