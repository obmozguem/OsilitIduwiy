package Nov14_Cycles;

import java.util.Scanner;

/*Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа). Нарисовать в консоли заданный
 прямоугольник, используя “-“ и “|”. Углы прямоугольника обозначить символом “ “. Каждая единица длины должна
 обозначаться одним символом “-“, каждая единица ширины – символом “|“.
 */
public class Task3_Pryamougolnik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dlina = sc.nextInt();
        int wirina = sc.nextInt();
        for (int i = 1; i <= wirina + 2; i++) {
            if (i == 1 || i == wirina + 2) {
                for (int j = 1; j <= dlina; j++) {
                    System.out.print("-");
                }
                System.out.println();
            } else {
                for (int k = 1; k <= dlina; k++) {
                    if (k == 1) {
                        System.out.print("|");
                    } else if (k == dlina) {
                        System.out.print("|");
                        System.out.println();
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}
