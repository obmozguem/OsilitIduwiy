package com.walking.lesson10;/*
Вынести строковые и символьные литералы в константы. Попробуйте нарисовать прямоугольник, используя "==" для каждой
единицы длины и "||" – для каждой единицы ширины.
Также попробуйте записать в константу переменную scanner.
Упростится ли использование сканера внутри методов чтения с клавиатуры?
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
                        System.out.print(" ");   */

import java.util.Scanner;

public class Task1_Pryamougolnik {
    public static final String SHIRINA = "||";
    public static final String DLINA = "==";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = requireInt(sc, "Enter rectangle's length: ");
        int width = requireInt(sc, "Enter rectangle's width: ");
        sc.close();
        risovanie(length, width);
    }

    static int requireInt(Scanner sc, String requiringMessage) {
        System.out.print(requiringMessage);
        return sc.nextInt();
    }

    static void risovanie(int dlina, int wirina) {
        for (int i = 1; i <= wirina + 2; i++) {
            if (i == 1 || i == wirina + 2) {
                for (int j = 1; j <= dlina; j++) {
                    System.out.print(DLINA);
                }
                System.out.println();
            } else {
                for (int k = 1; k <= dlina; k++) {
                    if (k == 1) {
                        System.out.print(SHIRINA);
                    } else if (k == dlina) {
                        System.out.print(SHIRINA);
                        System.out.println();
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}
