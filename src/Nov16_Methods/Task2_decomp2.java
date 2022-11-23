package Nov16_Methods;

import java.util.Scanner;

/*Декомпозировать задачу Nov12_ConditionalConstructs/Task4_Cisla2 ( Scanner sc = new Scanner(System.in);
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
                System.out.println(b + ">" + a);)
  Вынести в отдельный метод метод логику, которая отрабатывает, когда первое число кратно и двум, и трем.
 */
public class Task2_decomp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        if (a % 6 == 0) {
            kratnoe(a, b);
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

    static void kratnoe(int a, int b) {
        double result = Math.pow(a, b);
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            System.out.println("«Результат выражения слишком большой!»");
        } else {
            System.out.println(result);
        }
    }
}
